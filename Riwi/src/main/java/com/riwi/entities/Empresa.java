package com.riwi.entities;

public class Empresa {
    private int id;
    private String nombre;
    private String ubicacion;

    public Empresa() {}

    public Empresa(int id, String nombre, String ubicacion) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public int getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return
                "id = " + this.id +
                ", nombre = " + this.nombre + '\'' +
                ", ubicacion = " + this.ubicacion + '\'';
    }
}
