package com.bengonohugues.booking_service.model;

    public class PaymentRequest {
        private Long reservationId;
        private double montant;
        private String paymentMethod;

        // Constructeurs, getters et setters
        public PaymentRequest() {}

        public PaymentRequest(Long reservationId, double montant, String paymentMethod) {
            this.reservationId = reservationId;
            this.montant = montant;
            this.paymentMethod = paymentMethod;
        }

        public Long getReservationId() {
            return reservationId;
        }

        public void setReservationId(Long reservationId) {
            this.reservationId = reservationId;
        }

        public double getMontant() {
            return montant;
        }

        public void setMontant(double montant) {
            this.montant = montant;
        }

        public String getPaymentMethod() {
            return paymentMethod;
        }

        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }
    }

