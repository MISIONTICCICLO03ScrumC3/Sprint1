package com.Sprint3.Sprint3.repository;

import com.Sprint3.Sprint3.model.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoRepository extends JpaRepository<MovimientoDinero, Long> {
}
