package com.riwi.entities;

public class Passenger {
//Atributos
    private  int idPassenger;
    private String name;
    private String lastName;
    private String dni;

    //Constructores
    //vacio
    public Passenger() {}
    //Completo
    public Passenger(int idPassenger, String name, String lastName, String dni) {
        this.idPassenger = idPassenger;
        this.name = name;
        this.lastName = lastName;
        this.dni = dni;
    }

    public Passenger(int idPassenger, String name) {
    }

    //Getters
    public int getIdPassenger() {
        return this.idPassenger;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDni() {
        return this.dni;
    }

    //Setters
    public void setIdPassenger(int idPassenger) {
        this.idPassenger = idPassenger;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    //ToString
    @Override
    public String toString() {
        return "Passenger{" +
                "idPassenger=" + this.idPassenger +
                ", name='" + this.name + '\'' +
                ", lastName='" + this.lastName + '\'' +
                ", dni='" + this.dni + '\'' +
                '}';
    }

    public  String toString2() {
        return "Passenger " +
                "ID Passenger = " + this.idPassenger +
                ", name = '" + this.name + '\'';
    }
}
