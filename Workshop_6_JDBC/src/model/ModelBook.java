package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import entity.Book;
import persistence.CRUDGeneric;
import persistence.ConfigDB;

public class ModelBook implements CRUDGeneric{

    @Override
    public Object create(Object Object) {
      //OPEN Connection
        Connection connection = ConfigDB.openConnection();

        //Transform object
        Book book = (Book) Object;

        //Insert into DB
        try {
            //Create Querry
            String sql = "INSERT INTO books (title, year_of_publication, author_id) VALUES (?,?,?)";
           
            //Create PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            //Assing to ?
            preparedStatement.setString(1, book.getTitle());
            preparedStatement.setInt(2, book.getYearOfPublication());
            preparedStatement.setInt(3, book.getAuthorId());

            //Execute Query
            preparedStatement.execute();

            //Get result
            ResultSet result = preparedStatement.getGeneratedKeys();

            while (result.next()) {
                book.setId((result.getInt(1)));
            }

            preparedStatement.close();

            JOptionPane.showMessageDialog(null, "Book successfully");

        } catch (SQLException e) {
            throw new RuntimeException("ERROR: " + e.getMessage());
        }
        ConfigDB.closeConnection();
        return book;
    }

    @Override
    public Boolean delete(int id) {
       
        return null;
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
