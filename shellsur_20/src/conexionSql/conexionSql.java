
package conexionSql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author CRISTIAN
 */
public class conexionSql {
    
    Connection conectar = null;
    
    public Connection conexion(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/bdclientes","root","");
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "Conexion Fallida " + e.getMessage());
        }
        return conectar;
    }
}
