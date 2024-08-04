package com.riwi.controllers;

import com.riwi.entities.Patient;
import com.riwi.models.PatientModel;
import com.riwi.persistence.imodel.IpatientModel;

public class PatientController {

    IpatientModel ipatientModel;

    public PatientController(){
        this.ipatientModel = new PatientModel();
    }


     public Patient createPatient(Patient patient){
        return ipatientModel.create(patient);

   }

   public boolean deletePatient(Integer id){
     ipatientModel.delete(id);
     return true;
    }

    public Patient readPatient(String dni){
        return ipatientModel.readForString(dni);
    }

    public Patient updatePatient(Patient patient){
        return ipatientModel.update(patient);
    }
 
}
