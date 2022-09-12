package com.Sprint3.Sprint3.controller;

import com.Sprint3.Sprint3.model.Empleado;
import com.Sprint3.Sprint3.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    EmpleadoService empleadoService;

    @GetMapping("/empleado")
    private List<Empleado> verEmpleado(){
        return empleadoService.verEmpleado();
    }

    @PostMapping("/empleado")
    private void crearEmpleado(@RequestBody Empleado empleado){
        empleadoService.crearyActualizarEmpleado(empleado);
    }

    @DeleteMapping("/empleado/{id}")
    private void eliminarEmpleado(@PathVariable("id") Long id){
        empleadoService.eliminarEmpleado(id);
    }

    @PutMapping("/empleado")
    private void editarEmpleado(@RequestBody Empleado empleado){
        empleadoService.crearyActualizarEmpleado(empleado);

    }
}
