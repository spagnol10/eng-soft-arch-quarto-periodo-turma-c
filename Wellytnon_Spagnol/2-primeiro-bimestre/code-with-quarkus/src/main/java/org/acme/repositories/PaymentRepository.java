package org.acme.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.model.Payment;

import java.util.List;

@ApplicationScoped
public class PaymentRepository implements PanacheRepositoryBase<Payment, Long> {
    public Payment persistPayment(Payment payment) {
        payment.persist();

        return payment;
    }

    public List<Payment> listAllPayments() {
        return listAll();
    }

    public Payment findPaymentById(String id) {
        return find("id", Long.parseLong(id)).firstResult();
    }

    public int updatePayment(String id) {
        return update("receipt = 'Wellynton Spagnol' where id = ?1", Long.parseLong(id));
    }

    public Long delete(String id) {
        return delete("id", Long.parseLong(id));
    }
}
