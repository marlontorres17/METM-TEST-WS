package com.sena.metm_test_ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.metm_test_ws.Entity.Countries;
import com.sena.metm_test_ws.IRepository.IBaseRepository;
import com.sena.metm_test_ws.IRepository.ICountriesRepository;
import com.sena.metm_test_ws.IService.ICountriesService;


@Service
public class CountriesService extends ABaseService <Countries> implements ICountriesService {
    @Autowired
    private ICountriesRepository repository;

    @Override
    protected IBaseRepository <Countries, Long> getRepository(){
        return repository;
    }
}