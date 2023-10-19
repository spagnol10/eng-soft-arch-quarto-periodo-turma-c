package org.acme.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.model.PaymentBoleto;

import java.util.List;

@ApplicationScoped
public class PaymentRepository implements PanacheRepositoryBase<PaymentBoleto, Long> {
    public PaymentBoleto persistPayment(PaymentBoleto paymentBoleto) {
        paymentBoleto.persist();

        return paymentBoleto;
    }

    public List<PaymentBoleto> listAllPayments() {
        return listAll();
    }

    public PaymentBoleto findPaymentById(String id) {
        return find("id", Long.parseLong(id)).firstResult();
    }

    public int updatePayment(String id) {
        return update("receipt = 'Wellynton Spagnol' where id = ?1", Long.parseLong(id));
    }

    public Long deletePayment(String id) {
        return delete("id", Long.parseLong(id));
    }
}
