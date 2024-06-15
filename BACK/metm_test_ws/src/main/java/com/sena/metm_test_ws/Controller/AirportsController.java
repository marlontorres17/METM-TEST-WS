package com.sena.metm_test_ws.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.metm_test_ws.Entity.Airports;
import com.sena.metm_test_ws.IService.IAirportsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/airports")
public class AirportsController extends ABaseController <Airports, IAirportsService>{
    public AirportsController(IAirportsService service){
        super(service,"Airports");
    }

    
}