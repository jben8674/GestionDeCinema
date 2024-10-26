package com.bengonohugues.booking_service.controller;


import com.bengonohugues.booking_service.model.Booking;
import com.bengonohugues.booking_service.model.BookingRequest;
import com.bengonohugues.booking_service.service.BookingService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/api/bookings")
@Tag(name = "Bookings", description = "API pour la gestion des réservations")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public Booking reserveSeat(@RequestBody BookingRequest bookingRequest) {
        return bookingService.reserveSeat(bookingRequest);

    }
}