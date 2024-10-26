package com.bengonohugues.payment_service.model;


    import java.time.LocalDateTime;

    public class PaymentResponse {
        private Long id;
        private double montant;
        private LocalDateTime datePaiement;
        private StatutPaiement statut;
        private String methodePaiement;

        public enum StatutPaiement {
            EN_ATTENTE, REUSSI, ECHOUE, REMBOURSE
        }

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

        public StatutPaiement getStatut() {
            return statut;
        }

        public void setStatut(StatutPaiement statut) {
            this.statut = statut;
        }

        public String getMethodePaiement() {
            return methodePaiement;
        }

        public void setMethodePaiement(String methodePaiement) {
            this.methodePaiement = methodePaiement;
        }
    }

