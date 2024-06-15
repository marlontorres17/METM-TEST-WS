package com.sena.metm_test_ws.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.metm_test_ws.Entity.Users;
import com.sena.metm_test_ws.IService.IUsersService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/users")
public class UsersController extends ABaseController <Users, IUsersService> {
    public UsersController(IUsersService service){
        super(service, "Users");
    }

    
}