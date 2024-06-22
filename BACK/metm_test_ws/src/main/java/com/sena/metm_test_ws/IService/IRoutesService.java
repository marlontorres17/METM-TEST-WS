package com.sena.metm_test_ws.IService;

import java.util.List;

import com.sena.metm_test_ws.Entity.Routes;

public interface IRoutesService extends IBaseService <Routes> {
    List<Routes> OrigenAndDestino(String origen, String destino);

    
}