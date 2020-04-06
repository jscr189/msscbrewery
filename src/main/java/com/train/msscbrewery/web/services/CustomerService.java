package com.train.msscbrewery.web.services;

import com.train.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerByID(UUID id);

    void deleteById(UUID customerId);

    void updateBeer(UUID customerId, CustomerDto customerDto);

    CustomerDto saveCustomer(CustomerDto customerDto);
}
