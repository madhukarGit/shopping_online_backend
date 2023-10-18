package com.shoppingonline.service.impl;

import com.shoppingonline.domain.Customer;
import com.shoppingonline.dto.CustomerDto;
import com.shoppingonline.mapper.CustomerMapper;
import com.shoppingonline.repository.CustomerRepository;
import com.shoppingonline.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public CustomerDto createCustomer(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(customerDto);
        Customer createdCustomer = customerRepository.save(customer);
        return CustomerMapper.mapToCustomerDto(createdCustomer);
    }

    @Override
    public List<CustomerDto> findAllCustomers() {
        return customerRepository.findAll()
                .stream()
                .map(CustomerMapper::mapToCustomerDto)
                .toList();
    }
}
