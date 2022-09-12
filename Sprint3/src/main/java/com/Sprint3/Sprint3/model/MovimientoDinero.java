package com.Sprint3.Sprint3.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;

    private float montoMovimiento;
    private String conceptoMovimiento;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

}
