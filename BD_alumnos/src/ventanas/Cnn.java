
package ventanas;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTIAN
 */
public class Cnn {
    private static final String URL = "jdbc:mysql://localhost:3306/bd_alumnos";
    private static final String USERNAME = "root";
    private static final String PASS = "";
    
    public static Connection getConnection(){
        Connection cnn = null;
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            cnn = (Connection) DriverManager.getConnection(URL, USERNAME, PASS);
            JOptionPane.showMessageDialog(null, "CONEXIÓN EXITOSO");
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "CONEXIÓN FALLIDO " + e.getMessage() );
        }
        
        return cnn;
    }
}
