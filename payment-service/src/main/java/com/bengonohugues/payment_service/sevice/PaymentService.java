package com.bengonohugues.payment_service.sevice;




import com.bengonohugues.payment_service.dto.PaymentDTO;
import com.bengonohugues.payment_service.model.Payment;
import com.bengonohugues.payment_service.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;

    public Payment createPayment(PaymentDTO paymentDTO) {
        Payment payment = new Payment();
        payment.setTransactionId(paymentDTO.getTransactionId());
        payment.setAmount(paymentDTO.getAmount());
        payment.setCurrency(paymentDTO.getCurrency());
        payment.setStatus("PENDING"); // Initialiser l'état par défaut

        return paymentRepository.save(payment);
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id).orElse(null);

    }


    // Méthode pour supprimer un paiement
    public boolean deletePayment(Long id) {
        if (paymentRepository.existsById(id)) {
            paymentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

