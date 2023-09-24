package edu.fag.dao;

import edu.fag.model.History;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

import java.util.List;

@ApplicationScoped
public class CalculatorHistoryDAO {
    @Inject
    EntityManager entityManager;

    @Transactional
    public void save(History history) {
        if (entityManager != null) {
            entityManager.persist(history);
        }
    }

    @Transactional
    public List<History> getAllHistories() {
        return entityManager.createQuery("SELECT h FROM History h", History.class).getResultList();
    }
    @Transactional
    public History getLatestHistory() {
        List<History> resultList = entityManager.createNativeQuery(
                "SELECT * FROM History h ORDER BY id DESC LIMIT 1", History.class
        ).getResultList();
        return resultList.isEmpty() ? null : resultList.get(0);
    }
}