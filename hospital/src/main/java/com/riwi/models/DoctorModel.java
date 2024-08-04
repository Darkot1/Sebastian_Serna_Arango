package com.riwi.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.riwi.entities.Doctor;
import com.riwi.persistence.configDB.mysqlConfig;
import com.riwi.persistence.imodel.IdoctorModel;

public class DoctorModel implements IdoctorModel{

    @Override
    public Doctor create(Doctor request) {
        
        Doctor doctor = null;

        Connection connection = mysqlConfig.openConnection();

        String sqlQuery = "INSERT INTO doctor (name, lastname, fk_specialty_id) VALUES (?,?,?)";

        try{
        PreparedStatement statement = connection.prepareStatement(sqlQuery,PreparedStatement.RETURN_GENERATED_KEYS);

        statement.setString(1, request.getName());
        statement.setString(2, request.getLastName());
        statement.setInt(3, request.getIdSpecialty());

        int result = statement.executeUpdate();
        
        if(result > 0){
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                
                doctor = new Doctor(resultSet.getInt(1),
                 request.getName(), 
                 request.getLastName(), 
                 request.getIdSpecialty()
                );
            }
        }
        statement.close();
        }catch(SQLException e){
            throw new RuntimeException(e.getMessage());
        }
        mysqlConfig.closeConnection();
       return doctor;
    }

    @Override
    public void delete(Integer id) {
        Connection connection = mysqlConfig.openConnection();

        String sqlQuery = "DELETE FROM doctor WHERE id_doctor = ?";

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
    public ArrayList<Doctor> readAllForId(Integer id) {

        ArrayList<Doctor> doctors = new ArrayList<>();

        Connection connection = mysqlConfig.openConnection();

        String sqlQuery = "SELECT * from doctor WHERE fk_specialty_id = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                doctors.add(new Doctor(resultSet.getInt("id_doctor"), 
                        resultSet.getString("name"), 
                        resultSet.getString("lastname"), 
                        resultSet.getInt("fk_specialty_id")
                    )
                );
            }
            statement.close();
            
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        
        mysqlConfig.closeConnection();

        return doctors;
    }

}