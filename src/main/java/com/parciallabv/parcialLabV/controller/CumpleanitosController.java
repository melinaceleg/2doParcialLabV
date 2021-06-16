package com.parciallabv.parcialLabV.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/cumpleanitos")
public class CumpleanitosController {
    @Autowired
    private CumpleanitosService cumpleanitosService;

    @PostMapping("/")
    public void addCumpleanitos(@RequestBody Cumpleanitos cumpleanito)
    {
        cumpleanitosService.addCumpleanitos(cumpleanito);

    }

    @GetMapping("/{id}/consumos")
    List<ConsumoFiesta> getConsumosFiesta(@PathVariable Integer idCumpleanito) throws IOException, InterruptedException {
      return cumpleanitosService.getConsumosFiesta(idCumpleanito);
    }

}
