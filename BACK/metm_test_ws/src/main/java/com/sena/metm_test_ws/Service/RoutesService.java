package com.sena.metm_test_ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.metm_test_ws.Entity.Routes;
import com.sena.metm_test_ws.IRepository.IBaseRepository;
import com.sena.metm_test_ws.IRepository.IRoutesRepository;
import com.sena.metm_test_ws.IService.IRoutesService;


@Service
public class RoutesService extends ABaseService <Routes> implements IRoutesService {
    @Autowired
    private IRoutesRepository repository;

    @Override
    protected IBaseRepository <Routes, Long> getRepository(){
        return repository;
    }

    
}