package com.sena.metm_test_ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.metm_test_ws.Entity.Aircrafts;
import com.sena.metm_test_ws.IRepository.IAircraftsRespository;
import com.sena.metm_test_ws.IRepository.IBaseRepository;
import com.sena.metm_test_ws.IService.IAircraftsService;

@Service
public class AircraftsService extends ABaseService <Aircrafts> implements IAircraftsService {
    @Autowired
    private IAircraftsRespository respository;

    @Override
    protected IBaseRepository <Aircrafts, Long> getRepository(){
        return respository;
    }

    
}