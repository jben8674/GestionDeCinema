package com.bengonohugues.booking_service.service;

import com.bengonohugues.booking_service.model.Booking;
import com.bengonohugues.booking_service.model.BookingRequest;
import com.bengonohugues.booking_service.model.PaymentRequest;
import com.bengonohugues.booking_service.model.PaymentResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookingService {

    @Autowired
    private RestTemplate restTemplate;

    private final String MOVIE_SERVICE_URL = "http://localhost:5011/api/movies/";
    private final String PAYMENT_SERVICE_URL = "http://localhost:5008/payment";

    public Booking reserveSeat(BookingRequest bookingRequest) {
        // Vérifier la disponibilité des sièges en appelant le Movies Service
        String movieServiceResponse = restTemplate.getForObject(MOVIE_SERVICE_URL + bookingRequest.getMovieId(), String.class);

        // Logique de réservation de siège ici (vérification, etc.)

        // Appel au Payment Service pour traiter le paiement
        PaymentRequest paymentRequest = new PaymentRequest(bookingRequest.getReservationId(), bookingRequest.getMontant(), bookingRequest.getPaymentMethod());
         PaymentResponse paymentResponse = restTemplate.postForObject(PAYMENT_SERVICE_URL, paymentRequest, PaymentResponse.class);

        // Création de la réservation
        Booking reservation = new Booking();
        reservation.setId(bookingRequest.getReservationId());
        reservation.setUserId(bookingRequest.getUserId());
        reservation.setMovieId(bookingRequest.getMovieId());
        reservation.setSeats(bookingRequest.getSeats());
        reservation.setTotalAmount(bookingRequest.getMontant());

        return reservation;
    }
}