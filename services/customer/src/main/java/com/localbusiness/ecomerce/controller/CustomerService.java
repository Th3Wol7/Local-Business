package com.localbusiness.ecomerce.controller;

import com.ctc.wstx.util.StringUtil;
import com.localbusiness.ecomerce.customer.Customer;
import com.localbusiness.ecomerce.exception.CustomerNotFoundException;
import lombok.RequiredArgsConstructor;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final CustomerRepository repository;
    private final CustomerMapper mapper;
    public String createCustomer(CustomerRequest request) {
        var customer = repository.save(mapper.toCustomer(request));
        return customer.getId();
    }

    public void updateCustomer(CustomerRequest request) {
        var customer = repository.findById(request.id())
                .orElseThrow(() -> new CustomerNotFoundException(
                        String.format("Cannot update customer:: No customer found with ID:: %s", request.id())
                ));
        //to ensure we don't overwrite something we shouldn't
        mergeCustomer(customer, request);
        repository.save(customer);
    }

    private void mergeCustomer(Customer customer, CustomerRequest request) {
       if(StringUtils.isNotBlank(request.firstname())){
           customer.setFirstname(request.firstname());
       }
       if(StringUtils.isNotBlank(request.lastname())){
           customer.setLastname(request.lastname());
       }
       if(StringUtils.isNotBlank(request.email())){
           customer.setEmail(request.email());
       }
       if(request.address() != null){
           customer.setAddress(request.address());
       }
    }
}
