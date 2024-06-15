package com.sena.metm_test_ws.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.metm_test_ws.Entity.CabinTypes;
import com.sena.metm_test_ws.IService.ICabinTypesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/cabinTypes")
public class CabinTypesController extends ABaseController <CabinTypes, ICabinTypesService> {
    public CabinTypesController(ICabinTypesService service){
        super(service, "CabinTypes");
    }

    
}