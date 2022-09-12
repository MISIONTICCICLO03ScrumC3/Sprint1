package com.Sprint3.Sprint3.model;

import com.Sprint3.Sprint3.enums.Enum_Tipo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id",nullable = false)
    private Long id;

    @Column
    private String nombre;
    private String email;
    private String empresaPertenece;
    //private String rolEmpleado;

    @Enumerated(EnumType.STRING)
    @Column(name = "rol")
    private Enum_Tipo rol;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "usuario")
    private List<MovimientoDinero> movimientoDineroList;
}
