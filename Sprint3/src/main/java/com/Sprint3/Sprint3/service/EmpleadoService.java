package com.Sprint3.Sprint3.service;

import com.Sprint3.Sprint3.model.Empleado;
import com.Sprint3.Sprint3.repository.EmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    public List<Empleado> verEmpleado(){
        List<Empleado> empleados=new ArrayList<Empleado>();
        empleados.addAll(empleadoRepository.findAll());
        return empleados;
    }

    public void eliminarEmpleado(Long id){
        empleadoRepository.deleteById(id);

    }


    public void crearyActualizarEmpleado(Empleado empleado){
        empleadoRepository.save(empleado);
    }


}
