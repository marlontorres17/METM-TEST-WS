package com.sena.metm_test_ws.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sena.metm_test_ws.Entity.ABaseEntity;

@Repository
public interface IBaseRepository<T extends ABaseEntity, ID> extends JpaRepository<T, Long>{
}
