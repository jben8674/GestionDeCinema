package com.bengonohugues.notification_service.controller;

import com.bengonohugues.notification_service.model.PaymentNotification;
import com.bengonohugues.notification_service.model.ReminderNotification;
import com.bengonohugues.notification_service.model.ReservationConfirmation;
import com.bengonohugues.notification_service.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/reservation")
    public ResponseEntity<String> sendReservationConfirmation(@RequestBody ReservationConfirmation confirmation) {
        notificationService.sendReservationConfirmation(confirmation);
        return ResponseEntity.ok("Confirmation de réservation envoyée.");
    }

    @PostMapping("/payment")
    public ResponseEntity<String> sendPaymentNotification(@RequestBody PaymentNotification notification) {
        notificationService.sendPaymentNotification(notification);
        return ResponseEntity.ok("Notification de paiement envoyée.");
    }

    @PostMapping("/reminder")
    public ResponseEntity<String> sendReminder(@RequestBody ReminderNotification reminder) {
        notificationService.sendReminder(reminder);
        return ResponseEntity.ok("Rappel envoyé.");
    }
}