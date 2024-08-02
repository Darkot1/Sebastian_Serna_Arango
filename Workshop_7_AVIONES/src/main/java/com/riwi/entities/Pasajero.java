package com.riwi.entities;

public class Pasajero {
    private int idPasajero;
    private String nombre;
    private String apellido;
    private String numeroDocumento;

    public Pasajero() {}

    public Pasajero(int idPasajero, String nombre, String apellido, String numeroDocumento) {
        this.idPasajero = idPasajero;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumento = numeroDocumento;
    }

    public int getIdPasajero() {
        return this.idPasajero;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    @Override
    public String toString() {
        return "Pasajero{" +
                "idPasajero=" + this.idPasajero +
                ", nombre='" + this.nombre + '\'' +
                ", apellido='" + this.apellido + '\'' +
                ", numeroDocumento='" + this.numeroDocumento + '\'' +
                '}';
    }
}
