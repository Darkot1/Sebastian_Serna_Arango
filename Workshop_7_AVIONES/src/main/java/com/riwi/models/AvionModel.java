package com.riwi.models;

import com.riwi.entities.Avion;
import com.riwi.persistence.configDB.MysqlConfig;
import com.riwi.persistence.imodel.IAvionModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AvionModel implements IAvionModel {

    @Override
    public Avion create(Avion request) {

        //Implementar la conexion con la base de datos
        Connection connection = MysqlConfig.openConnection();

        //Crear la entidad
        Avion avion = null;

        //Ejecutar el query para insertar el avion en la base de datos
        String sqlQuery = "INSERT INTO avion (modelo,capacidad) VALUES (?,?)";

        try {
            //Preparar la query
            PreparedStatement statement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            //Remplazar los ?
            statement.setString(1, request.getModelo());
            statement.setInt(2, request.getCapacidad());

            //Ejecutar el query
            int result = statement.executeUpdate();

            if (result > 0) {
                ResultSet resultSet = statement.getGeneratedKeys();
                if (resultSet.next()){
                    avion = new Avion(
                            resultSet.getInt(1),
                            request.getModelo(),
                            request.getCapacidad()
                    );
                }
            }
            //Cerramos el prepared
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        //Cerrar la conexion
        MysqlConfig.closeConnection();
        return avion;
    }

    @Override
    public void delete(Integer integer) {
        //Abrir conexion
        Connection connection = MysqlConfig.openConnection();

        //Copiar el Query
        String sqlQuery = "DELETE FROM avion WHERE id_avion = ?";

        try {
            //Perarar el query
            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            //Remplazar los ?
            statement.setInt(1, integer);

            //Ejecutar el query
            statement.executeUpdate();
            System.out.println("Avion eliminado con exito.");

            //Cerrar el preparedStatement
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        //Cerrar conexion
        MysqlConfig.closeConnection();
    }



}