package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import entity.Author;
import persistence.CRUDGeneric;
import persistence.ConfigDB;

public class ModelAuthor implements CRUDGeneric{

    @Override
    public Object create(Object Object) {

        //OPEN Connection
        Connection connection = ConfigDB.openConnection();

        //Transform object
        Author author = (Author) Object;

        //Insert into DB
        try {
            //Create Querry
            String sql = "INSERT INTO authors (name, nationality) VALUES (?,?)";
           
            //Create PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            //Assing to ?
            preparedStatement.setString(1, author.getName());
            preparedStatement.setString(2, author.getNationality());

            //Execute Query
            preparedStatement.execute();

            //Get result
            ResultSet result = preparedStatement.getGeneratedKeys();

            while (result.next()) {
                author.setId((result.getInt(1)));
            }

            preparedStatement.close();

            JOptionPane.showMessageDialog(null, "Author successfully");

        } catch (SQLException e) {
            throw new RuntimeException("ERROR: " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return author;
    }

    @Override
    public Boolean delete(int id) {
        
        //OPEN connection 
        Connection connection = ConfigDB.openConnection();

        boolean exist = false;
        try {
            //Create Querry
            String sql = "DELETE FROM authors WHERE id = ?";
            
            //Create PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            
            //Assing to?
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            
            //Execute Query
            int affectedRows = preparedStatement.executeUpdate();;
            
            exist = affectedRows > 0;
           
            preparedStatement.close();

        } catch (Exception e) {
            throw new RuntimeException("ERROR: " + e.getMessage());
        }

        ConfigDB.closeConnection();
        return exist;
    }

    @Override
    public ArrayList<Object> readAll() {
        
        return null;
    }

    @Override
    public Object readById(int id) {
       
        return null;
    }

    @Override
    public Object update(Object object, int id) {
       
        return null;
    }
    



    
}
