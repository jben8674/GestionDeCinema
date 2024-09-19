package com.bengonohugues.payment_service.controller;



import com.bengonohugues.payment_service.dto.PaymentDTO;
import com.bengonohugues.payment_service.model.Payment;
import com.bengonohugues.payment_service.sevice.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public ResponseEntity<Payment> createPayment(@RequestBody PaymentDTO paymentDTO) {
        Payment payment = paymentService.createPayment(paymentDTO);
        return new ResponseEntity<>(payment, HttpStatus.CREATED);
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }


    // Endpoint DELETE pour supprimer un paiement par ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayment(@PathVariable Long id) {
        boolean isDeleted = paymentService.deletePayment(id);
        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // 204 No Content
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404 Not Found
        }




    }
}
