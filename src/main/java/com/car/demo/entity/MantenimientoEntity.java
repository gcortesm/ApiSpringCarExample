package com.car.demo.entity;

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
    @Column(name ="codigo")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codMantenimiento;

    public Integer getCodMantenimiento() {
        return this.codMantenimiento;
    }

    public void setCodMantenimiento(Integer codMantenimiento) {
        this.codMantenimiento = codMantenimiento;
    }

    @Column(name = "estado")
    private String estado;

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Column(name = "cod_placa")
    private String fkVehiculo;

    public String getFkVehiculo() {
        return this.fkVehiculo;
    }

    public void setFkVehiculo(String fkVehiculo) {
        this.fkVehiculo = fkVehiculo;
    }

    @Column(name ="fecha")
    private Date fecha;

    public Date getFecha() {
        return this.fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Column (name = "mec_documento")
    private Integer fkPersonaMecanico;

    public Integer getFkPersonaMecanico() {
        return this.fkPersonaMecanico;
    }

    public void setFkPersonaMecanico(Integer fkPersonaMecanico) {
        this.fkPersonaMecanico = fkPersonaMecanico;
    }

    @Column (name = "mec_tipo_documento")
    private String tipoDocumento;

    public String getTipoDocumento() {
        return this.tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
 
}