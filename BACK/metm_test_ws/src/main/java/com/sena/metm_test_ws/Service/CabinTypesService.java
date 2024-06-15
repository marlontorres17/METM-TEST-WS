package com.sena.metm_test_ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.metm_test_ws.Entity.CabinTypes;
import com.sena.metm_test_ws.IRepository.IBaseRepository;
import com.sena.metm_test_ws.IRepository.ICabinTypesRepository;
import com.sena.metm_test_ws.IService.ICabinTypesService;

@Service
public class CabinTypesService extends ABaseService <CabinTypes> implements ICabinTypesService {
    @Autowired
    private ICabinTypesRepository repository;

    @Override
    protected IBaseRepository <CabinTypes, Long> getRepository(){
        return repository;
    }

    
}