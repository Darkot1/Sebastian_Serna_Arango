package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import entity.Student;
import persistence.CRUDGeneric;
import persistence.ConfigDB;

public class StudentModel implements CRUDGeneric{

    @Override
    public Object create(Object Object) {
        //OPEN connection
        Connection connection = ConfigDB.openConnection();
        //Transform object
        Student student = (Student) Object;
        try {
            //Create SQL Query
            String sqlQuery = "INSERT INTO student (name, age) values(?,?)";

            //Create statement
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

            //assing to ?
            preparedStatement.setString(1,student.getName());
            preparedStatement.setInt(2, student.getAge());

            //Execute SQL Query
            preparedStatement.execute();

            //Get result
            ResultSet result = preparedStatement.getGeneratedKeys();

            while (result.next()) {
                student.setId((result.getInt(1)));;  
            }
                
        

            preparedStatement.close();

            JOptionPane.showMessageDialog(null, "Student successfully");
            
        }catch(SQLException e){
            throw new RuntimeException(e);
        }
        ConfigDB.closeConnection();
        return student;
    }

    @Override
    public Object readById(int id) {
      
        throw new UnsupportedOperationException("Unimplemented method 'readById'");
    }

    @Override
    public ArrayList<Object> readAll() {
       
        throw new UnsupportedOperationException("Unimplemented method 'readAll'");
    }

    @Override
    public Object update(Object object, int id) {
      
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Boolean delete(int id) {
      
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    


    
}
