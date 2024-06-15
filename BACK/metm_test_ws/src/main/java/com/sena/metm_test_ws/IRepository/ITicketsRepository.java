package com.sena.metm_test_ws.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.metm_test_ws.Entity.Tickets;

@Repository
public interface ITicketsRepository extends IBaseRepository <Tickets, Long> {

    
}