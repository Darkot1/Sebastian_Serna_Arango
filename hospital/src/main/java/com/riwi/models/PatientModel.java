package com.riwi.models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.riwi.entities.Patient;
import com.riwi.persistence.configDB.mysqlConfig;
import com.riwi.persistence.imodel.IpatientModel;

public class PatientModel implements IpatientModel {

    @Override
    public Patient create(Patient request) {
        Patient patient = null;

        Connection connection = mysqlConfig.openConnection();

        String sqlQuery = "INSERT INTO patient (name, lastname, birth_date, dni) VALUES (?,?,?,?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sqlQuery,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            statement.setString(1, request.getName());
            statement.setString(2, request.getLastName());
            statement.setDate(3, request.getBirthDate());
            statement.setString(4, request.getDni());

            int result = statement.executeUpdate();

            if (result > 0) {
                ResultSet resultSet = statement.getGeneratedKeys();
                if (resultSet.next()) {

                    patient = new Patient(
                            resultSet.getInt(1),
                            request.getName(),
                            request.getLastName(),
                            request.getBirthDate(),
                            request.getDni());
                }
            }
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        mysqlConfig.closeConnection();
        return patient;
    }

    @Override
    public void delete(Integer id) {
        Connection connection = mysqlConfig.openConnection();

        String sqlQuery = "DELETE FROM patient WHERE id_patient =?";

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
    public Patient readForString(String value) {
        Patient patient = null;

        Connection connection = mysqlConfig.openConnection();

        String sqlQuery = "SELECT * FROM patient WHERE dni = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sqlQuery);
            statement.setString(1, value);

            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                int idPatient = resultSet.getInt("id_patient");
                String name = resultSet.getString("name");
                String lastname = resultSet.getString("lastname");
                Date birthDate = resultSet.getDate("birth_date");
                String dni = resultSet.getString("dni");

                patient = new Patient(idPatient, name, lastname, birthDate, dni);
            }

            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

        mysqlConfig.closeConnection();

        return patient;
    }

    @Override
    public Patient update(Patient request) {

        Connection connection = mysqlConfig.openConnection();
        String sqlQuery = "UPDATE patient SET name = ?, lastname = ?, birth_date = ?, dni = ? WHERE id_patient = ?";
        Patient updatedPatient = null;

        try {
            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            // Establece los valores de los parámetros en el PreparedStatement
            statement.setString(1, request.getName());
            statement.setString(2, request.getLastName());
            statement.setDate(3, request.getBirthDate());
            statement.setString(4, request.getDni());
            statement.setInt(5, request.getIdPatient());

            // Ejecuta la actualización
            int rowsAffected = statement.executeUpdate();

            // Verifica si la actualización fue exitosa
            if (rowsAffected > 0) {
                // La actualización fue exitosa se retorna el request
                updatedPatient = request;
            } else {
                // Si no se actualizó ningún registro se retorna null
                updatedPatient = null;
            }

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            mysqlConfig.closeConnection();
        }

        return updatedPatient;
    }
}
