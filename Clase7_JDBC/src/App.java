import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
 
public class App { 
    public static void main(String[] args){
        
        String url = "jdbc:tuBaseDeDatos://host:puerto/nombreBaseDeDatos";
        String tuUsuario = "tuUsuario";
        String tuContraseña = "tuContraseña";

        try {
            // Establecer la conexión
            Connection conexion = DriverManager.getConnection(url, tuUsuario, tuContraseña);
            // Crear un Statement
            Statement sentencia = conexion.createStatement();
            // Ejecutar consulta
            ResultSet resultado = sentencia.executeQuery("SELECT * FROM tuTabla");

            // Procesar el resultado
            while (resultado.next()) {
                // Suponiendo que la tabla tiene columnas 'columna1', 'columna2', etc.
                System.out.println("columna1: " + resultado.getString("columna1"));
                System.out.println("columna2: " + resultado.getString("columna2"));
                // Añade más columnas según sea necesario
            }

            // Cerrar los recursos
            resultado.close();
            sentencia.close();
            conexion.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
