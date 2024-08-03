package com.riwi.controllers;

import com.riwi.entities.Flight;
import com.riwi.models.FlightModel;
import com.riwi.persistence.imodel.IflightModel;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class FlightController {

    IflightModel iflightModel = null;

    public  FlightController(){
        this.iflightModel = new FlightModel();
    }


    public Flight create(Flight request){
        return iflightModel.create(request);
    }

    public boolean delete(Integer id){
        iflightModel.delete(id);
        return true;
    }

    public ArrayList<Flight> readAll(String name){
        return  iflightModel.readAll(name);
    }

    public Flight updateFlight(Integer id, Date departureDate, Time departureTime){
        Flight flight = new Flight();
        flight.setIdFlight(id);
        flight.setDepartureDate(departureDate);
        flight.setDepartureTime(departureTime);
        return iflightModel.update(flight);
    }

}
