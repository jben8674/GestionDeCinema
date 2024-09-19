package com.bengonohugues.notification_service.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

    @Entity
    public class ReservationConfirmation {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true)
        private String reservationCode;

        @Column(nullable = false)
        private String customerName;

        @Column(nullable = false)
        private String status;

        @Column(nullable = false)
        private String email;

        @Column(nullable = true)
        private String phoneNumber;

        // Constructors
        public ReservationConfirmation() {}

        public ReservationConfirmation(String reservationCode, String customerName, String status, String email, String phoneNumber) {
            this.reservationCode = reservationCode;
            this.customerName = customerName;
            this.status = status;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        // Getters and Setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getReservationCode() {
            return reservationCode;
        }

        public void setReservationCode(String reservationCode) {
            this.reservationCode = reservationCode;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }
