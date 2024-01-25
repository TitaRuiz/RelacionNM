package com.corenetworks.RelacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor

@Data
@Entity
@Table(name = "conductores")
public class Conductor {
    @Id
    @Column(length = 9)
    private String dni;
    @Column(length = 60)
    private String nombre;

//    @OneToMany(mappedBy = "conductor",
//            cascade = CascadeType.ALL,
//            fetch = FetchType.EAGER)
//    private List<Visita> visitas;

    public Conductor(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
}
