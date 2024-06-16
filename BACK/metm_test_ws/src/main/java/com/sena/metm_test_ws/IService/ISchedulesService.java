package com.sena.metm_test_ws.IService;

import java.util.Date;
import java.util.List;

import com.sena.metm_test_ws.Entity.Schedules;

public interface ISchedulesService extends IBaseService <Schedules> {
    List<Schedules> findSchedulesByDateAndRoute(Date date, Long departureAirportId, Long arrivalAirportId);  
    
}