package com.corenetworks.RelacionNM.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="visitas")
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVisita;


    @ManyToOne
    @JoinColumn(name = "matricula",nullable = false, foreignKey = @ForeignKey(name="FK_visitas_autobus"))
    private Autobus autobus;

    @ManyToOne
    @JoinColumn(name="id_lugar",nullable = false,foreignKey = @ForeignKey(name="FK_visitas_lugares"))
    private Lugar lugar;

    @ManyToOne
    @JoinColumn(name = "dni", nullable = false, foreignKey = @ForeignKey(name = "FK_visitas_conductor"))
    private Conductor conductor;
    @Column(nullable = false)
    private LocalDate fVisita;

    public Visita(int idVisita, LocalDate fVisita) {
        this.idVisita = idVisita;
        this.fVisita = fVisita;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public void setfVisita(LocalDate fVisita) {
        this.fVisita = fVisita;
    }

    @Override
    public String toString() {
        return "Visita{" +
                "idVisita=" + idVisita +
                ", fVisita=" + fVisita +
                '}';
    }
}
