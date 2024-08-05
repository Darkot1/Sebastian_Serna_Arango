package com.riwi.entities;

import com.riwi.utils.enums.EstadoVacante;

public class Vacante {

    private int id;
    private String titulo;
    private String descripcion;
    private String tecnologia;
    private EstadoVacante estado;
    private int empresaID;


    public Vacante() {}

    public Vacante(int id, String titulo, String descripcion, String tecnologia, EstadoVacante estado, int empresaID) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.tecnologia = tecnologia;
        this.estado = estado;
        this.empresaID = empresaID;
    }

    public int getId() {
        return this.id;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getTecnologia() {
        return this.tecnologia;
    }

    public EstadoVacante getEstado() {
        return this.estado;
    }

    public int getEmpresaID() {
        return this.empresaID;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public void setEstado(EstadoVacante estado) {
        this.estado = estado;
    }

    public void setEmpresaID(int empresaID) {
        this.empresaID = empresaID;
    }

    @Override
    public String toString() {
        return "vacante{" +
                "id = " + this.id +
                ", titulo = '" + this.titulo + '\'' +
                ", descripcion = '" + this.descripcion + '\'' +
                ", tecnologia = '" + this.tecnologia + '\'' +
                ", estado = " + this.estado +
                ", empresaID = " + this.empresaID +
                '}';
    }
}
