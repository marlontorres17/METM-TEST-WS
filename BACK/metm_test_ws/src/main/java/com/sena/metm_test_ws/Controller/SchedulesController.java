package com.sena.metm_test_ws.Controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @Autowired
    private ISchedulesService service;


    @GetMapping("/search")
    public List<Schedules> findSchedules(
            @RequestParam("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date,
            @RequestParam(name = "departure_airport_id", required = false) Long departureAirportId,
            @RequestParam(name = "arrival_airport_id", required = false) Long arrivalAirportId) {

        return service.findSchedulesByDateAndRoute(date, departureAirportId, arrivalAirportId);
    }

    
}