package com.udea.parcialarquisoft.model.order;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderRequest {

    @JsonProperty("product_name")
    String productName;

    LocalDate date;

    Double price;

    String description;

    Integer quantity;

    @JsonProperty("customer_id")
    Long customerId;
    
}
