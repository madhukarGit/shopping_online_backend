package com.shoppingonline.controller;

import com.shoppingonline.dto.CustomerDto;
import com.shoppingonline.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("shopping")
public class CustomerController {
    private final CustomerService customerService ;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto){
        CustomerDto savedCustomer = customerService.createCustomer(customerDto);
        return ResponseEntity.ok(savedCustomer);
    }

    @GetMapping
    public ResponseEntity<List<CustomerDto>> fetchAllCustomer(){
        List<CustomerDto> savedCustomer = customerService.findAllCustomers();
        return ResponseEntity.ok(savedCustomer);
    }
}
