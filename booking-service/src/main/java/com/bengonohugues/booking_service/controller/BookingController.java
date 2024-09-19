package com.bengonohugues.booking_service.controller;




import com.bengonohugues.booking_service.service.BookingService;
import com.example.booking.dto.BookingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<BookingDTO> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public ResponseEntity<com.example.booking.dto.BookingDTO> getBookingById(@PathVariable Long id) {
        Optional<com.example.booking.dto.BookingDTO> booking = bookingService.getBookingById(id);
        return booking.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<com.example.booking.dto.BookingDTO> createBooking(@RequestBody com.example.booking.dto.BookingDTO bookingDTO) {
        com.example.booking.dto.BookingDTO createdBooking = bookingService.saveBooking(bookingDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdBooking);
    }

    @PutMapping("/{id}")
    public ResponseEntity<com.example.booking.dto.BookingDTO> updateBooking(@PathVariable Long id, @RequestBody com.example.booking.dto.BookingDTO bookingDTO) {
        bookingDTO.setId(id);
        com.example.booking.dto.BookingDTO updatedBooking = bookingService.saveBooking(bookingDTO);
        return ResponseEntity.ok(updatedBooking);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBooking(@PathVariable Long id) {
        bookingService.deleteBooking(id);
        return ResponseEntity.noContent().build();
    }
}
