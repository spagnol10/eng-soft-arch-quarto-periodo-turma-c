package org.acme.repositories;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
import org.acme.model.Token;

public interface TokenRepository extends PanacheRepositoryBase<Token, Long> {
}
