package com.sena.metm_test_ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.metm_test_ws.Entity.Tickets;
import com.sena.metm_test_ws.IRepository.IBaseRepository;
import com.sena.metm_test_ws.IRepository.ITicketsRepository;
import com.sena.metm_test_ws.IService.ITicketsService;

@Service
public class TicketsService extends ABaseService <Tickets> implements ITicketsService {
    @Autowired
    private ITicketsRepository repository;

    @Override
    protected IBaseRepository <Tickets, Long> getRepository(){
        return repository;
    }

    
}