package com.riwi.models;

import com.riwi.entities.Avion;
import com.riwi.entities.Pasajero;
import com.riwi.persistence.configDB.MysqlConfig;
import com.riwi.persistence.imodel.IPasajeroModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PasajeroModel implements IPasajeroModel {

    @Override
    public Pasajero create(Pasajero request) {

        //Implementar la conexion con la base de datos
        Connection connection = MysqlConfig.openConnection();

        //Crear la entidad
        Pasajero pasajero = null;

        //Ejecutar el query para insertar el avion en la base de datos
        String sqlQuery = "INSERT INTO pasajero (nombre,apellido,documento_identidad) VALUES (?,?,?)";

        try {
            //Preparar la query
            PreparedStatement statement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            //Remplazar los ?
            statement.setString(1, request.getNombre());
            statement.setString(2, request.getApellido());
            statement.setString(3, request.getNumeroDocumento());

            //Ejecutar el query
            int result = statement.executeUpdate();

            if (result > 0) {
                ResultSet resultSet = statement.getGeneratedKeys();
                if (resultSet.next()){
                    pasajero = new Pasajero(
                            resultSet.getInt(1),
                            request.getNombre(),
                            request.getApellido(),
                            request.getNumeroDocumento()
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
        return pasajero;
    }

    @Override
    public void delete(Integer integer) {
        //Abrir conexion
        Connection connection = MysqlConfig.openConnection();

        //Copiar el Query
        String sqlQuery = "DELETE FROM pasajero WHERE id_avion = ?";

        try {
            //Perarar el query
            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            //Remplazar los ?
            statement.setInt(1, integer);

            //Ejecutar el query
            statement.executeUpdate();
            System.out.println("Pasajero eliminado con exito.");

            //Cerrar el preparedStatement
            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        //Cerrar conexion
        MysqlConfig.closeConnection();
    }
}
