package com.bengonohugues.notification_service.service;


import com.bengonohugues.notification_service.model.PaymentNotification;
import com.bengonohugues.notification_service.model.ReminderNotification;
import com.bengonohugues.notification_service.model.ReservationConfirmation;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public void sendReservationConfirmation(ReservationConfirmation confirmation) {
        // Logique pour envoyer la confirmation de réservation
        System.out.println("Envoi de la confirmation de réservation : " + confirmation.getId());
        // Implémentation d'envoi par e-mail, SMS, etc.
    }

    public void sendPaymentNotification(PaymentNotification notification) {
        // Logique pour envoyer la notification de paiement
        System.out.println("Envoi de la notification de paiement : " + notification.getId() + " - Statut : " + notification.getStatus());
        // Implémentation d'envoi par e-mail, SMS, etc.
    }

    public void sendReminder(ReminderNotification reminder) {
        // Logique pour envoyer le rappel
        System.out.println("Envoi du rappel : " + reminder.getId());
        // Implémentation d'envoi par e-mail, SMS, etc.
    }
}
