package com.udea.parcialarquisoft.model.order;


import java.time.LocalDate;

import com.udea.parcialarquisoft.model.Customer;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "orders")
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Order {

    public Order(String productName, LocalDate date, Double price, String description, Integer quantity) {
        this.productName = productName;
        this.date = date;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(nullable = false, length = 250, name = "product_name")
    String productName;

    @Column(nullable = false)
    LocalDate date;

    @Column(nullable = false)
    Double price;

    @Column(length = 250)
    String description;

    @Column(nullable = false)
    Integer quantity;
    
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    Customer customer;

}
