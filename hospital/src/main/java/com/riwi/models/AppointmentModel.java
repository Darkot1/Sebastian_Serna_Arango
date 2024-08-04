package com.riwi.models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;

import com.riwi.entities.Appointment;
import com.riwi.persistence.configDB.mysqlConfig;
import com.riwi.persistence.imodel.IappointmentModel;

public class AppointmentModel implements IappointmentModel{

    @Override
    public Appointment create(Appointment request) {
         Appointment appointment = null;

        Connection connection = mysqlConfig.openConnection();

        String sqlQuery = "INSERT INTO appointment (fk_doctor_id, fk_patient_id, appointment_date, appointment_time,reason) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sqlQuery,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            statement.setInt(1, request.getIdDoctor());
            statement.setInt(2, request.getIdPatient());
            statement.setDate(3, request.getAppointmentDate());
            statement.setTime(4, request.getAppointmentDateTime());
            statement.setString(5, request.getReason());

            int result = statement.executeUpdate();

            if (result > 0) {
                ResultSet resultSet = statement.getGeneratedKeys();
                if (resultSet.next()) {

                    appointment = new Appointment(
                        resultSet.getInt(1),
                        request.getIdDoctor(),
                        request.getIdPatient(),
                        request.getAppointmentDate(),
                        request.getAppointmentDateTime(),
                        request.getReason()
                    );
            }    
        }
        statement.close();

        }catch(SQLException e){
            throw new RuntimeException(e.getMessage());
        }
        mysqlConfig.closeConnection();
       return appointment;
    }

    @Override
    public void delete(Integer id) {
        Connection connection = mysqlConfig.openConnection();

        String sqlQuery = "DELETE FROM appointment WHERE id_appointment =?";

        try {

            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            statement.setInt(1, id);

            statement.executeUpdate();

            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } 
    }

    @Override
    public ArrayList<Appointment> readForDate(Date date) {

        ArrayList<Appointment> appointments = new ArrayList<>();

        Connection connection = mysqlConfig.openConnection();

        String sqlQuery = "SELECT * FROM appointment WHERE appointment_date =?";

        try {
            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            statement.setDate(1, date);
            
            ResultSet resultSet = statement.executeQuery();
            
            while(resultSet.next()){
                int idAppointment = resultSet.getInt("id_appointment");
                int idDoctor = resultSet.getInt("fk_doctor_id");
                int idPatient = resultSet.getInt("fk_patient_id");
                Date appointmentDate = resultSet.getDate("appointment_date");
                Time appointmentTime = resultSet.getTime("appointment_time");
                String reason = resultSet.getString("reason");
                
                appointments.add(new Appointment(idAppointment,idDoctor, idPatient, appointmentDate, appointmentTime, reason));
            }
            
            statement.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        
        mysqlConfig.closeConnection();
        
        return appointments;
    }

    @Override
    public void updateAppointmentDate(Integer idAppointment, Date newDate) {
    
        Connection connection = mysqlConfig.openConnection();

        String sqlQuery = "UPDATE appointment SET appointment_date =? WHERE id_appointment =?";

        try {
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            
            statement.setDate(1, newDate);
            statement.setInt(2, idAppointment);
            
            statement.executeUpdate();
            
            statement.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());   
    }
    
    mysqlConfig.closeConnection();

 }

 
}