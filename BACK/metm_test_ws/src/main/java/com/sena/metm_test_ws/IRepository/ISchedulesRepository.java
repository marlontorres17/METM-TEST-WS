package com.sena.metm_test_ws.IRepository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sena.metm_test_ws.Entity.Schedules;

@Repository
public interface ISchedulesRepository extends IBaseRepository <Schedules, Long> {   
    @Query("SELECT s FROM schedules s " +
    "WHERE DATE(s.date) = DATE(:date) " +
    "AND (:departureAirport IS NULL OR s.routes.departureAirport.id = :departureAirport) " +
    "AND (:arrivalAirport IS NULL OR s.routes.arrivalAirport.id = :arrivalAirport)")
List<Schedules> findSchedulesByDateAndRoute(
     @Param("date") Date date,
     @Param("departure_airport_id") Long departureAirport,
     @Param("arrival_airport_id") Long arrivalAirport
); 
    
}