package com.car.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "servicios")
@Entity
public class ServiciosEntity {

    @Id
    @Column(name="cod_servicio")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codServicio;
    @Column(name="numbre_servicio")
    private String nombreServicio;
    @Column(name="precio")
    private Integer precio;

    public Integer getCodServicio() {
        return this.codServicio;
    }

    public void setCodServicio(Integer codServicio) {
        this.codServicio = codServicio;
    }

    public String getNombreServicio() {
        return this.nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public Integer getPrecio() {
        return this.precio;
    }

    public void setPrecio(Integer valorServicio) {
        this.precio = valorServicio;
    }

}