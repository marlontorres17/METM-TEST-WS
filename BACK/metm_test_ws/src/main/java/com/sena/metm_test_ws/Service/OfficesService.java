package com.sena.metm_test_ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.metm_test_ws.Entity.Offices;
import com.sena.metm_test_ws.IRepository.IBaseRepository;
import com.sena.metm_test_ws.IRepository.IOfficesRepository;
import com.sena.metm_test_ws.IService.IOfficesService;

@Service
public class OfficesService extends ABaseService <Offices> implements IOfficesService {
    @Autowired
    private IOfficesRepository repository;

    @Override
    protected IBaseRepository <Offices, Long> getRepository(){
        return repository;
    }

    
}