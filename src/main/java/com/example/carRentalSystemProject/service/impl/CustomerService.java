package com.example.carRentalSystemProject.service.impl;

import com.example.carRentalSystemProject.model.Customer;
import com.example.carRentalSystemProject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements com.example.carRentalSystemProject.service.CustomerService {
   @Autowired
    private CustomerRepository customerRepository;
    @Override
    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }
}
