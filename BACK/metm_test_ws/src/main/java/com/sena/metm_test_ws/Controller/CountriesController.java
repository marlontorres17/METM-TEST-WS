package com.sena.metm_test_ws.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.metm_test_ws.Entity.Countries;
import com.sena.metm_test_ws.IService.ICountriesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/countries")
public class CountriesController extends ABaseController <Countries, ICountriesService> {
    public CountriesController(ICountriesService service){
        super(service, "Countries");
    }


}