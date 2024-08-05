package com.riwi.entities;

import com.riwi.utils.enums.EstadoContratacion;

import java.sql.Timestamp;

public class Contratacion {

    private  int id;
    private Timestamp fechaAplicacion;
    private EstadoContratacion estado;
    private int coderID;
    private int vacanteID;
    private int salario;

    public Contratacion() {}

    public Contratacion(int id, Timestamp fechaAplicacion, EstadoContratacion estado, int coderID, int vacanteID, int salario) {
        this.id = id;
        this.fechaAplicacion = fechaAplicacion;
        this.estado = estado;
        this.coderID = coderID;
        this.vacanteID = vacanteID;
        this.salario = salario;
    }

    public int getId() {
        return this.id;
    }

    public Timestamp getFechaAplicacion() {
        return this.fechaAplicacion;
    }

    public EstadoContratacion getEstado() {
        return this.estado;
    }

    public int getCoderID() {
        return this.coderID;
    }

    public int getVacanteID() {
        return this.vacanteID;
    }

    public int getSalario() {
        return this.salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaAplicacion(Timestamp fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public void setEstado(EstadoContratacion estado) {
        this.estado = estado;
    }

    public void setCoderID(int coderID) {
        this.coderID = coderID;
    }

    public void setVacanteID(int vacanteID) {
        this.vacanteID = vacanteID;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "contratacion{" +
                "id = " + this.id +
                ", fechaAplicacion = " + this.fechaAplicacion +
                ", estado = " + this.estado +
                ", coderID = " + this.coderID +
                ", vacanteID = " + this.vacanteID +
                ", salario = " + this.salario;
    }
}
