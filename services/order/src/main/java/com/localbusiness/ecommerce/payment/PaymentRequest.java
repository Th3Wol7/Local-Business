package com.localbusiness.ecommerce.payment;

import com.localbusiness.ecommerce.customer.CustomerResponse;
import com.localbusiness.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
