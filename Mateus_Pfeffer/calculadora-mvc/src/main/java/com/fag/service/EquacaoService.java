package com.fag.service;

import com.fag.dto.EquacaoDTO;
import com.fag.model.Equacao;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class EquacaoService {

    @PersistenceContext
    private final EntityManager em;

    @Inject
    public EquacaoService(EntityManager em) {
        this.em = em;
    }

    public Equacao createEquacao(EquacaoDTO dto) {
        Equacao newEquacao = new Equacao(dto);

        this.save(newEquacao);
        return newEquacao;
    }

    public void save(Equacao equacao) {
        this.em.persist(equacao);
    }

}
