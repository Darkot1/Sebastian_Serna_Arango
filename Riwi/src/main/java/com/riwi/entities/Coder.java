package com.riwi.entities;

public class Coder {

    private int id;
    private String nombre;
    private String apellido;
    private  String documento;
    private String tecnologia;
    private String clan;

    public Coder() {}

    public Coder(int id, String nombre, String apellido, String documento, String tecnologia, String clan) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.tecnologia = tecnologia;
        this.clan = clan;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDocumento() {
        return this.documento;
    }

    public String getTecnologia() {
        return this.tecnologia;
    }

    public String getClan() {
        return this.clan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    public void setClan(String clan) {
        this.clan = clan;
    }

    @Override
    public String toString() {
        return
                "id = " + this.id +
                ", nombre = '" + this.nombre + '\'' +
                ", apellido = '" + this.apellido + '\'' +
                ", documento = '" + this.documento + '\'' +
                ", tecnologia = '" + this.tecnologia + '\'' +
                ", clan = '" + this.clan + '\'';
    }
}
