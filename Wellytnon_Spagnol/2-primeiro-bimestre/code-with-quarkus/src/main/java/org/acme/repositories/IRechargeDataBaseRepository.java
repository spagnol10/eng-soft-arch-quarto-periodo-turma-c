package org.acme.repositories;

import org.acme.entities.RechargeBO;

public interface IRechargeDataBaseRepository {
    RechargeBO persist(RechargeBO bo);
}
