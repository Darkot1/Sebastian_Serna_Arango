package com.riwi.entities;

import java.sql.Date;
import java.sql.Time;

public class Flight {
    //Atributos
    private  int idFlight;
    private String destination;
    private Date departureDate;
    private Time departureTime;
    private int idAirline;

    //Constructores
    //vacio
    public Flight(){}
    //Completo
    public Flight(int idFlight, String destination, Date departureDate, Time departureTime, int idAirline) {
        this.idFlight = idFlight;
        this.destination = destination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.idAirline = idAirline;
    }

    //Getters
    public int getIdFlight() {
        return this.idFlight;
    }

    public String getDestination() {
        return this.destination;
    }

    public Date getDepartureDate() {
        return this.departureDate;
    }

    public Time getDepartureTime() {
        return this.departureTime;
    }

    public int getIdAirline() {
        return this.idAirline;
    }

    //Setters
    public void setIdFlight(int idFlight) {
        this.idFlight = idFlight;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public void setIdAirline(int idAirline) {
        this.idAirline = idAirline;
    }

    //ToString
    @Override
    public String toString() {
        return "Flight {" +
                "idFlight = " + this.idFlight +
                ", destination = " + this.destination +
                ", departureDate = " + this.departureDate +
                ", departureTime = " + this.departureTime +
                ", idAirline = " + this.idAirline +
                 '}';
    }
}
