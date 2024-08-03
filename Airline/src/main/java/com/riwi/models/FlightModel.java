package com.riwi.models;

import com.riwi.entities.Flight;
import com.riwi.persistence.configDB.MysqlConfig;
import com.riwi.persistence.imodel.IflightModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class FlightModel implements IflightModel {
    @Override
    public Flight create(Flight request) {
        //Implementar la conexion con la base de datos
        Connection connection = MysqlConfig.openConnection();

        //Crear la entidad
        Flight flight = null;

        //Ejecutar el query para insertar el avion en la base de datos
        String sqlQuery = "INSERT INTO flight (destination, departure_date, departure_time, id_airline) VALUES (?,?,?,?)";

        try {
            //Preparar la query
            PreparedStatement statement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            //Remplazar los ?
            statement.setString(1, request.getDestination());
            statement.setDate(2, request.getDepartureDate());
            statement.setTime(3, request.getDepartureTime());
            statement.setInt(4, request.getIdAirline());

            //Ejecutar el query
            int result = statement.executeUpdate();

            if (result > 0) {
                ResultSet resultSet = statement.getGeneratedKeys();
                if (resultSet.next()) {
                    //Creamos un nuevo avion
                    flight = new Flight(
                            //Obtenemos el id generado automaticamente y obtenemos los demas atributos
                            resultSet.getInt(1),
                            request.getDestination(),
                            request.getDepartureDate(),
                            request.getDepartureTime(),
                            request.getIdFlight()
                    );
                }
            }
            //Cerramos el prepared statement
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        //Cerramos conexion
        MysqlConfig.closeConnection();

        //Retornamos el avion creado
        return flight;

    }

    @Override
    public void delete(Integer integer) {
        //creamos conexion para abrirla
        Connection connection = MysqlConfig.openConnection();

        //Creamos el query
        String sqlQuery = "DELETE FROM flight WHERE id_flight = ?";

        try {
            //Preparamos el query con statement
            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            //Remplazamos los ?
            statement.setInt(1, integer);

            //Ejecutamos el query
            statement.executeUpdate();
            System.out.println("Vuelo eliminado con exito");

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        //Cerramos conexion
        MysqlConfig.closeConnection();
    }


    @Override
    public ArrayList<Flight> readAll(String name) {

        // Crear una lista para almacenar los pasajeros
        ArrayList<Flight> flights = new ArrayList<>();

        // Establecer la conexión a la base de datos
        Connection connection = MysqlConfig.openConnection();

        // Crear la consulta SQL para leer todos los pasajeros
        String sqlQuery = "SELECT * FROM flight WHERE destination = ?";

        try {
            //Preparar la consulta
            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            // Configurar el parámetro para la búsqueda
            if (name != null && !name.isEmpty()) {
                statement.setString(1, name);
            }
            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery();

            // Procesar los resultados
            while (resultSet.next()) {
                Flight flight = new Flight(
                        resultSet.getInt("id_flight"),
                        resultSet.getString("destination"),
                        resultSet.getDate("departure_date"),
                        resultSet.getTime("departure_time"),
                        resultSet.getInt("id_airline")
                );

                //Agregar el objeto de la base de datos al array
                flights.add(flight);
            }

            //Cerrar el prepare statement y resultset
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

        //Cerrar conexion
        MysqlConfig.closeConnection();

        return flights;
    }

    @Override
    public Flight update(Flight request) {
        Connection connection = MysqlConfig.openConnection();

        String sqlQuery = "UPDATE flight SET departure_date = ?, departure_time = ? WHERE id_flight = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            statement.setDate(1, request.getDepartureDate());
            statement.setTime(2, request.getDepartureTime());
            statement.setInt(3, request.getIdFlight());

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Flight updated successfully");
            } else {
                System.out.println("No flight found with the given ID");
            }

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

        MysqlConfig.closeConnection();

        return request;
    }
}
