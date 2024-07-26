package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConfigDB {
    //Connection
    static Connection connection = null;

    //Method to Open
    public static Connection openConnection(){
        try {
            //Install drivers
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Credentials
            String URL = "jdbc:mysql://127.0.0.1:3306/libreria";
            String user = "root";
            String Password = "310829";

            //Establish Connection

            connection = DriverManager.getConnection(URL, user, Password);

            System.out.println("Connection ON");

        } catch (ClassNotFoundException e) {
        throw new RuntimeException("ERROR: Driver MySQL not found "+e.getMessage());
            
        } catch (SQLException e) {
        throw new RuntimeException("ERROR: Connection failed "+e.getMessage());

        }
        return connection;
    }


    public static void closeConnection(){
        try {
            if (connection != null) {
                connection.close();
                connection = null;
                System.out.println("Connection OFF");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: Connection failed " + e.getMessage());

        }
    }

}
