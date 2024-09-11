package com.localbusiness.ecommerce.kafka.order;


import java.math.BigDecimal;

public record Product(
        Integer id,
        String name,
        String description,
        double quantity,
        BigDecimal price
) {
}
