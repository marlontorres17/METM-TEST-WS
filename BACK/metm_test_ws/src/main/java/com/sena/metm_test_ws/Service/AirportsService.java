package com.sena.metm_test_ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.metm_test_ws.Entity.Airports;
import com.sena.metm_test_ws.IRepository.IAirportsRepository;
import com.sena.metm_test_ws.IRepository.IBaseRepository;
import com.sena.metm_test_ws.IService.IAirportsService;

@Service
public class AirportsService extends ABaseService <Airports> implements IAirportsService {
    @Autowired
    private IAirportsRepository respository;

    @Override
    protected IBaseRepository <Airports, Long> getRepository(){
        return respository;
    }

    
}