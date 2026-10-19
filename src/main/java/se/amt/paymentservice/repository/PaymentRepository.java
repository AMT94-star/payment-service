package se.amt.paymentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import se.amt.paymentservice.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
