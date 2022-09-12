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
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;

    private String nombreUsuario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "emppleado_id")
    private Empleado empleado;
}
