package com.udea.parcialarquisoft.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.udea.parcialarquisoft.model.Customer;
import com.udea.parcialarquisoft.repository.CustomerRespository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRespository customerRepository;

    // Save a new customer
    public Customer saveCustomer( Customer customer){
        if(customerRepository.findByEmail(customer.getEmail()) != null){
            throw new RuntimeException("Customer already exists with email: " + customer.getEmail() + " ");
        }
        return customerRepository.save(customer);
    }

    // Find all customers
    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }

    


    
}
