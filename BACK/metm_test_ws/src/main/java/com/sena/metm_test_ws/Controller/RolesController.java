package com.sena.metm_test_ws.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.metm_test_ws.Entity.Roles;
import com.sena.metm_test_ws.IService.IRolesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/roles")
public class RolesController extends ABaseController <Roles, IRolesService> {
    public RolesController(IRolesService service){
        super(service, "Roles");
    }

    
}