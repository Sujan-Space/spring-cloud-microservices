package com.example.orderservice.service;

import com.example.orderservice.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {

    private List<Order> orders = new ArrayList<>();

    @Autowired
    private WebClient.Builder webClientBuilder;

    public Order createOrder(Order order) {
        order.setOrderId(UUID.randomUUID().toString());
        orders.add(order);

        String paymentResponse = webClientBuilder.build()
                .get()
                .uri("http://payment-service/api/payments/process/"
                        + order.getOrderId()
                        + "?amount=" + (order.getPrice() * order.getQuantity()))
                .retrieve()
                .bodyToMono(String.class)
                .block();

        order.setPaymentStatus(paymentResponse);
        return order;
    }

    public List<Order> getAllOrders() {
        return orders;
    }

    public Optional<Order> getOrderById(String orderId) {
        return orders.stream()
                .filter(order -> order.getOrderId().equals(orderId))
                .findFirst();
    }

    public String deleteOrder(String orderId) {
        boolean removed = orders.removeIf(order -> order.getOrderId().equals(orderId));
        return removed ? "Order deleted successfully" : "Order not found";
    }
}
