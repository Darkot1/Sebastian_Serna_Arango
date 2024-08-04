package com.riwi.entities;

public class Doctor {

    private int idDoctor;
    private String name;
    private String lastName;
    private int idSpecialty;

    public Doctor(){}

    public Doctor(int idDoctor, String name, String lastName, int idSpecialty){
        this.idDoctor = idDoctor;
        this.name = name;
        this.lastName = lastName;
        this.idSpecialty = idSpecialty;
    }

    

    public int getIdDoctor() {
        return this.idDoctor;
    }

    public String getName() {
        return this.name;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getIdSpecialty() {
        return this.idSpecialty;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setIdSpecialty(int idSpecialty) {
        this.idSpecialty = idSpecialty;
    }

    @Override
    public String toString() {
        return "Doctor \n" +
                "    idDoctor = " + idDoctor + ",\n" +
                "    name = " + name + ",\n" +
                "    lastName = "+ lastName + "\n" +
                "    idSpecialty = " + idSpecialty + ",\n";
    }


    




}
