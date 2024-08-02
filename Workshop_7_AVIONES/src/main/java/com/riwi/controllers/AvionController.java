package com.riwi.controllers;

import com.riwi.entities.Avion;
import com.riwi.models.AvionModel;
import com.riwi.persistence.imodel.IAvionModel;

public class AvionController {

IAvionModel iavionModel;

public AvionController(){
    this.iavionModel = new AvionModel();
}

    public Avion create(Avion request){
       return iavionModel.create(request);
    }

    public boolean delete(Integer id){
        iavionModel.delete(id);
        return true;
    }

}
