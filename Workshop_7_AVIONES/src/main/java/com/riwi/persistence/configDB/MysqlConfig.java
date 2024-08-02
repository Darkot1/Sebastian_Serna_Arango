package com.riwi.persistence.configDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConfig {

    private static Connection connection = null;

    public static  Connection openConnection(){

        String URL = "jdbc:mysql://127.0.0.1:3306/aerolinea";
        String user = "root";
        String password = "310829";
        try {
            connection = DriverManager.getConnection(URL, user, password);

            System.out.println("Connection ON");

        }catch (SQLException error){
            throw new RuntimeException(error.getMessage());
        }
        return connection;
    }

    public static void closeConnection(){
        
        if (connection != null){
            try {
                connection.close();
                connection = null;
                System.out.println("Connection OFF");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
