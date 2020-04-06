package com.train.msscbrewery.web.services;

import com.train.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerByID(UUID id) {
        return CustomerDto.builder().id(UUID.randomUUID()).name("Sharath").build();
    }

    @Override
    public void deleteById(UUID customerId) {
        if(log.isDebugEnabled())
            log.debug("Deleted Id");
        else
            System.out.println("Deleted Id");
    }

    @Override
    public void updateBeer(UUID customerId, CustomerDto customerDto) {
        if(log.isDebugEnabled())
            log.debug("Updated Id");
        else
            System.out.println("Updated Id");
    }

    @Override
    public CustomerDto saveCustomer(CustomerDto customerDto) {
        return CustomerDto.builder().id(UUID.randomUUID()).name(customerDto.getName()).build();
    }
}
