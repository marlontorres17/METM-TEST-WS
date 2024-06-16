package com.sena.metm_test_ws.IRepository;


import org.springframework.stereotype.Repository;

import com.sena.metm_test_ws.Entity.Schedules;

@Repository
public interface ISchedulesRepository extends IBaseRepository <Schedules, Long> {   
    
}