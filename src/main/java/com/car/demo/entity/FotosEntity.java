package com.car.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name ="fotos")
public class FotosEntity {

    @Id
    @Column( name ="cod_fotos")
    private Integer codFotos;

    @Column(name = "ruta")
    private String rutas;
    
    @Column (name ="cod_mantenimiento")
    private String fkCodMantenimiento;

    public Integer getCodFotos() {
        return this.codFotos;
    }

    public void setCodFotos(Integer codFotos) {
        this.codFotos = codFotos;
    }

    public String getRutas() {
        return this.rutas;
    }

    public void setRutas(String rutas) {
        this.rutas = rutas;
    }

    public String getFkCodMantenimiento() {
        return this.fkCodMantenimiento;
    }

    public void setFkCodMantenimiento(String fkCodMantenimiento) {
        this.fkCodMantenimiento = fkCodMantenimiento;
    }
    
}