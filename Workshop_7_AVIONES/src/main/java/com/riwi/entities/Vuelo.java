package com.riwi.entities;

import java.sql.Date;
import java.sql.Time;

public class Vuelo {
    private int idVuelo;
    private Date fechaSalida;
    private Time horaSalida;
    private int idAvion;

    public Vuelo(){}

    public Vuelo(int idVuelo, Date fechaSalida, Time horaSalida, int idAvion){
        this.idVuelo = idVuelo;
        this.fechaSalida = fechaSalida;
        this.horaSalida = horaSalida;
        this.idAvion = idAvion;
    }

    //GETTERS
    public int getIdVuelo() {
        return this.idVuelo;
    }

    public Date getFechaSalida() {
        return this.fechaSalida;
    }

    public Time getHoraSalida() {
        return this.horaSalida;
    }

    public int getIdAvion() {
        return this.idAvion;
    }

    //SETTERS
    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setHoraSalida(Time horaSalida) {
        this.horaSalida = horaSalida;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "idVuelo=" + this.idVuelo +
                ", fechaSalida=" + this.fechaSalida +
                ", horaSalida=" + this.horaSalida +
                ", idAvion=" + this.idAvion +
                '}';
    }
}
