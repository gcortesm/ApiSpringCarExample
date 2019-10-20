package com.car.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MarcasEntity
 */
@Entity
@Table(name = "MARCAS")
public class MarcasEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cod_marca")
    private Integer codMarca;

    @Column(name = "nombre_marca")
    private String nombreMarca;

    public String getNombre_marca() {
        return this.nombreMarca;
    }

    public void setNombre_marca(String nombre_marca) {
        this.nombreMarca = nombre_marca;
    }
    

}