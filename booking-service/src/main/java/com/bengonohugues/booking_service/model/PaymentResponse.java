package com.bengonohugues.booking_service.model;

import java.time.LocalDateTime;

public class PaymentResponse {
    private Long id;
    private double montant;
    private LocalDateTime datePaiement;

    private String methodePaiement;

    // Constructeurs, getters et setters
    public PaymentResponse() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public LocalDateTime getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(LocalDateTime datePaiement) {
        this.datePaiement = datePaiement;
    }





    public String getMethodePaiement() {
        return methodePaiement;
    }

    public void setMethodePaiement(String methodePaiement) {
        this.methodePaiement = methodePaiement;
    }
}