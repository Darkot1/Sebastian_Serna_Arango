package com.riwi.controllers;

import java.util.ArrayList;

import com.riwi.entities.Doctor;
import com.riwi.models.DoctorModel;
import com.riwi.persistence.imodel.IdoctorModel;

public class DoctorController {

    IdoctorModel idoctorModel;

    public DoctorController(){
        this.idoctorModel = new DoctorModel();
    }

   public Doctor createDoctor(Doctor doctor){

        return idoctorModel.create(doctor);

   }

   public boolean deleteDoctor(Integer id){
    idoctorModel.delete(id);
    return true;
   }

   public ArrayList<Doctor> readDoctor(Integer id){
       return idoctorModel.readAllForId(id);
   }

}
