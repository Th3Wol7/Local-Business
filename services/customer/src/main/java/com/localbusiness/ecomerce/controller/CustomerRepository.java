package com.localbusiness.ecomerce.controller;

import com.localbusiness.ecomerce.customer.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
