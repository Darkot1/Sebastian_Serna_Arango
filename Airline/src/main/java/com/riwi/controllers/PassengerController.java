package com.riwi.controllers;


import com.riwi.entities.Passenger;
import com.riwi.models.PassengerModel;
import com.riwi.persistence.imodel.IpassengerModel;

import java.util.ArrayList;

public class PassengerController {
    //Instanciamos la interfaz que tiene el crud
    IpassengerModel ipassengerModel;

    public PassengerController(){
        //Se instancia el modelo para poder llamar los metodos
        this.ipassengerModel = new PassengerModel();
    }

    public Passenger create(Passenger request){
        //Se retorna el crud de crear el avion
        return ipassengerModel.create(request);
    }

    public boolean delete(Integer id){
        //Se llama el crud delete y si este funciona devuelve un true
        ipassengerModel.delete(id);
        return true;
    }

    public ArrayList<Passenger> readAll(String name){
        return  ipassengerModel.readAll(name);
    }

}
