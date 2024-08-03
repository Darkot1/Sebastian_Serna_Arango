package com.riwi.controllers;

import com.riwi.entities.Passenger;
import com.riwi.models.PassengerModel;
import com.riwi.persistence.imodel.IpassengerModel;

import java.util.ArrayList;

public class PassengerController {
    // Instanciamos la interfaz que tiene el crud
    IpassengerModel ipassengerModel;

    public PassengerController() {
        // Se instancia el modelo para poder llamar los metodos
        this.ipassengerModel = new PassengerModel();
    }

    public Passenger create(Passenger request) {
        // Se retorna el crud de crear el avion
        return ipassengerModel.create(request);
    }

    public boolean delete(Integer id) {
        // Se llama el crud delete y si este funciona devuelve un true
        ipassengerModel.delete(id);
        return true;
    }

    public ArrayList<Passenger> readAll(String name) {
        return ipassengerModel.readAll(name);
    }

    public Passenger UpdatePassenger(Integer id, String name, String lastname, String dni) {
        // Creamos un nuevo pasajero
        Passenger passenger = new Passenger();
        // Se le pasararia los nuevos valores
        passenger.setIdPassenger(id); // id del pasajero a actualizar
        passenger.setName(name); // Nuevo nombre
        passenger.setLastName(lastname); // Nuevo apellido
        passenger.setDni(dni); // Nuevo dni
        return ipassengerModel.update(passenger); // Se llama al metodo para actualizar y se le pasa el pasajero con los
                                                  // nuevos valores
    }

}
