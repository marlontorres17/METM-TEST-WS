package com.sena.metm_test_ws.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.metm_test_ws.Entity.Tickets;
import com.sena.metm_test_ws.IService.ITicketsService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("v1/api/tickets")
public class TicketsController extends ABaseController <Tickets, ITicketsService> {
    public TicketsController(ITicketsService service){
        super(service, "Tickets");
    }

    
}