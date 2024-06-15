package com.sena.metm_test_ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.metm_test_ws.Entity.Users;
import com.sena.metm_test_ws.IRepository.IBaseRepository;
import com.sena.metm_test_ws.IRepository.IUsersRepository;
import com.sena.metm_test_ws.IService.IUsersService;

@Service
public class UsersService extends ABaseService <Users> implements IUsersService {
    @Autowired
    private IUsersRepository repository;

    @Override
    protected IBaseRepository <Users, Long> getRepository(){
        return repository;
    }

    
}