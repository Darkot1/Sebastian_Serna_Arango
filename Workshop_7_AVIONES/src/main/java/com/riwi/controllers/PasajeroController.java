package com.riwi.controllers;

import com.riwi.entities.Pasajero;
import com.riwi.models.PasajeroModel;
import com.riwi.persistence.imodel.IPasajeroModel;

public class PasajeroController {

    IPasajeroModel IPasajeromodel;

    public PasajeroController(){
        this.IPasajeromodel = new PasajeroModel();
    }

    public Pasajero create(Pasajero request){
        return IPasajeromodel.create(request);
    }

    public boolean delete(Integer id){
        IPasajeromodel.delete(id);
        return true;
    }
}
