package com.localbusiness.ecomerce.controller;

import com.localbusiness.ecomerce.customer.Address;

public record CustomerResponse(
       String id,
       String firstname,
       String lastname,
       String email,
        Address address
) {
}
