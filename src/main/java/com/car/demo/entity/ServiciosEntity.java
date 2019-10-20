package com.car.demo.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "servicios")
@Entity
public class ServiciosEntity {

    private Integer codServicio;
    private String nombreServicio;
    private BigDecimal valorServicio;

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

    public BigDecimal getValorServicio() {
        return this.valorServicio;
    }

    public void setValorServicio(BigDecimal valorServicio) {
        this.valorServicio = valorServicio;
    }

}