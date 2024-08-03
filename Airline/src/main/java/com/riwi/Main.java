package com.riwi;

import com.riwi.controllers.AirlineController;
import com.riwi.controllers.FlightController;
import com.riwi.controllers.PassengerController;
import com.riwi.controllers.ReservationController;
import com.riwi.entities.Airline;
import com.riwi.entities.Flight;
import com.riwi.entities.Passenger;
import com.riwi.entities.Reservation;

import javax.swing.*;
import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        AirlineController airlineController = new AirlineController();
        PassengerController passengerController = new PassengerController();
        FlightController flightController = new FlightController();
        ReservationController reservationController = new ReservationController();

        boolean exit = false;
        while (!exit) {
            int option = Integer.parseInt(JOptionPane.showInputDialog("MENU AIR EXPRESS\n" +
                    "1. Aerolineas\n " +
                    "2. Vuelos \n" +
                    "3. Usuarios \n" +
                    "4. Reservas \n" +
                    "5. Salir \n" +
                    "Seleccione una opcion: "));
            switch (option) {
                case 1:
                    boolean backmenu = false;
                    while (!backmenu) {
                        int airlineOption = Integer.parseInt(JOptionPane.showInputDialog("MENU AEROLINEAS\n" +
                                "1. Agregar Avion\n" +
                                "2. Eliminar Avion\n" +
                                "3. Regresar al Menu Anterior\n" +
                                "Seleccione una opcion: "));
                        switch (airlineOption) {
                            case 1:
                                // Agregar avion
                                String model = JOptionPane.showInputDialog("Ingrese el modelo del avion");
                                int capacity = Integer
                                        .parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del avion"));

                                // Creamos un nuevo avion
                                Airline newAirline = new Airline(0, model, capacity);
                                // se instancia un avion para pasarle el constructor del controlador y pasarle
                                // el avion al metodo create
                                Airline createAirline = airlineController.create(newAirline);

                                if (createAirline != null) {
                                    JOptionPane.showMessageDialog(null, "Avion creado con exito: " + createAirline);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Hubo un error al crear el avion.");
                                }

                                break;
                            case 2:
                                // Eliminar avion
                                int airlineId = Integer.parseInt(
                                        JOptionPane.showInputDialog("Ingrese el id del avion que desea eliminar"));
                                boolean deleteAirline = airlineController.delete(airlineId);

                                if (deleteAirline) {
                                    JOptionPane.showMessageDialog(null, "Avion eliminado con exito.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Hubo un error al eliminar el avion.");
                                }
                                break;
                            case 3:
                                backmenu = true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion invalida.");
                        }
                    }
                    break;
                case 2:
                    // Vuelos
                    boolean backmenu1 = false;
                    while (!backmenu1) {
                        int flightOption = Integer.parseInt(JOptionPane.showInputDialog("MENU VUELOS\n" +
                                "1. Agregar vuelos\n" +
                                "2. Eliminar vuelos\n" +
                                "3. Buscar vuelos por destino\n" +
                                "4. Cambiar fecha de vuelo\n" +
                                "5. Regresar al menu anterior\n" +
                                "seleccione una opcion: "));
                        switch (flightOption) {
                            case 1:
                                String destination = JOptionPane.showInputDialog("Ingrese el destino del vuelo");
                                Date departureDate = Date
                                        .valueOf(JOptionPane.showInputDialog("Ingrese la fecha de salida"));
                                Time departureTIme = Time
                                        .valueOf(JOptionPane.showInputDialog("Ingrese la hora de salida"));
                                int idAirline = Integer
                                        .parseInt(JOptionPane.showInputDialog("Ingrese el ID del avion"));

                                Flight flight = new Flight(0, destination, departureDate, departureTIme, idAirline);
                                Flight newFlight = flightController.create(flight);
                                if (newFlight != null) {
                                    JOptionPane.showMessageDialog(null, "Vuelo creado con exito: " + newFlight);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Ocurrio un error al crear el vuelo");
                                }

                                break;
                            case 2:
                                int idFlight = Integer
                                        .parseInt(JOptionPane.showInputDialog("Ingrese el id del vuelo a eliminar"));
                                boolean deleteFlight = flightController.delete(idFlight);
                                if (deleteFlight) {
                                    JOptionPane.showMessageDialog(null, "Vuelo eliminado con exito.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Hubo un error al eliminar el Vuelo.");
                                }

                                break;
                            case 3:
                                String destinationFlight = JOptionPane
                                        .showInputDialog("Ingrese el destino para saber los vuelos");
                                ArrayList<Flight> flights = flightController.readAll(destinationFlight);
                                for (Flight flight1 : flights) {
                                    System.out.println(flight1);
                                }

                                break;
                            case 4:

                                int idFlightChange = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del vuelo apra actualizar su salida"));

                                Date newDepartureDate = Date.valueOf(JOptionPane.showInputDialog("Ingrese la nueva fecha de salida"));

                                Time newDepartureTime = Time.valueOf(JOptionPane.showInputDialog("Ingrese la nueva hora de salida"));

                                Flight updateFlight = flightController.updateFlight(idFlightChange, newDepartureDate, newDepartureTime);

                                if (updateFlight != null) {
                                    JOptionPane.showMessageDialog(null, "Vuelo actualizado con exito, su nueva hora es: "+updateFlight);
                                }

                                break;

                            case 5:
                                backmenu1 = true;
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                        }
                    }

                    break;
                case 3:
                    // Usuarios
                    boolean backmenu2 = false;
                    while (!backmenu2) {
                        int userOption = Integer.parseInt(JOptionPane.showInputDialog("MENU USUARIOS\n" +
                                "1. Agregar Usuario\n" +
                                "2. Eliminar Usuario\n" +
                                "3. Buscar Usuarios por nombre\n" +
                                "4. Actualizar datos del usuario\n" +
                                "5. Regresar al Menu Anterior\n" +
                                "Seleccione una opcion: "));
                        switch (userOption) {
                            case 1:
                                String userName = JOptionPane.showInputDialog("Ingrese el nombre del usuario");
                                String lastName = JOptionPane.showInputDialog("Ingrese el apellido del usuario");
                                String dni = JOptionPane.showInputDialog("Ingrese el dni del pasajero");

                                // Creamos el pasajero
                                Passenger passenger = new Passenger(0, userName, lastName, dni);
                                Passenger createPassenger = passengerController.create(passenger);

                                if (createPassenger != null) {
                                    JOptionPane.showMessageDialog(null,
                                            "Pasajero creado con exito: " + createPassenger);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Hubo un error al crear el pasajero.");
                                }

                                break;
                            case 2:
                                // ELiminar usuarios
                                int passangerID = Integer
                                        .parseInt(JOptionPane.showInputDialog("Ingrese el id del usuario a eliminar"));
                                boolean deleteUser = airlineController.delete(passangerID);

                                if (deleteUser) {
                                    JOptionPane.showMessageDialog(null, "Pasajero eliminado con exito.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Hubo un error al eliminar el Pasajero.");
                                }

                                break;

                            case 3:
                                // Buscar usuarios
                                String name = JOptionPane
                                        .showInputDialog("Ingrese el nombre de los pasajeros a buscar");
                                ArrayList<Passenger> passengers = passengerController.readAll(name);
                                for (Passenger passenger1 : passengers) {
                                    System.out.println(passenger1.toString2());
                                }

                                break;
                            case 4:
                                // Actualizar datos del usuario
                                int idUser = Integer.parseInt(
                                        JOptionPane.showInputDialog("Ingrese el id del usuario a actualizar"));

                                String newName = JOptionPane.showInputDialog("Ingrese el nuevo nombre del usuario");

                                String newLastName = JOptionPane
                                        .showInputDialog("Ingrese el nuevo apellido del usuario");

                                String newDni = JOptionPane.showInputDialog("Ingrese el nuevo DNI del usuario");

                                Passenger passengerUpdate = passengerController.UpdatePassenger(idUser, newName,
                                        newLastName, newDni);

                                if (passengerUpdate != null) {
                                    JOptionPane.showMessageDialog(null, "Pasajero Actualizado con exito.");
                                }

                                break;
                            case 5:

                                backmenu2 = true;
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida");

                        }
                    }
                    break;
                case 4:
                    // Reservas
                    boolean backmenu3 = false;
                    while (!backmenu3) {
                        int reservationOption = Integer.parseInt(JOptionPane.showInputDialog("MENU RESERVACIONES\n" +
                                "1. Hacer un reservacion\n" +
                                "2. Eliminar una reservacion\n" +
                                "3. Cambiar aciento de la reservacion\n" +
                                "4. Regresar al Menu Anterior\n" +
                                "Seleccione una opcion: "));
                        switch (reservationOption) {
                            case 1:
                                int idPassenger = Integer
                                        .parseInt(JOptionPane.showInputDialog("Ingrese el id del pasajero a reservar"));
                                Date dateReservation = Date
                                        .valueOf(JOptionPane.showInputDialog("Ingrese la fecha de la reservacion"));
                                int idFlight = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del vuelo"));
                                String seat = JOptionPane.showInputDialog("Ingrese la silla de la reservacion");

                                Reservation reservation = new Reservation(0, idPassenger, dateReservation, idFlight,
                                        seat);
                                Reservation createReservation = reservationController.create(reservation);
                                if (createReservation != null) {
                                    JOptionPane.showMessageDialog(null,
                                            "reservacion creado con exito: " + createReservation);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Hubo un error al hacer la reserva.");
                                }

                                break;

                            case 2:
                                int idReservation = Integer.parseInt(
                                        JOptionPane.showInputDialog("Ingrese el id de la reservacion para eliminar"));
                                boolean deleteReservation = reservationController.delete(idReservation);
                                if (deleteReservation) {
                                    JOptionPane.showMessageDialog(null, "Reservacion eliminado con exito.");
                                } else {
                                    JOptionPane.showMessageDialog(null, "Hubo un error al eliminar la reservacion");
                                }

                                break;
                            case 3:
                                int idReservationUpdate = Integer.parseInt(JOptionPane
                                        .showInputDialog("Ingrese el id de la reservacion para actualizar la silla"));

                                String newSeat = JOptionPane
                                        .showInputDialog("Ingrese la nueva silla de la reservacion");

                                reservationController.updateReservation(idReservationUpdate, newSeat);

                                break;

                            case 4:
                                backmenu3 = true;
                                break;

                            default:
                                JOptionPane.showMessageDialog(null, "Opcion no valida");
                        }

                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
            }

        }

    }
}