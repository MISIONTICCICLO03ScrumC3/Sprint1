package com.Sprint3.Sprint3.controller;

import com.Sprint3.Sprint3.model.Empresa;
import com.Sprint3.Sprint3.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @GetMapping("/empresa")
    private List<Empresa> verEmpresa(){
        return empresaService.verEmpresa();
    }
    @PostMapping("/empresa")
    private void crearEmpresa(@RequestBody Empresa empresa){
        empresaService.crearyActualizarEmpresa(empresa);
    }
    @DeleteMapping("/empresa/{id}")
    private  void eliminarEmpleado(@PathVariable("id") Long id){
        empresaService.eliminarEmpresa(id);
    }
    @PutMapping("/empresa")
    private void editarEmpresa(@RequestBody Empresa empresa){
        empresaService.crearyActualizarEmpresa(empresa);
    }
}
