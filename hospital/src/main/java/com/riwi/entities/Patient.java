package com.riwi.entities;

import java.sql.Date;

public class Patient {

    private int idPatient;
    private String name;
    private String lastName;
    private Date birthDate;
    private String dni;

    public Patient() {}

    public Patient(int idPatient, String name, String lastName, Date birthDate, String dni){
        this.idPatient = idPatient;
        this.name = name;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.dni = dni;
    }

    public int getIdPatient() {
        return this.idPatient;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public Date getBirthDate() {
        return this.birthDate;
    }

    public String getDni() {
        return this.dni;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String toString() {
        return "Patient:\n" +
               " ID Patient: " + this.idPatient + "\n" +
               " Name: " + this.name + "\n" +
               " Last Name: " + this.lastName + "\n" +
               " Birth Date: " + this.birthDate + "\n" +
               " DNI: " + this.dni + "\n";
    }

    



}
