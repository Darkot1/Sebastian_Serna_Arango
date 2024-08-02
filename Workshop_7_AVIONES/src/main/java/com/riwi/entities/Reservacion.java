package com.riwi.entities;

import java.sql.Time;

public class Reservacion {
    private int idReservacion;
    private int idPasajero;
    private int idVuelo;
    private Time fechaReserva;

    public Reservacion() {
    }

    public Reservacion(int idReservacion, int idPasajero, int idVuelo, Time fechaReserva) {
        this.idReservacion = idReservacion;
        this.idPasajero = idPasajero;
        this.idVuelo = idVuelo;
        this.fechaReserva = fechaReserva;
    }

    public int getIdReservacion() {
        return this.idReservacion;
    }

    public int getIdPasajero() {
        return this.idPasajero;
    }

    public int getIdVuelo() {
        return this.idVuelo;
    }

    public Time getFechaReserva() {
        return this.fechaReserva;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public void setIdPasajero(int idPasajero) {
        this.idPasajero = idPasajero;
    }

    public void setIdVuelo(int idVuelo) {
        this.idVuelo = idVuelo;
    }

    public void setFechaReserva(Time fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    @Override
    public String toString() {
        return "Reservacion{" +
                "idReservacion=" + this.idReservacion +
                ", idPasajero=" + this.idPasajero +
                ", idVuelo=" + this.idVuelo +
                ", fechaReserva=" + this.fechaReserva +
                '}';
    }
}
