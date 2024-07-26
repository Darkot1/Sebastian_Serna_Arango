package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConfigDB {
    //Connection
    static Connection connection = null;

    //Method to open
   public static Connection openConnection(){
     try {
        //Install Drivers
        Class.forName("com.mysql.cj.jdbc.Driver");
    
        //Credentials
        String URL = "jdbc:mysql://127.0.0.1:3306/JDBC";
        String user = "root";
        String password = "310829";

        //Establish Connection

        connection = DriverManager.getConnection(URL,user,password);

        System.out.println("Connection ON");

     } catch (ClassNotFoundException error) {
        /* throw new RuntimeException(error.getMessage()); */
        throw new RuntimeException("ERROR: Driver MySQL not found "+error.getMessage());

     } catch (SQLException error) {
        throw new RuntimeException("ERROR: Connection failed "+error.getMessage());
        
    }


     return connection;
   }

   //Methods to closed
   public static void closeConnection() {
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
