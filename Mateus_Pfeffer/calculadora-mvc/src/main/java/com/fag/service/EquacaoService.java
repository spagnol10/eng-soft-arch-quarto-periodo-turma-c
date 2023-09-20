package com.fag.service;

import com.fag.dto.EquacaoDTO;
import com.fag.model.Equacao;
import com.fag.repository.EquacaoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@ApplicationScoped
public class EquacaoService {

    @Inject
    EquacaoRepository repository;

    public Equacao createEquacao(EquacaoDTO dto) {
        Equacao newEquacao = new Equacao(dto);

        this.save(newEquacao);
        return newEquacao;
    }

    public void save(Equacao equacao) {
        this.repository.persist(equacao);
    }

}
