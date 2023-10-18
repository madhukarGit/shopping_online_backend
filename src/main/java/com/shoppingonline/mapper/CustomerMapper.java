package com.shoppingonline.mapper;

import com.shoppingonline.domain.Customer;
import com.shoppingonline.dto.CustomerDto;

public class CustomerMapper {

    public static Customer mapToCustomer(CustomerDto customerDto){
        return Customer.builder()
                .firstName(customerDto.getFirstName())
                .email(customerDto.getEmail())
                .customerId(customerDto.getCustomerId())
                .lastName(customerDto.getLastName())
                .image(customerDto.getImage()).build();

    }

    public static CustomerDto mapToCustomerDto(Customer customer){
        return new CustomerDto(customer.getCustomerId(),
                customer.getFirstName(),customer.getLastName(), customer.getEmail(),
                customer.getImage());
    }
}
