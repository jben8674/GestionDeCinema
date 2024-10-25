package com.bengonohugues.payment_service.sevice;

import com.bengonohugues.payment_service.model.Payment;
import com.bengonohugues.payment_service.model.PaymentResponse;
import com.bengonohugues.payment_service.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    public PaymentResponse processPayment(Payment payment) {
        // Enregistrer le paiement dans la base de données
        Payment savedPayment = paymentRepository.save(payment);

        // Créer une réponse de paiement
        PaymentResponse response = new PaymentResponse();
        response.setId(savedPayment.getId());
        response.setMontant(savedPayment.getMontant());
        response.setDatePaiement(savedPayment.getDatePaiement());
        response.setStatut(PaymentResponse.StatutPaiement.REUSSI); // Simuler un statut réussi
        response.setMethodePaiement(savedPayment.getMethodePaiement());
        return response;
    }

    public PaymentResponse getPaymentStatus(Long id) {
        // Récupérer le paiement depuis la base de données
        Payment payment = paymentRepository.findById(id).orElse(null);
        PaymentResponse response = new PaymentResponse();

        if (payment != null) {
            response.setId(payment.getId());
            response.setMontant(payment.getMontant());
            response.setDatePaiement(payment.getDatePaiement());
            response.setStatut(PaymentResponse.StatutPaiement.REUSSI); // Simuler un statut réussi
            response.setMethodePaiement(payment.getMethodePaiement());
        } else {
            response.setStatut(PaymentResponse.StatutPaiement.ECHOUE); // Statut échoué si pas trouvé
        }
        return response;
    }

    public List<Payment> getPaymentHistory(){
        return paymentRepository.findAll();
    }
}
