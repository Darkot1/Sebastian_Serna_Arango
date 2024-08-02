package com.riwi.entities;


public class Avion {
    private int idAvion;
    private String modelo;
    private int capacidad;

    public Avion(){}

    public Avion(int idAvion, String modelo, int capacidad){
        this.idAvion = idAvion;
        this.modelo = modelo;
        this.capacidad = capacidad;
    }

    public int getIdAvion() {
        return this.idAvion;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "idAvion = " + this.idAvion +
                ", modelo = '" + this.modelo + '\'' +
                ", capacidad = " + this.capacidad +
                '}';
    }
}
