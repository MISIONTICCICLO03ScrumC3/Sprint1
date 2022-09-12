package com.crud.pokemon.model;

import com.crud.pokemon.enums.Enum_TIPE;
import lombok.*;

import javax.persistence.*;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nombre;
    private int vida;
    private int ataque;


    @Enumerated(javax.persistence.EnumType.STRING)
    @Column(name = "tipo")
    private Enum_TIPE tipe;

    /* RELACIÓN UNO A UNO
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "entrenador_id")
    private Entrenador entrenador;
*/
/*
@ManyToOne
@JoinColumn(name = "entrenador_id")
private Entrenador entrenador;
*/

    @ManyToMany
    @JoinTable(name = "entrenador_pokemon")
    private List<Entrenador> entrenadors;
}
