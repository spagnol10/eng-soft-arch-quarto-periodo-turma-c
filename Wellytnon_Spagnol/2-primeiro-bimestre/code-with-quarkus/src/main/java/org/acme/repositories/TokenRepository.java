package org.acme.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import org.acme.model.TokenBoleto;

public interface TokenRepository extends PanacheRepositoryBase<TokenBoleto, Long> {
}
