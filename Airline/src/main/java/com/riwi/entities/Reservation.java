package com.riwi.entities;

import java.sql.Date;

public class Reservation {
    private int idReservation;
    private int idPassenger;
    private int idFlight;
    private Date reservationDate;
    private String seat;

    public Reservation() {}

    public Reservation(int idReservation, int idPassenger, Date reservationDate, int idFlight, String seat) {
        this.idReservation = idReservation;
        this.idPassenger = idPassenger;
        this.idFlight = idFlight;
        this.reservationDate = reservationDate;
        this.seat = seat;
    }

    public int getIdReservation() {
        return this.idReservation;
    }

    public int getIdPassenger() {
        return this.idPassenger;
    }

    public int getIdFlight() {
        return this.idFlight;
    }

    public Date getReservationDate() {
        return this.reservationDate;
    }

    public String getSeat() {
        return this.seat;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public void setIdPassenger(int idPassenger) {
        this.idPassenger = idPassenger;
    }

    public void setIdFlight(int idFlight) {
        this.idFlight = idFlight;
    }

    public void setReservationTime(Date reservationTime) {
        this.reservationDate = reservationTime;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "idReservation=" + this.idReservation +
                ", idPassenger=" + this.idPassenger +
                ", idFlight=" + this.idFlight +
                ", reservationDate=" + this.reservationDate +
                ", seat='" + this.seat + '\'' +
                '}';
    }
}
