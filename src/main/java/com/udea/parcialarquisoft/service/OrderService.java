package com.udea.parcialarquisoft.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.udea.parcialarquisoft.model.Customer;
import com.udea.parcialarquisoft.model.order.Order;
import com.udea.parcialarquisoft.model.order.OrderRequest;
import com.udea.parcialarquisoft.model.order.OrderRequestMapper;
import com.udea.parcialarquisoft.repository.CustomerRespository;
import com.udea.parcialarquisoft.repository.OrderRepository;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository orderRepository;
    private final CustomerRespository customerRepository;

    // Save a new order
    public Order saveOrder(OrderRequest orderRequest) {
        Order order = OrderRequestMapper.builder().withOrderRequest(orderRequest).mapToModel();

        // Find the customer by id
        Customer customer = customerRepository.findById(orderRequest.getCustomerId())
                .orElseThrow(() -> new RuntimeException("Customer not found"));
        order.setCustomer(customer);
        return orderRepository.save(order);
    }

    // Find an order by id
    public Order findOrderById(Long id) {
        return orderRepository.findById(id).orElseThrow(() -> new RuntimeException("Order not found"));
    }

    // Find all orders
    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }
}
