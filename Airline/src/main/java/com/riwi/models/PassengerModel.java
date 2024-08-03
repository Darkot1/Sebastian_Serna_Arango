package com.riwi.models;

import com.riwi.entities.Passenger;
import com.riwi.persistence.configDB.MysqlConfig;
import com.riwi.persistence.imodel.IpassengerModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PassengerModel implements IpassengerModel {
    @Override
    public Passenger create(Passenger request) {
        // Implementar la conexion con la base de datos
        Connection connection = MysqlConfig.openConnection();

        // Crear la entidad
        Passenger passenger = null;

        // Ejecutar el query para insertar el avion en la base de datos
        String sqlQuery = "INSERT INTO passenger (name,lastname,dni) VALUES (?,?,?)";

        try {
            // Preparar la query
            PreparedStatement statement = connection.prepareStatement(sqlQuery,
                    PreparedStatement.RETURN_GENERATED_KEYS);

            // Remplazar los ?
            statement.setString(1, request.getName());
            statement.setString(2, request.getLastName());
            statement.setString(3, request.getDni());

            // Ejecutar el query
            int result = statement.executeUpdate();

            if (result > 0) {
                ResultSet resultSet = statement.getGeneratedKeys();
                if (resultSet.next()) {
                    // Creamos un nuevo avion
                    passenger = new Passenger(
                            // Obtenemos el id generado automaticamente y obtenemos los demas atributos
                            resultSet.getInt(1),
                            request.getName(),
                            request.getLastName(),
                            request.getDni());
                }
            }
            // Cerramos el prepared statement
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        // Cerramos conexion
        MysqlConfig.closeConnection();

        // Retornamos el avion creado
        return passenger;
    }

    @Override
    public void delete(Integer integer) {
        // creamos conexion para abrirla
        Connection connection = MysqlConfig.openConnection();

        // Creamos el query
        String sqlQuery = "DELETE FROM passenger WHERE id_passenger = ?";

        try {
            // Preparamos el query con statement
            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            // Remplazamos los ?
            statement.setInt(1, integer);

            // Ejecutamos el query
            statement.executeUpdate();
            System.out.println("Usuario eliminado con exito");

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        // Cerramos conexion
        MysqlConfig.closeConnection();
    }

    @Override
    public ArrayList<Passenger> readAll(String name) {
        // Crear una lista para almacenar los pasajeros
        ArrayList<Passenger> passengers = new ArrayList<>();

        // Establecer la conexión a la base de datos
        Connection connection = MysqlConfig.openConnection();

        // Crear la consulta SQL para leer todos los pasajeros
        String sqlQuery = "SELECT * FROM passenger WHERE name = ?";

        try {
            // Preparar la consulta
            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            // Configurar el parámetro para la búsqueda
            if (name != null && !name.isEmpty()) {
                statement.setString(1, name);
            }
            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery();

            // Procesar los resultados
            while (resultSet.next()) {
                Passenger passenger = new Passenger(
                        resultSet.getInt("id_passenger"),
                        resultSet.getString("name"),
                        null,
                        null);

                // Agregar el objeto de la base de datos al array
                passengers.add(passenger);
            }

            // Cerrar el prepare statement y resultset
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

        // Cerrar conexion
        MysqlConfig.closeConnection();

        return passengers;
    }

    @Override
    public Passenger update(Passenger request) {
        Connection connection = MysqlConfig.openConnection();

        String sqlQuery = "UPDATE passenger SET name = ?, lastname = ?, dni = ? WHERE id_passenger = ?";

        try {
            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            statement.setString(1, request.getName());
            statement.setString(2, request.getLastName());
            statement.setString(3, request.getDni());
            statement.setInt(4, request.getIdPassenger());

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Passenger updated successfully");
            } else {
                System.out.println("No passenger found with the given ID");
            }

            statement.close();
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

        MysqlConfig.closeConnection();

        return request;
    }
}
