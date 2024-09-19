package com.bengonohugues.movies_service.dto;

import java.time.LocalDateTime;

public class BookingDto {

        private Long id;
        private String customerName;
        private LocalDateTime bookingDateTime;
        private String roomType;

        // Getters et Setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public LocalDateTime getBookingDateTime(Object bookingDate) {
            return bookingDateTime;
        }

        public void setBookingDateTime(LocalDateTime bookingDateTime) {
            this.bookingDateTime = bookingDateTime;
        }

        public String getRoomType() {
            return roomType;
        }

        public void setRoomType(String roomType) {
            this.roomType = roomType;
        }
    }




