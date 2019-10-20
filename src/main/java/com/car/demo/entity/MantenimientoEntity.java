package com.car.demo.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MantenimientoEntity
 */
@Entity
@Table(name ="MANTENIMIENTOS")
public class MantenimientoEntity {

    @Id
    @Column(name ="cod_mantenimiento")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codMantenimiento;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fk_vehiculo")
    private Integer fkVehiculo;

    @Column(name ="fecha")
    private Date fecha;

    @Column (name = "fk_persona_mecanico")
    private Integer fkPersonaMecanico;

    @Column (name = "limitado")
    private String limitado;

    @Column(name ="limite_mantenimiento")
    private BigDecimal limiteMantenimiento;

    @Column(name ="valor_mantenimiento")
    private BigDecimal valorMantenimiento;


    
}