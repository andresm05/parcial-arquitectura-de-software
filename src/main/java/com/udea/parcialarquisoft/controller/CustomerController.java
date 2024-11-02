package com.udea.parcialarquisoft.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udea.parcialarquisoft.model.Customer;
import com.udea.parcialarquisoft.service.CustomerService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/customer")
@Tag(name = "Customer", description = "API to manage customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    // Save a new customer
    @Operation(summary = "Save a new customer")
    @PostMapping
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Customer created", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Customer.class))
            }),
    })
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }

    // Find all customers
    @Operation(summary = "Find all customers")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Customers found", content = {
                    @Content(mediaType = "application/json", schema = @Schema(implementation = Customer.class))
            }),
            @ApiResponse(responseCode = "404", description = "Customers not found", content = @Content)
    })
    @GetMapping
    public ResponseEntity<List<Customer>> findAllCustomers() {
        return new ResponseEntity<>(customerService.findAllCustomers(), HttpStatus.OK);
    }

}
