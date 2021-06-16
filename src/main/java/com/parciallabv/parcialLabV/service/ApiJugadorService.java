package com.parciallabv.parcialLabV.service;

import com.parciallabv.parcialLabV.api.ApiCallSportDataService;
import com.parciallabv.parcialLabV.api.DataResponseList;
import com.parciallabv.parcialLabV.api.JugadorApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class ApiJugadorService {
    ApiCallSportDataService apiCallSportDataService;

    public List<JugadorApi> getJugadoresPromesas() throws IOException, InterruptedException {
    DataResponseList data  = apiCallSportDataService.getData();
    List<JugadorApi> jugadores = data.getData();
    List<JugadorApi> out = new ArrayList<>();
    for (JugadorApi j: jugadores)
    {
        if (j.getAge() < 20 && j.getHeight() > 1.80)
        {
            out.add(j);
        }
    }
    return out;
    }
}
