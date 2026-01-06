package com.example.paymentservice.model;

public class Payment {
    private String paymentId;
    private String orderId;
    private double amount;
    private String status;
    private String transactionDate;
    
    public Payment() {
    }
    
    public Payment(String paymentId, String orderId, double amount, String status, String transactionDate) {
        this.paymentId = paymentId;
        this.orderId = orderId;
        this.amount = amount;
        this.status = status;
        this.transactionDate = transactionDate;
    }
    
    // Getters and Setters
    public String getPaymentId() {
        return paymentId;
    }
    
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    
    public String getOrderId() {
        return orderId;
    }
    
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    
    public double getAmount() {
        return amount;
    }
    
    public void setAmount(double amount) {
        this.amount = amount;
    }
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getTransactionDate() {
        return transactionDate;
    }
    
    public void setTransactionDate(String transactionDate) {
        this.transactionDate = transactionDate;
    }
    
    @Override
    public String toString() {
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", amount=" + amount +
                ", status='" + status + '\'' +
                ", transactionDate='" + transactionDate + '\'' +
                '}';
    }
}