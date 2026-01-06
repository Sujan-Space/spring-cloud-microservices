package com.example.paymentservice.controller;

import com.example.paymentservice.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/process/{orderId}")
    public String processPayment(@PathVariable String orderId,
                                 @RequestParam double amount) {
        return paymentService.processPayment(orderId, amount);
    }
}
