package com.sena.metm_test_ws.IRepository;

import org.springframework.stereotype.Repository;

import com.sena.metm_test_ws.Entity.Users;

@Repository
public interface IUsersRepository extends IBaseRepository <Users, Long> {

    
}