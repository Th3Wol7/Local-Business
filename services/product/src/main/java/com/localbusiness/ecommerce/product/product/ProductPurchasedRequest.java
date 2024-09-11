package com.localbusiness.ecommerce.product.product;

import jakarta.validation.constraints.NotNull;

public record ProductPurchasedRequest(
        @NotNull(message = "Product is mandatory")
        Integer productId,

        @NotNull(message = "Quantity is mandatory")
        double quantity
) {
}
