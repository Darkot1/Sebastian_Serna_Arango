package com.riwi.controllers;

import com.riwi.entities.Reservation;
import com.riwi.models.ReservationModel;
import com.riwi.persistence.imodel.IreservationModel;

public class ReservationController {

    IreservationModel ireservationModel;

    public ReservationController(){
        this.ireservationModel = new ReservationModel();
    }


    public Reservation create(Reservation request){
        return  ireservationModel.create(request);
    }

    public boolean delete(Integer id){
        ireservationModel.delete(id);
        return true;
    }

    public void updateReservation(int idReservation, String newSeat) {
        Reservation reservation = new Reservation();
        reservation.setIdReservation(idReservation);
        reservation.setSeat(newSeat);

        ireservationModel.update(reservation);
    }

}
