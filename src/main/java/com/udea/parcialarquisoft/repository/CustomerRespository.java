package com.udea.parcialarquisoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udea.parcialarquisoft.model.Customer;

@Repository
public interface CustomerRespository extends JpaRepository<Customer, Long>{
    
    Customer findByEmail(String email);
}
