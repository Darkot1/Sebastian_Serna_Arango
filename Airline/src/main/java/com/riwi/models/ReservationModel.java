package com.riwi.models;

import com.riwi.entities.Flight;
import com.riwi.entities.Reservation;
import com.riwi.persistence.configDB.MysqlConfig;
import com.riwi.persistence.imodel.IreservationModel;

import javax.swing.text.html.parser.Entity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ReservationModel implements IreservationModel {
    @Override
    public Reservation create(Reservation request) {
        //Implementar la conexion con la base de datos
        Connection connection = MysqlConfig.openConnection();

        //Crear la entidad
        Reservation reservation = null;
        //Ejecutar el query para insertar el avion en la base de datos
        String sqlQuery = "INSERT INTO reservation (id_passenger,reservation_date,id_flight,seat) VALUES (?,?,?,?)";

        try {
            //Preparar la query
            PreparedStatement statement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            //Remplazar los ?
            statement.setInt(1, request.getIdPassenger());
            statement.setDate(2, request.getReservationDate());
            statement.setInt(3,request.getIdFlight());
            statement.setString(4,request.getSeat());

            //Ejecutar el query
            int result = statement.executeUpdate();

            if (result > 0){
                ResultSet resultSet = statement.getGeneratedKeys();
                if (resultSet.next()){
                    //Creamos un nuevo avion
                    reservation = new Reservation(
                            //Obtenemos el id generado automaticamente y obtenemos los demas atributos
                            resultSet.getInt(1),
                            request.getIdPassenger(),
                            request.getReservationDate(),
                            request.getIdFlight(),
                            request.getSeat()
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
        return reservation;

    }

    @Override
    public void delete(Integer integer) {

    }


    @Override
    public ArrayList<Reservation> readAll(Integer id) {
        // Crear una lista para almacenar los pasajeros
        ArrayList<Reservation> reservations = new ArrayList<>();

        // Establecer la conexión a la base de datos
        Connection connection = MysqlConfig.openConnection();

        // Crear la consulta SQL para leer todos los pasajeros
        String sqlQuery = "SELECT * FROM reservation WHERE id_airline = ?";

        try {
            //Preparar la consulta
            PreparedStatement statement = connection.prepareStatement(sqlQuery);

            // Configurar el parámetro para la búsqueda
            if (id != null) {
                statement.setInt(1, id);
            }
            // Ejecutar la consulta
            ResultSet resultSet = statement.executeQuery();

            // Procesar los resultados
            while (resultSet.next()) {
                Reservation reservation = new Reservation(
                        resultSet.getInt("id_reservation"),
                        resultSet.getInt("id_passenger"),
                        resultSet.getDate("reservation_date"),
                        resultSet.getInt("id_flight"),
                        resultSet.getString("seat")
                );

                //Agregar el objeto de la base de datos al array
                reservations.add(reservation);
            }

            //Cerrar el prepare statement y resultset
            resultSet.close();
            statement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

        //Cerrar conexion
        MysqlConfig.closeConnection();

        return reservations;
    }
}
