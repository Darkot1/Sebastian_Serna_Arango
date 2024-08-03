package com.riwi.models;

import com.riwi.entities.Airline;
import com.riwi.persistence.configDB.MysqlConfig;
import com.riwi.persistence.imodel.IairlineModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AirlineModel implements IairlineModel {

    @Override
    public Airline create(Airline request) {
        //Implementar la conexion con la base de datos
        Connection connection = MysqlConfig.openConnection();

        //Crear la entidad
        Airline airline = null;

        //Ejecutar el query para insertar el avion en la base de datos
        String sqlQuery = "INSERT INTO airline (model,capacity) VALUES (?,?)";

        try {
            //Preparar la query
            PreparedStatement statement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            //Remplazar los ?
            statement.setString(1, request.getModel());
            statement.setInt(2, request.getCapacity());

            //Ejecutar el query
            int result = statement.executeUpdate();

            if (result > 0){
                ResultSet resultSet = statement.getGeneratedKeys();
                if (resultSet.next()){
                    //Creamos un nuevo avion
                    airline = new Airline(
                            //Obtenemos el id generado automaticamente y obtenemos los demas atributos
                            resultSet.getInt(1),
                            request.getModel(),
                            request.getCapacity()
                    );
                }
            }
            //Cerramos el prepared statement
            statement.close();

        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
        //Cerramos conexion
        MysqlConfig.closeConnection();

        //Retornamos el avion creado
        return airline;
    }

    @Override
    public void delete(Integer integer) {
        //creamos conexion para abrirla
        Connection connection = MysqlConfig.openConnection();

        //Creamos el query
        String sqlQuery = "DELETE FROM airline WHERE id_airline = ?";

        try {
            //Preparamos el query con statement
            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            //Remplazamos los ?
            statement.setInt(1, integer);

            //Ejecutamos el query
            statement.executeUpdate();
            System.out.println("Avion eliminado con exito");

        }catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
        //Cerramos conexion
        MysqlConfig.closeConnection();
    }
}
