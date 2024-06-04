package com.udea.parcialarquisoft.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.AccessLevel;
import lombok.Data;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    
    @Column(nullable = false, length = 250)
    String name;

    @Column(nullable = false, length = 150, unique = true)
    String email;

    @Column(nullable = false, length = 100)
    String phone;

    @Column(nullable = false, length = 100)
    String address;


    
}
