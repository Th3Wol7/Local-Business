package com.localbusiness.ecomerce.controller;

import com.localbusiness.ecomerce.customer.Address;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public record CustomerRequest(
        String id,
        @NotNull(message = "Customer firstname is required")
        String firstname,
        @NotNull(message = "Customer lastname is required")
        String lastname,
        @Email(message = "Customer email is not valid")
        String email,
        Address address
) {
}
