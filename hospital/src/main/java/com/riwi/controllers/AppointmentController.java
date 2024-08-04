package com.riwi.controllers;

import java.sql.Date;
import java.util.ArrayList;

import com.riwi.entities.Appointment;
import com.riwi.models.AppointmentModel;
import com.riwi.persistence.imodel.IappointmentModel;

public class AppointmentController {

    IappointmentModel iappointmentModel;

    public AppointmentController(){
        this.iappointmentModel = new AppointmentModel();
    }



    public Appointment createAppointment(Appointment appointment){
        return iappointmentModel.create(appointment);
    }

    public boolean deleteAppointment(Integer id){
        iappointmentModel.delete(id);
        return true;
    }

    public ArrayList<Appointment> readAppointmentDate(Date date){
        return iappointmentModel.readForDate(date);
    }

    public boolean updateAppointment(Date date, Integer id){
        iappointmentModel.updateAppointmentDate(id, date);
        return true;
    }

}
