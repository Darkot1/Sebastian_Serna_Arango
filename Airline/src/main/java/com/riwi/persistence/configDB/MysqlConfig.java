package com.riwi.persistence.configDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConfig {
    //Creamos una conexion vacia
    private static Connection connection = null;

    public static Connection openConnection(){
        //Definimos parametros de la base de datos
        String  url ="jdbc:mysql://127.0.0.1:3306/Airport";
        String user = "root";
        String password = "Rlwl2023.";

    try {
        connection = DriverManager.getConnection(url,user,password);

        System.out.println("Connection ON");

    }catch (SQLException e){
        throw new RuntimeException(e.getMessage());
    }
    return connection;
    }

    public static void closeConnection(){
        //Verificamos si hay una conexion
        if (connection != null){
            try {
                //Cerramos conexion
                connection.close();
                //y se vuelve null
                connection = null;
                System.out.println("Connection OFF");
            }catch (SQLException e){
                throw new RuntimeException(e.getMessage());
            }
        }
    }

}
