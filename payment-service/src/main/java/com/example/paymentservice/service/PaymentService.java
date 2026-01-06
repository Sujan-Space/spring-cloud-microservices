package com.example.paymentservice.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public String processPayment(String orderId, double amount) {
        return "PAYMENT_SUCCESS for order " + orderId + " amount " + amount;
    }
}
