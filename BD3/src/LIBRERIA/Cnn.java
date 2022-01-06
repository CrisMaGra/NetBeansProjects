
package LIBRERIA;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author CRISTIAN
 */
public class Cnn {
    private static final String URL = "jdbc:mysql://localhost:3306/libreria";
    private static final String USERNAME = "root";
    private static final String PASS = "";
    
    public static Connection getConnection(){
        Connection cnn = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            cnn = (Connection) DriverManager.getConnection(URL, USERNAME, PASS);
            
        }catch(Exception e){
            System.out.print("Error al crear la conexion " + e);
        }
        
        return cnn;
    }
}
