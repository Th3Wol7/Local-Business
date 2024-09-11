package com.localbusiness.ecommerce.kafka;

import com.localbusiness.ecommerce.customer.CustomerResponse;
import com.localbusiness.ecommerce.order.PaymentMethod;
import com.localbusiness.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
