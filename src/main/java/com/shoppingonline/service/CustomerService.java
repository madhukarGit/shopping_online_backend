package com.shoppingonline.service;

import com.shoppingonline.dto.CustomerDto;

import java.util.List;

public interface CustomerService {
    CustomerDto createCustomer(CustomerDto customerDto);
    List<CustomerDto> findAllCustomers();
}
