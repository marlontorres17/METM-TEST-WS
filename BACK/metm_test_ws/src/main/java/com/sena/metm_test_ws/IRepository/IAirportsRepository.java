package com.sena.metm_test_ws.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.metm_test_ws.Entity.Airports;

@Repository
public interface IAirportsRepository extends IBaseRepository <Airports, Long> {

    
}