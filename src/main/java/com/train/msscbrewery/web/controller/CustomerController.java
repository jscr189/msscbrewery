package com.train.msscbrewery.web.controller;

import com.train.msscbrewery.web.model.BeerDto;
import com.train.msscbrewery.web.model.CustomerDto;
import com.train.msscbrewery.web.services.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping({"/{custId}"})
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID custId)
    {
        return new ResponseEntity<>(customerService.getCustomerByID(custId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveBeer(@RequestBody CustomerDto customerDto)
    {
        CustomerDto savedCustomer=customerService.saveCustomer(customerDto);

        HttpHeaders headers=new HttpHeaders();
        headers.add("Location","/api/v1/customer/"+savedCustomer.getId());

        return new ResponseEntity(headers,HttpStatus.CREATED);
    }

    @PutMapping({"/{customerId}"})
    public ResponseEntity handleUpdate(@PathVariable("customerId") UUID customerId, CustomerDto customerDto)
    {

        customerService.updateBeer(customerId,customerDto);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"/{customerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable("customerId") UUID customerId)
    {
        customerService.deleteById(customerId);
    }
}
