package com.car.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="VEHICULOS")
public class VehiculosEntity {

    @Id
    @Column(name="placa")
    private String placa;

    @Column(name ="color")
    private String color;

    @Column (name ="fk_cod_marca")
    private String fkCodMarca;

    @Column (name ="fk_cod_cliente")
    private String fkCodCliente; 
}