package com.bengonohugues.booking_service.service;

import com.bengonohugues.booking_service.model.Booking;
import com.bengonohugues.booking_service.repository.BookingRepository;
import com.example.booking.dto.BookingDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<com.example.booking.dto.BookingDTO> getAllBookings() {
        return (List<com.example.booking.dto.BookingDTO>) bookingRepository.findAll().stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    public Optional<com.example.booking.dto.BookingDTO> getBookingById(Long id) {
        return bookingRepository.findById(id).map(this::convertToDTO);
    }

    private Object convertToDTO(Object o) {
        return o;
    }

    public BookingDTO saveBooking(BookingDTO bookingDTO) {
        Booking booking = convertToEntity(bookingDTO);
        Booking savedBooking = (Booking) bookingRepository.save(booking);
        return convertToDTO(savedBooking);
    }

    private Booking convertToEntity(com.example.booking.dto.BookingDTO bookingDTO) {
        return null;
    }

    public void deleteBooking(Long id) {
        bookingRepository.deleteById(id);
    }

    private BookingDTO convertToDTO(Booking booking) {
        BookingDTO dto = new BookingDTO();
        dto.setId(booking.getId());
        dto.setCustomerName(booking.getCustomerName());
        dto.getBookingDateTime(booking.getBookingDate());
        dto.setRoomType(booking.getRoomType());
        return dto;
    }

    }

