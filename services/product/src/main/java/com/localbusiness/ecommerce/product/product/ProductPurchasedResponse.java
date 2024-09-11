package com.localbusiness.ecommerce.product.product;

import java.math.BigDecimal;

public record ProductPurchasedResponse(
        Integer productId,
        String name,
        String description,
        BigDecimal price,
        double quantity

) {
}
