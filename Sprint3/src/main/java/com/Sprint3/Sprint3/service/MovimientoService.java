package com.Sprint3.Sprint3.service;

import com.Sprint3.Sprint3.model.MovimientoDinero;
import com.Sprint3.Sprint3.repository.MovimientoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class MovimientoService {
    @Autowired
    MovimientoRepository movimientoRepository;
    public List<MovimientoDinero> verMovimiento(){
        List<MovimientoDinero> movimientoDineroList=new ArrayList<MovimientoDinero>();
        movimientoDineroList.addAll(movimientoRepository.findAll());
        return movimientoDineroList;
    }
    public void eliminarMovimiento(Long id){
        movimientoRepository.deleteById(id);
    }
    public void crearyActualizarMovimiento(MovimientoDinero movimientoDinero){
        movimientoRepository.save(movimientoDinero);
    }
}
