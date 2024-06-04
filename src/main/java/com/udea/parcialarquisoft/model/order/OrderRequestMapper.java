package com.udea.parcialarquisoft.model.order;

public class OrderRequestMapper {

    private OrderRequest orderRequest;

    private OrderRequestMapper(){

    }

    public static OrderRequestMapper builder(){
        return new OrderRequestMapper();
    }

    public OrderRequestMapper withOrderRequest(OrderRequest orderRequest){
        this.orderRequest = orderRequest;
        return this;
    }

    public Order mapToModel(){
        return new Order(orderRequest.getProductName(), orderRequest.getDate(), orderRequest.getPrice(), orderRequest.getDescription(), orderRequest.getQuantity());
    }
    
}
