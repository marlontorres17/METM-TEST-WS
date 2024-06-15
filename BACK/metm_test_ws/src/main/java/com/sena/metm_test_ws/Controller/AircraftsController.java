package com.sena.metm_test_ws.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.metm_test_ws.Entity.Aircrafts;
import com.sena.metm_test_ws.IService.IAircraftsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/aircrafts")
public class AircraftsController extends ABaseController <Aircrafts, IAircraftsService> {
    public AircraftsController(IAircraftsService service){
        super(service, "Aircrafts");
    }

    
}