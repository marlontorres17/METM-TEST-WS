package com.sena.metm_test_ws.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.metm_test_ws.Entity.Roles;
import com.sena.metm_test_ws.IRepository.IBaseRepository;
import com.sena.metm_test_ws.IRepository.IRolesRepository;
import com.sena.metm_test_ws.IService.IRolesService;

@Service
public class RolesService extends ABaseService <Roles> implements IRolesService {
    @Autowired
    private IRolesRepository repository;

    @Override
    protected IBaseRepository <Roles, Long> getRepository(){
        return repository;
    }

    
}