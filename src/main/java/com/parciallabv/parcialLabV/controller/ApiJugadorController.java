package com.parciallabv.parcialLabV.controller;

import com.parciallabv.parcialLabV.api.JugadorApi;
import com.parciallabv.parcialLabV.service.ApiJugadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/apijugador")
public class ApiJugadorController {
    @Autowired
    private final ApiJugadorService apiJugadorService;


    public ApiJugadorController(ApiJugadorService apiJugadorService) {
        this.apiJugadorService = apiJugadorService;
    }

    @GetMapping
        public List<JugadorApi> getJugadoresPromesas() throws IOException, InterruptedException {
            return apiJugadorService.getJugadoresPromesas();
        }
}
