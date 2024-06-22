package com.sena.metm_test_ws.Service;

import java.util.List;

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

    public List<Routes> OrigenAndDestino(String origen, String destino) {
        return repository.findByOrigenAndDestino(origen, destino);
    }

   
    
}