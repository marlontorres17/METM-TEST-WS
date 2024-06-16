package com.sena.metm_test_ws.Controller;



import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.metm_test_ws.Entity.Schedules;
import com.sena.metm_test_ws.IService.ISchedulesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/schedules")
public class SchedulesController extends ABaseController <Schedules, ISchedulesService> {
    public SchedulesController(ISchedulesService service){
        super(service, "Schedules");
    }




    
}