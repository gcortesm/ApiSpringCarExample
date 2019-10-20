package com.car.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RepuestosMantenimietoEntity
 */
@Entity 
@Table(name="repuestos_mantenimiento")
public class RepuestosMantenimietoEntity {

    @Id
    @Column(name ="cod_rmante")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codRMatenimiento;

    public Integer getCodRMatenimiento() {
        return this.codRMatenimiento;
    }

    public void setCodRMatenimiento(Integer codRMatenimiento) {
        this.codRMatenimiento = codRMatenimiento;
    }

    @Column(name ="unidades")
    private Integer unidades;
    private BigDecimal subTotal;
    private String tiempoEstimado;
    private Integer fkCodRepuesto;
    private Integer fkCodMantenimiento;
    private Date fechaRMante;

    public Integer getUnidades() {
        return this.unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }

    public BigDecimal getSubTotal() {
        return this.subTotal;
    }

    public void setSubTotal(BigDecimal subTotal) {
        this.subTotal = subTotal;
    }

    public String getTiempoEstimado() {
        return this.tiempoEstimado;
    }

    public void setTiempoEstimado(String tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
    }

    public Integer getFkCodRepuesto() {
        return this.fkCodRepuesto;
    }

    public void setFkCodRepuesto(Integer fkCodRepuesto) {
        this.fkCodRepuesto = fkCodRepuesto;
    }

    public Integer getFkCodMantenimiento() {
        return this.fkCodMantenimiento;
    }

    public void setFkCodMantenimiento(Integer fkCodMantenimiento) {
        this.fkCodMantenimiento = fkCodMantenimiento;
    }

    public Date getFechaRMante() {
        return this.fechaRMante;
    }

    public void setFechaRMante(Date fechaRMante) {
        this.fechaRMante = fechaRMante;
    }

    
}