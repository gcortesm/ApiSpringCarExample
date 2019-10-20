package com.car.demo.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * RepuestoEntity
 */
@Entity 
@Table(name ="repuestos")
public class RepuestoEntity {

    @Id
    @Column (name = "cod_repuesto")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer codRepuesto;

    @Column(name = "numbre_repuesto")
    private String nombreRepuesto;
    @Column (name ="precio_unitario")
    private BigDecimal precioUnitario;
    @Column(name="unidades_inventario")
    private Integer unidadesInventario;
    @Column (name = "proveedor")
    private String proveedor;

    public Integer getCodRepuesto() {
        return this.codRepuesto;
    }

    public void setCodRepuesto(Integer codRepuesto) {
        this.codRepuesto = codRepuesto;
    }

    public String getNombreRepuesto() {
        return this.nombreRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }

    public BigDecimal getPrecioUnitario() {
        return this.precioUnitario;
    }

    public void setPrecioUnitario(BigDecimal precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Integer getUnidadesInventario() {
        return this.unidadesInventario;
    }

    public void setUnidadesInventario(Integer unidadesInventario) {
        this.unidadesInventario = unidadesInventario;
    }

    public String getProveedor() {
        return this.proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    
}