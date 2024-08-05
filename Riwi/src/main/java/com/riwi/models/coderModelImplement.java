package com.riwi.models;

import com.riwi.entities.Coder;
import com.riwi.persistence.configDB.MysqlConfig;
import com.riwi.persistence.imodel.ICoderModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class coderModelImplement implements ICoderModel {
    @Override
    public Coder create(Coder request) {
        Coder coder = null;
        Connection connection = MysqlConfig.openConnection();

        String sqlQuery = "INSERT INTO coder(nombre,apellidos,documento,tecnologia,clan) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement statement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            statement.setString(1, request.getNombre());
            statement.setString(2, request.getApellido());
            statement.setString(3, request.getDocumento());
            statement.setString(4, request.getTecnologia());
            statement.setString(5, request.getClan());

            int rowsAffects = statement.executeUpdate();

            if (rowsAffects > 0) {
                ResultSet generatedKeys = statement.getGeneratedKeys();
                if (generatedKeys.next()) {
                    request.setId(generatedKeys.getInt(1));
                }
            }
            coder = request;

            statement.close();

        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
        MysqlConfig.closeConnection();
        return coder;
    }

    @Override
    public void delete(Integer integer) {

    }
}
