package com.sena.metm_test_ws.IRepository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sena.metm_test_ws.Entity.Routes;

@Repository
public interface IRoutesRepository extends IBaseRepository <Routes, Long> {


    @Query("SELECT r FROM routes v WHERE r.departure_airport_id = :origen AND r.arrival_airport_id = :destino")
    List<Routes> findByOrigenAndDestino(@Param("origen") String origen, @Param("destino") String destino);
    
}