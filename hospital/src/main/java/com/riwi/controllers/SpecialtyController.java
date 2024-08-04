package com.riwi.controllers;

import com.riwi.entities.Specialty;
import com.riwi.models.SpecialtyModel;
import com.riwi.persistence.imodel.IspecialtyModel;

public class SpecialtyController {

    IspecialtyModel ispecialtyModel;

    public SpecialtyController(){
        this.ispecialtyModel = new SpecialtyModel();
    }


    public Specialty createSpecialty(Specialty specialty){
        return ispecialtyModel.create(specialty);
    }

    public boolean deleteSpecialty(int idSpecialty){
        ispecialtyModel.delete(idSpecialty);
        return true;
    }

}
