package com.car.demo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
import javax.persistence.Table;


@NamedStoredProcedureQuery(
    name = PersonaEntity.SAVE_PROCEDURE,
    procedureName =  PersonaEntity.SAVE_PROCEDURE,
    parameters = {
        @StoredProcedureParameter(name="tipo_documento",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="documento",type = int.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="primer_nombre",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="segundo_nombre",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="primer_apellido",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="segundo_apellido",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="celular",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="direccion",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="email",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="estado",type = String.class , mode=ParameterMode.IN)
    }
)

@NamedStoredProcedureQuery(
    name = PersonaEntity.EDIT_PROCEDURE,
    procedureName =  PersonaEntity.EDIT_PROCEDURE,
    parameters = {
        @StoredProcedureParameter(name="tipo_documento",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="documento",type = Integer.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="primer_nombre",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="segundo_nombre",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="primer_apellido",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="segundo_apellido",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="celular",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="direccion",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="email",type = String.class , mode=ParameterMode.IN),
        @StoredProcedureParameter(name="estado",type = String.class , mode=ParameterMode.IN),
    }
)

@Entity
@Table(name = "MECANICOS")
@IdClass(PersonaEntity.IdClass.class)

public class PersonaEntity{
    public static final String SAVE_PROCEDURE="ADDPERSONA";
    public static final String EDIT_PROCEDURE="editpersona";

    @Id
    @Column(name ="tipo_documento")
    private String tipoDocumento;

    public String getTipoDocumento() {
        return this.tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    @Id
    @Column(name ="documento")
    private Integer documento;

    public Integer getDocumento() {
        return this.documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }
    
    static class IdClass implements Serializable {
        private String tipoDocumento;
        private Integer documento;
    }



    @Column(name ="primer_nombre")
    private String primerNombre;

    public String getPrimerNombre() {
        return this.primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    @Column(name ="segundo_nombre")
    private String segundoNombre;

    public String getSegundoNombre() {
        return this.segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    @Column(name ="primer_apellido")
    private String primerApellido;

    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    @Column(name ="segundo_apellido")
    private String segundoApellido;

    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    @Column(name ="celular")
    private String celular;

    public String getCelular() {
        return this.celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Column(name ="direccion")
    private String direccion;

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Column(name ="email")
    private String email;

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name ="estado")
    private String estado;

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}