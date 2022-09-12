package com.Sprint3.Sprint3.service;

import com.Sprint3.Sprint3.model.Empresa;
import com.Sprint3.Sprint3.repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmpresaService {

    @Autowired
    EmpresaRepository empresaRepository;

    public List<Empresa> verEmpresa(){
        List<Empresa> empresas=new ArrayList<Empresa>();
        empresas.addAll(empresaRepository.findAll());
        return empresas;
    }
    public void eliminarEmpresa(Long id){
        empresaRepository.deleteById(id);
    }
    public void crearyActualizarEmpresa(Empresa empresa){
        empresaRepository.save(empresa);
    }
}
