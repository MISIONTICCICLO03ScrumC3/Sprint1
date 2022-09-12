package com.Sprint3.Sprint3.controller;

import com.Sprint3.Sprint3.model.MovimientoDinero;
import com.Sprint3.Sprint3.service.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovimientoController {
    @Autowired
    MovimientoService movimientoService;

    @GetMapping("/movimiento")
    private List<MovimientoDinero> verMovimiento(){
        return movimientoService.verMovimiento();
    }
    @PostMapping("/movimiento")
    private void crearMovimiento(@RequestBody MovimientoDinero movimientoDinero){
        movimientoService.crearyActualizarMovimiento(movimientoDinero);
    }
    @DeleteMapping("/movimiento/{id}")
    private  void eliminarMovimiento(@PathVariable("id") Long id){
        movimientoService.eliminarMovimiento(id);
    }
    @PutMapping("/movimiento")
    private void editarMovimiento(@RequestBody MovimientoDinero movimientoDinero){
        movimientoService.crearyActualizarMovimiento(movimientoDinero);
    }
}
