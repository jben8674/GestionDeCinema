package com.bengonohugues.payment_service.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "payment") // Explicitly mapping to the table
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "id_reservation")
    private Long idReservation;

    @Column(name = "montant")
    private double montant;

    @Column(name = "methode_paiement")
    private String methodePaiement;

    @Column(name = "date_paiement")
    private LocalDateTime datePaiement;

    // Constructors, getters, and setters
    public Payment() {}

    public Payment(Long idReservation, double montant, String methodePaiement) {
        this.idReservation = idReservation;
        this.montant = montant;
        this.methodePaiement = methodePaiement;
        this.datePaiement = LocalDateTime.now(); // Enregistrement de la date de paiement
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Long idReservation) {
        this.idReservation = idReservation;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getMethodePaiement() {
        return methodePaiement;
    }

    public void setMethodePaiement(String methodePaiement) {
        this.methodePaiement = methodePaiement;
    }

    public LocalDateTime getDatePaiement() {
        return datePaiement;
    }

    public void setDatePaiement(LocalDateTime datePaiement) {
        this.datePaiement = datePaiement;
    }
}
