package com.sena.metm_test_ws.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.metm_test_ws.Entity.Countries;

@Repository
public interface ICountriesRepository extends IBaseRepository <Countries, Long> {

    
}