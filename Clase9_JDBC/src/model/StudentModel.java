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
    public Object create(Object object) {
        //OPEN connection
        Connection connection = ConfigDB.openConnection();
        //Transform object
        Student student = (Student) object;
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
                student.setId((result.getInt(1)));  
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
         
        //OPEN connection
        Connection connection = ConfigDB.openConnection();

        Object student = null;

        try {

            //Create SQL Query
            String sqlQuery = "SELECT * FROM student WHERE id =?;";

            //Create statement
            PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery);

            //assing to?
            preparedStatement.setInt(1, id);

            //Execute SQL Query
            preparedStatement.execute();

            //Get result
            ResultSet result = preparedStatement.getResultSet();

           while (result.next()) {
                    student = new Student(
                    result.getInt("id"),
                    result.getString("name"),
                    result.getInt("age")
                );
            
           }
            
           preparedStatement.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        ConfigDB.closeConnection();
        return student;
    }

    @Override
    public ArrayList<Object> readAll() {
       
        //OPEN connection
       Connection connection = ConfigDB.openConnection();

       //Instance ArrayList
       ArrayList<Object> students = new ArrayList<>();

       try {
           //Create SQL Query
           String sqlQuery = "SELECT * FROM student;";

           //Create statement
           PreparedStatement preparedStatement = connection.prepareStatement(sqlQuery, PreparedStatement.RETURN_GENERATED_KEYS);

           //assing to ?

           //Execute SQL Query
           preparedStatement.execute();

           //Get result
           ResultSet result = preparedStatement.getResultSet();

           while (result.next()) {
             Student student = new Student(result.getInt("id"), result.getString("name"), result.getInt("age"));
             
             students.add(student);
           }



           preparedStatement.close();

           JOptionPane.showMessageDialog(null, "Student successfully");
           
       }catch(SQLException e){
           throw new RuntimeException(e);
       }

       ConfigDB.closeConnection();

       return  students;
    }

    @Override
    public Object update(Object object, int id) {
      
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public Boolean delete(int id) {
      
        //Connection
        Connection connection = ConfigDB.openConnection();

        boolean result = false;

        try {
            //Create Query
            String sql = "DELETE FROM student WHERE id = ?";

            //Create statement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            //set parameter
            preparedStatement.setInt(1, id);
            
            //Execute query
            int deleteRow = preparedStatement.executeUpdate();

            if (deleteRow > 0) {
                result = true;
                JOptionPane.showMessageDialog(null, "Student successfully deleted");
            }else{
                JOptionPane.showMessageDialog(null, "No rows deleted");
            }

            preparedStatement.close();


        } catch (SQLException e) {

            throw new RuntimeException(e);

        }

        ConfigDB.closeConnection();
        return result;
    }
    


    
}
