package com.bengonohugues.payment_service.controller;


import com.bengonohugues.payment_service.model.Payment;
import com.bengonohugues.payment_service.model.PaymentResponse;
import com.bengonohugues.payment_service.sevice.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public PaymentResponse processPayment(@RequestBody Payment payment) {
        return paymentService.processPayment(payment);
    }

    @GetMapping("/{id}")
    public PaymentResponse getPaymentStatus(@PathVariable Long id) {
        return paymentService.getPaymentStatus(id);
    }
@GetMapping("/history")
    public List<Payment> getPaymentHistory(){
        return paymentService.getPaymentHistory();
    }
}