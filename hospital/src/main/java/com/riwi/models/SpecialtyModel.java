package com.riwi.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.riwi.entities.Specialty;
import com.riwi.persistence.configDB.mysqlConfig;
import com.riwi.persistence.imodel.IspecialtyModel;

public class SpecialtyModel implements IspecialtyModel{

    @Override
    public Specialty create(Specialty request) {

        Specialty specialty = null;

        Connection connection = mysqlConfig.openConnection();

        String sqlQuery = "INSERT INTO specialty (name, description) VALUES (?,?)";

        try {
            // Prepare the statement
            PreparedStatement statement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            // remplazar los ?? con los getts de la entidad
            statement.setString(1, request.getName());
            statement.setString(2, request.getDescription());

            // Ejecutar el query
            int result = statement.executeUpdate();

            if (result > 0) {
                ResultSet resultSet = statement.getGeneratedKeys();
                if (resultSet.next()) {

                    specialty = new Specialty(
                            resultSet.getInt(1), 
                            request.getName(),
                            request.getDescription()
                    );
                }
            }
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

        mysqlConfig.closeConnection();

        return specialty;
    }

    @Override
    public void delete(Integer id) {

        Connection connection = mysqlConfig.openConnection();

        String sqlQuery = "DELETE FROM specialty WHERE id_specialty =?";

        try {

            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            statement.setInt(1, id);

            statement.executeUpdate();

            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } 
    }
}
