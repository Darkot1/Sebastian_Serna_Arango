package com.riwi.entities;

public class Airline {
    //Atributos
    private int idAirline;
    private String model;
    private int capacity;

    //Contructores
    //vacio
    public Airline() {}
    //Lleno
    public Airline(int idAirline, String model, int capacity) {
        this.idAirline = idAirline;
        this.model = model;
        this.capacity = capacity;
    }

    //Getters
    public int getIdAirline() {
        return this.idAirline;
    }

    public String getModel() {
        return this.model;
    }

    public int getCapacity() {
        return this.capacity;
    }

    //Setters
    public void setIdAirline(int idAirline) {
        this.idAirline = idAirline;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    //ToString
    @Override
    public String toString() {
        return "Airline{" +
                "idAirline=" + this.idAirline +
                ", model='" + this.model + '\'' +
                ", capacity='" + this.capacity + '\'' +
                '}';
    }
}
