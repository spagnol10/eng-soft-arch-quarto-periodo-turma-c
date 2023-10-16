package org.acme.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.*;

@Entity
@Table(name = "WS_TOKEN")
public class Token extends PanacheEntityBase {

    @Id
    @SequenceGenerator(name = "tokenSequence", sequenceName = "token_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tokenSequence")
    @Column(name = "ID")
    private Long id;

    @Column(name = "TOKEN", length = 700)
    private String token;

    public Long getId() {
        return id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
