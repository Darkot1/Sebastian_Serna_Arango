package com.riwi;

import com.riwi.controllers.AvionController;
import com.riwi.entities.Avion;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        AvionController avioncontroller = new AvionController();

        boolean exit = false;

        while (!exit){
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
                    while (!backmenu){
                        int airlineOption = Integer.parseInt(JOptionPane.showInputDialog("MENU AEROLINEAS\n" +
                                "1. Agregar Avion\n" +
                                "2. Eliminar Avion\n" +
                                "3. Regresar al Menu Anterior\n" +
                                "Seleccione una opcion: "));
                        switch (airlineOption){
                            case 1:
                                //Agregar avion
                                String modelo = JOptionPane.showInputDialog("Ingrese el modelo del avion");
                                int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la capacidad del avion"));

                                Avion newAvion = new Avion(0, modelo, capacidad);
                                Avion createAvion = avioncontroller.create(newAvion);
                                if (createAvion != null ){
                                    JOptionPane.showMessageDialog(null, "Avion creado con exito: " + createAvion);
                                }else {
                                    JOptionPane.showMessageDialog(null, "Hubo un error al crear el avion.");
                                }

                                break;
                            case 2:
                                //Eliminar avion
                                int avionId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del avion que desea eliminar"));
                                boolean deleteAvion = avioncontroller.delete(avionId);
                                if (deleteAvion){
                                    JOptionPane.showMessageDialog(null, "Avion eliminado con exito.");
                                }else {
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
                    break;
                case 3:
                    // Usuarios
                    boolean backmenu1 = false;
                    while (!backmenu1){
                        int userOption = Integer.parseInt(JOptionPane.showInputDialog("MENU USUARIOS\n" +
                                "1. Agregar Usuario\n" +
                                "2. Eliminar Usuario\n" +
                                "3. Regresar al Menu Anterior\n" +
                                "Seleccione una opcion: "));
                        switch (userOption){
                            case 1:

                                break;
                            case 2:
                                break;

                            case 3:
                                break;
                            default:

                        }
                    }
                    break;
                case 4:
                    // Reservas
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