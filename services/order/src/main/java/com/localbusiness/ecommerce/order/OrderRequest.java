package com.localbusiness.ecommerce.order;

import com.localbusiness.ecommerce.product.PurchaseRequest;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

import java.math.BigDecimal;
import java.util.List;

public record OrderRequest(
        Integer id,
        String reference,

        @Positive(message = "Order amount should be positive")
        BigDecimal amount,

        @NotNull(message = "Payment method should be precised")
        PaymentMethod paymentMethod,
        @NotNull(message = "Customer method should be precised")
        @NotEmpty(message = "Customer ID should be present")
        @NotBlank(message = "Customer ID should be present")
        String customerId,

        @NotEmpty(message = "You Should at least purchase one product")
        List<PurchaseRequest> products
) {
}
