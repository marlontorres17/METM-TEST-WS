package com.sena.metm_test_ws.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.metm_test_ws.Entity.Schedules;
import com.sena.metm_test_ws.IRepository.IBaseRepository;
import com.sena.metm_test_ws.IRepository.ISchedulesRepository;
import com.sena.metm_test_ws.IService.ISchedulesService;


@Service
public class SchedulesService extends ABaseService <Schedules> implements ISchedulesService {
    @Autowired
    private ISchedulesRepository repository;

    @Override
    protected IBaseRepository <Schedules, Long> getRepository(){
        return repository;
    }

    
}