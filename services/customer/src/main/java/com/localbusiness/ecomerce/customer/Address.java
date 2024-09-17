package com.localbusiness.ecomerce.customer;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.validation.annotation.Validated;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document
@Builder
@Validated
public class Address {
    private String street;
    private String houseNumber;
    private String zipCode;



}
