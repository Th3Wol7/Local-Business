package com.localbusiness.ecommerce.order;

import com.localbusiness.ecommerce.customer.CustomerClient;
import com.localbusiness.ecommerce.exception.BusinessException;
import com.localbusiness.ecommerce.kafka.OrderConfirmation;
import com.localbusiness.ecommerce.kafka.OrderProducer;
import com.localbusiness.ecommerce.orderline.OrderLineRequest;
import com.localbusiness.ecommerce.orderline.OrderLineService;
import com.localbusiness.ecommerce.payment.PaymentClient;
import com.localbusiness.ecommerce.payment.PaymentRequest;
import com.localbusiness.ecommerce.product.ProductClient;
import com.localbusiness.ecommerce.product.PurchaseRequest;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class OrderService {
    private final OrderRepository repository;
    private final CustomerClient customerClient;
    private final ProductClient productClient;
    private final OrderMapper mapper;
    private final OrderLineService orderLineService;
    private final OrderProducer orderProducer;
    private final PaymentClient paymentClient;

    public Integer createOrder(OrderRequest request) {
        //Check if customer exist
        var customer = this.customerClient.findCustomerById(request.customerId())
                .orElseThrow(() -> new BusinessException("Cannot Create Order:: No Customer exists with the provided Id"));

        //Purchase the product --> product microservice (Using RestTemplate)
        var purchasedProducts = this.productClient.purchasedProducts(request.products());

        //Persist order
        var order = this.repository.save(mapper.toOrder(request));

        for (PurchaseRequest purchaseRequest : request.products()) {
            orderLineService.saveOrderLine(
                    new OrderLineRequest(
                            null,
                            order.getId(),
                            purchaseRequest.productId(),
                            purchaseRequest.quantity()
                    )
            );
        }
        //persist order lines
        //start payment process
        var paymentRequest = new PaymentRequest(
            request.amount(),
            request.paymentMethod(),
            order.getId(),
            order.getReference(),
            customer
        );

        paymentClient.requestOrderPayment(paymentRequest);

        orderProducer.sendOrderConfirmation(
                new OrderConfirmation(
                        request.reference(),
                        request.amount(),
                        request.paymentMethod(),
                        customer,
                        purchasedProducts
                )
        );
        //send order confirmation --> notification microservice (Kafka)
        return order.getId();
    }

    public List<OrderResponse> findAll(){
        return repository.findAll()
                .stream()
                .map(mapper::fromOrder)
                .collect(Collectors.toList());
    }

    public OrderResponse findById(Integer orderId) {
        return repository.findById(orderId)
                .map(mapper::fromOrder)
                .orElseThrow(() -> new EntityNotFoundException(String.format("No order found with the provided ID: %d", orderId)));
    }
}
