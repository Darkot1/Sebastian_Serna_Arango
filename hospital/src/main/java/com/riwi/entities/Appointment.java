package com.riwi.entities;

import java.sql.Date;
import java.sql.Time;

public class Appointment {

    private int idAppointment;
    private int idDoctor;
    private int idPatient;
    private Date appointmentDate;
    private Time appointmentDateTime;
    private String reason;

    public Appointment(){}

    public Appointment(int idAppointment, int idDoctor, int idPatient, Date appointmentDate, Time appointmentDateTime,
            String reason) {
        this.idAppointment = idAppointment;
        this.idDoctor = idDoctor;
        this.idPatient = idPatient;
        this.appointmentDate = appointmentDate;
        this.appointmentDateTime = appointmentDateTime;
        this.reason = reason;
    }


    public int getIdAppointment() {
        return this.idAppointment;
    }

    public int getIdDoctor() {
        return this.idDoctor;
    }

    public int getIdPatient() {
        return this.idPatient;
    }

    public Date getAppointmentDate() {
        return this.appointmentDate;
    }

    public Time getAppointmentDateTime() {
        return this.appointmentDateTime;
    }

    public String getReason() {
        return this.reason;
    }


    public void setIdAppointment(int idAppointment) {
        this.idAppointment = idAppointment;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public void setIdPatient(int idPatient) {
        this.idPatient = idPatient;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public void setAppointmentDateTime(Time appointmentDateTime) {
        this.appointmentDateTime = appointmentDateTime;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Appointment:\n" +
               " ID Appointment: " + this.idAppointment + "\n" +
               " ID Doctor: " + this.idDoctor + "\n" +
               " ID Patient: " + this.idPatient + "\n" +
               " Date: " + this.appointmentDate + "\n" +
               " Time: " + this.appointmentDateTime + "\n" +
               " Reason: " + this.reason + "\n";
    }

    
    

}
