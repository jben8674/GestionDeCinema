package com.bengonohugues.notification_service.repository;

import com.bengonohugues.notification_service.model.ReservationConfirmation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationConfirmationRepository extends JpaRepository<ReservationConfirmation, Long> {
    // Vous pouvez ajouter des méthodes de recherche personnalisées si nécessaire
}
