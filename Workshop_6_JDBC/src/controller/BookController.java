package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import javax.swing.JOptionPane;

import entity.Book;
import model.ModelBook;
import persistence.ConfigDB;

public class BookController {
    //Attributes
    ModelBook bookController;

    public BookController(){
        this.bookController = new ModelBook();
    }

    public void createBook(){

        String tittle = JOptionPane.showInputDialog("Ingrese el titulo del autor");

        int yearOfPublication = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de publicacion del libro"));

        int authorID = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el ID del autor del libro"));

        if (checkIdAuthor(authorID)) {
            Book book = new Book(authorID, tittle, yearOfPublication, authorID);
            Book bookResult = (Book) this.bookController.create(book);
            JOptionPane.showMessageDialog(null, bookResult);
        }else{
            JOptionPane.showMessageDialog(null, "Error: El autor con ID " + authorID + " no existe.");
        }   
    }

    private boolean checkIdAuthor(int authorId) {
        Connection connection = ConfigDB.openConnection();
        boolean exists = false;

        try {
            // Create Query
            String sql = "SELECT id FROM authors WHERE id = ?";

            // Create PreparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, authorId);

            // Execute Query
            ResultSet resultSet = preparedStatement.executeQuery();
            exists = resultSet.next(); // true if author exists

            preparedStatement.close();
        } catch (SQLException e) {
            throw new RuntimeException("ERROR: " + e.getMessage());
        }
        
        ConfigDB.closeConnection();
        return exists;
    }
}

