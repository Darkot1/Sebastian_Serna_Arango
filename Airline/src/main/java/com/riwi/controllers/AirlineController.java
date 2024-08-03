package com.riwi.controllers;

import com.riwi.entities.Airline;
import com.riwi.models.AirlineModel;
import com.riwi.persistence.imodel.IairlineModel;

public class AirlineController {

    //Instanciamos la interfaz que tiene el crud
    IairlineModel iairlineModel;

    public AirlineController(){
        //Se instancia el modelo para poder llamar los metodos
        this.iairlineModel = new AirlineModel();
    }

    public Airline create(Airline request){
        //Se retorna el crud de crear el avion
        return iairlineModel.create(request);
    }

    public boolean delete(Integer id){
        //Se llama el crud delete y si este funciona devuelve un true
        iairlineModel.delete(id);
        return true;
    }

}
