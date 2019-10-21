package com.car.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "servicios_mantenimiento")
public class ServiciosMantenimientoEntity {

    @Id
    @Column( name ="cod_smante")
    private Integer codSMante;

    @Column(name = "tiempo_estimado")
    private Integer tipoEstimado;
    @Column(name = "fk_cod_servicio")
    private Integer fkCodServicio;
    @Column(name = "fk_cod_mantenimiento")
    private Integer fkCodMantenimiento;

    @Column(name="fecha_smantenimiento")
    private Date fechaMantenimiento;

    public Date getFechaMantenimiento() {
        return this.fechaMantenimiento;
    }

    public void setFechaMantenimiento(Date fechaMantenimiento) {
        this.fechaMantenimiento = fechaMantenimiento;
    }

    public Integer getCodSMante() {
        return this.codSMante;
    }

    public void setCodSMante(Integer codSMante) {
        this.codSMante = codSMante;
    }

    public Integer getTipoEstimado() {
        return this.tipoEstimado;
    }

    public void setTipoEstimado(Integer tipoEstimado) {
        this.tipoEstimado = tipoEstimado;
    }

    public Integer getFkCodServicio() {
        return this.fkCodServicio;
    }

    public void setFkCodServicio(Integer fkCodServicio) {
        this.fkCodServicio = fkCodServicio;
    }

    public Integer getFkCodMantenimiento() {
        return this.fkCodMantenimiento;
    }

    public void setFkCodMantenimiento(Integer fkCodMantenimiento) {
        this.fkCodMantenimiento = fkCodMantenimiento;
    }
    
}