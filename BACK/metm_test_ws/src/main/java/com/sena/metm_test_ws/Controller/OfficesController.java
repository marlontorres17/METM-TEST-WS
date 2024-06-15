package com.sena.metm_test_ws.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.metm_test_ws.Entity.Offices;
import com.sena.metm_test_ws.IService.IOfficesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/offices")
public class OfficesController extends ABaseController <Offices, IOfficesService> {
    public OfficesController(IOfficesService service){
        super(service, "Offices");
    }

    
}