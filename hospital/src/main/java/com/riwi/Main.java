package com.riwi;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import com.riwi.controllers.AppointmentController;
import com.riwi.controllers.DoctorController;
import com.riwi.controllers.PatientController;
import com.riwi.controllers.SpecialtyController;
import com.riwi.entities.Appointment;
import com.riwi.entities.Doctor;
import com.riwi.entities.Patient;
import com.riwi.entities.Specialty;

public class Main {
    public static void main(String[] args) {
        
        //Create controllers
        SpecialtyController specialtyController = new SpecialtyController();
        DoctorController doctorController = new DoctorController();
        PatientController patientController = new PatientController();
        AppointmentController appointmentController = new AppointmentController();

        boolean exit = false;
        while (!exit) {
            int option = Integer.parseInt(JOptionPane.showInputDialog("MENU HOSPITAL\n" +
                    "1. Especialidades\n" +
                    "2. Medicos\n" +
                    "3. Pacientes\n" +
                    "4. Citas\n" +
                    "5. Salir\n" +
                    "Seleccione una opcion: "));

            switch (option) {
                case 1:
                    // Especialidades
                    boolean backmenu = false;
                    while (!backmenu) {
                        int specialtyOption = Integer.parseInt(JOptionPane.showInputDialog("MENU ESPECIALIDADES\n" +
                                "1. Agregar especialidad\n" +
                                "2. Eliminar especialidad\n" +
                                "3. Regresar al Menu Anterior\n" +
                                "Seleccione una opcion: "));
                        switch (specialtyOption) {
                            case 1:
                                // Agregar especialidad
                                String name = JOptionPane.showInputDialog("Ingrese el nombre de la especializacion");
                                String description = JOptionPane.showInputDialog("Ingrese la descripcion del a especializacion");

                                Specialty specialty = new Specialty(0,name, description);
                                Specialty createSpecialty = specialtyController.createSpecialty(specialty);

                                if (createSpecialty != null) {
                                    JOptionPane.showMessageDialog(null,"Especiadad agregada con exito.");
                                }

                                break;
                            case 2:
                                // Eliminar especialidad
                                int idSpecialty = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la especializacion a eliminar: "));
                                boolean deleteSpecialty = specialtyController.deleteSpecialty(idSpecialty);
                                if (deleteSpecialty) {
                                    JOptionPane.showMessageDialog(null,"Especializacion eliminada con exito");
                                }
                                break;
                            case 3:
                                backmenu = true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion invalida");
                                break;
                        }
                    }
                    break;

                case 2:
                    // Medicos
                    backmenu = false;
                    while (!backmenu) {
                        int doctorOption = Integer.parseInt(JOptionPane.showInputDialog("MENU MEDICOS\n" +
                                "1. Agregar medico\n" +
                                "2. Eliminar medico\n" +
                                "3. Buscar todos los medicos de una especialidad\n" +
                                "4. Regresar al Menu Anterior\n" +
                                "Seleccione una opcion: "));
                        switch (doctorOption) {
                            case 1:
                                // Agregar medico
                                String name = JOptionPane.showInputDialog("Ingrese el nombre del medico");
                                String lastname = JOptionPane.showInputDialog("Ingrese el apellido del medico");
                                int idSpecialty = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la especializacion del medico"));

                                Doctor doctor = new Doctor(0,name,lastname,idSpecialty);
                                Doctor newDoctor = doctorController.createDoctor(doctor);

                                if (newDoctor != null) {
                                    JOptionPane.showMessageDialog(null,"medico agregado con exito.");
                                }
                                break;
                            case 2:

                                // Eliminar medico
                                 int doctorId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del medico que desea eliminar"));
                                 boolean deleteDoctor = doctorController.deleteDoctor(doctorId);
                                 if (deleteDoctor) {
                                     JOptionPane.showMessageDialog(null,"medico eliminado con exito.");
                                 }

                                break;
                            case 3:
                            // Buscar todos los medicos de una especialidad
                                 
                                 int idSpecialtySearch = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id de la especialidad para ver todos los medicos"));
                                
                                 ArrayList<Doctor> doctorsBySpecialty = doctorController.readDoctor(idSpecialtySearch);

                                 int count = 0;
                                 StringBuilder doctorInfo = new StringBuilder("Medicos encontrados:\n");

                                 if (doctorsBySpecialty.size() > 0) {
                                    for (Doctor specialty : doctorsBySpecialty) {
                                         count++;
                                         doctorInfo.append(specialty).append("\n");
                                    }
                                    doctorInfo.insert(0, "Cantidad: " + count + "\n");
                                    JOptionPane.showMessageDialog(null, doctorInfo.toString());
                                 }
                                break;

                            case 4:
                                backmenu = true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion invalida");
                                break;
                        }
                    }
                    break;

                case 3:
                    // Pacientes
                    backmenu = false;
                    while (!backmenu) {
                        int patientOption = Integer.parseInt(JOptionPane.showInputDialog("MENU PACIENTES\n" +
                                "1. Agregar paciente\n" +
                                "2. Eliminar paciente\n" +
                                "3. Buscar paciente por dni\n" +
                                "4. Actualizar datos del paciente\n" +
                                "5. Regresar al Menu Anterior\n" +
                                "Seleccione una opcion: "));
                        switch (patientOption) {
                            case 1:
                                // Agregar paciente
                                String name = JOptionPane.showInputDialog("Ingrese el nombre del paciente");
                                String lastname = JOptionPane.showInputDialog("Ingrese el apellido del paciente");
                                Date birthDate = Date.valueOf(JOptionPane.showInputDialog("Ingrese la fecha de naciemiento del paciente"));
                                String dni = JOptionPane.showInputDialog("Ingres el dni del paciente");

                                Patient patient = new Patient(0,name,lastname,birthDate,dni);
                                Patient newPatient = patientController.createPatient(patient);
                                if (newPatient != null) {
                                    JOptionPane.showMessageDialog(null,"Paciente registrado con exito \n" +
                                    ""+newPatient);
                                }
                                break;
                            case 2:
                                // Eliminar paciente
                                 int patientId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del paciente que desea eliminar"));
                                 boolean deletePatient = patientController.deletePatient(patientId);
                                 if (deletePatient) {
                                     JOptionPane.showMessageDialog(null,"Paciente eliminado con exito.");
                                 }
                                break;
                            case 3:
                            //Buscar paciente por dni
                                String dniSearch = JOptionPane.showInputDialog("Ingrese el DNI para buscar al paciente");
                                
                                Patient searchPatient = patientController.readPatient(dniSearch);
                                 if (searchPatient != null){
                                    JOptionPane.showMessageDialog(null,searchPatient);
                                 }else{
                                     JOptionPane.showMessageDialog(null,"Paciente no encontrado");
                                 }
                                 
                                break;
                            case 4: 
                            //Actualizar datos del paciente
                             int patientIdUpdate = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del paciente que desea actualizar"));
                                 String newName = JOptionPane.showInputDialog("Ingrese el nuevo nombre del paciente");
                                 String newLastname = JOptionPane.showInputDialog("Ingrese el nuevo apellido del paciente");
                                 Date newBirthDate = Date.valueOf(JOptionPane.showInputDialog("Ingrese la nueva fecha de nacimiento del paciente"));
                                 String newDni = JOptionPane.showInputDialog("Ingrese el nuevo dni del paciente");

                                 Patient Patient = new Patient(patientIdUpdate, newName, newLastname, newBirthDate, newDni);

                                 Patient updatePatient = patientController.updatePatient(Patient);

                                 if (updatePatient != null) {
                                     JOptionPane.showMessageDialog(null,"Datos del paciente actualizados con exito \n" +
                                     ""+updatePatient);
                                 }
                                
                                break;
                                
                                case 5: 
                                backmenu = true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion invalida");
                                break;
                        }
                    }
                    break;

                case 4:
                    // Citas
                    backmenu = false;
                    while (!backmenu) {
                        int appointmentOption = Integer.parseInt(JOptionPane.showInputDialog("MENU CITAS\n" +
                                "1. Agregar cita\n" +
                                "2. Eliminar cita\n" +
                                "3. Buscar cita por fecha\n" +
                                "4. Actualizar fecha de la cita\n" +
                                "5. Regresar al Menu Anterior\n" +
                                "Seleccione una opcion: "));
                        switch (appointmentOption) {
                            case 1:
                                // Agregar cita
                                int doctorId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del medico "));
                                int patientId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del paciente "));
                                Date appointmentDate = Date.valueOf(JOptionPane.showInputDialog("Ingrese la fecha en que se realizo el cita"));
                                Time appointmentTime = Time.valueOf(JOptionPane.showInputDialog("Ingrese la hora en que se realizo el cita"));
                                String reason = JOptionPane.showInputDialog("Ingrese la razon por la que se realizo el cita");

                                Appointment appointment = new Appointment(0, doctorId, patientId, appointmentDate, appointmentTime, reason);
                                Appointment newAppointment = appointmentController.createAppointment(appointment);

                                if (newAppointment != null) {
                                    JOptionPane.showMessageDialog(null,"Cita generada con exito");
                                }
                                break;
                            case 2:
                                // Eliminar cita
                                 int appointmentId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la cita que desea eliminar"));
                                 boolean deleteAppointment = appointmentController.deleteAppointment(appointmentId);
                                 if (deleteAppointment) {
                                     JOptionPane.showMessageDialog(null,"Cita eliminada con exito.");
                                 }

 
                                break;
                            case 3:
                                // Buscar cita por fecha
                                Date readAppointmentDate = Date.valueOf(JOptionPane.showInputDialog("Ingrese la fecha en que desea buscar las citas"));

                                ArrayList<Appointment> readAppointments = new ArrayList<>();
                                readAppointments = appointmentController.readAppointmentDate(readAppointmentDate);

                                if (readAppointments.size() > 0) {
                                    int count = 0;
                                    StringBuilder appointmentsInfo = new StringBuilder("Citas encontradas:\n");
                                    for (Appointment readAppoint : readAppointments) {
                                        count++;
                                        appointmentsInfo.append(readAppoint).append("\n");
                                    }
                                    appointmentsInfo.insert(0, "Cantidad: " + count + "\n");
                                    JOptionPane.showMessageDialog(null, appointmentsInfo.toString());
                                }else{
                                    JOptionPane.showMessageDialog(null, "No se encontraron citas para esa fecha.");
                                }
                                
                              
 
                                break;
                            case 4:
                            //Actutalizar fecha de la cita
                             int appointmentUpdateId = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID de la cita que desea actualizar"));

                                 Date newAppointmentDate = Date.valueOf(JOptionPane.showInputDialog("Ingrese la nueva fecha de la cita"));

                                 boolean updateAppointment = appointmentController.updateAppointment(newAppointmentDate, appointmentUpdateId);

                                 if (updateAppointment) {
                                     JOptionPane.showMessageDialog(null,"Fecha de la cita actualizada con exito.");
                                 }

                                 break;

                            case 5:
                            backmenu = true;
                            break;
                            default:
                                JOptionPane.showMessageDialog(null, "Opcion invalida");
                                break;
                        }
                    }
                    break;

                case 5:
                    exit = true;
                    JOptionPane.showMessageDialog(null, "Hasta Luego :)");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida.");
                    break;
            }
        }
    }
}
