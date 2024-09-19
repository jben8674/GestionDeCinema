package com.bengonohugues.notification_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import java.time.LocalDateTime;

@Entity
public class PaymentNotification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String status;
    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private String recipientEmail;

    @Column(nullable = false)
    private String paymentReference;

    @Column(nullable = false)
    private double amount;

    @Column(nullable = false)
    private LocalDateTime paymentDate;

    @Column(nullable = false)
    private boolean isSent;

    // Constructors
    public PaymentNotification() {}

    public PaymentNotification(String message, String recipientEmail, String paymentReference, double amount, LocalDateTime paymentDate, boolean isSent) {
        this.message = message;
        this.recipientEmail = recipientEmail;
        this.paymentReference = paymentReference;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.isSent = isSent;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRecipientEmail() {
        return recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public String getPaymentReference() {
        return paymentReference;
    }

    public void setPaymentReference(String paymentReference) {
        this.paymentReference = paymentReference;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public boolean isSent() {
        return isSent;
    }

    public void setSent(boolean sent) {
        isSent = sent;
    }

    public String getStatus() {
        return status;
    }

}
