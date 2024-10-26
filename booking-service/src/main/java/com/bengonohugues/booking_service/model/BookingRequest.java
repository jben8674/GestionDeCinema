package com.bengonohugues.booking_service.model;

import java.util.List;

public class BookingRequest {
    private Long userId;
    private Long movieId;
    private Long reservationId;
    private List<String> seats;
    private double montant;
    private String paymentMethod;

    // Constructeurs, getters et setters
    public BookingRequest() {}

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public List<String> getSeats() {
        return seats;
    }

    public void setSeats(List<String> seats) {
        this.seats = seats;
    }

    public double getMontant() {
        return montant;
    }

    public void setAmount(double montant) {
        this.montant = montant;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }
}