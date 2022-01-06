
package LIBRERIA;

import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author CRISTIAN
 */
public class Libros {
    Connection cnn;
    
    public Libros(){
        cnn = Cnn.getConnection();
    }
    
    
    public ResultSet getConsulta(){
        ResultSet rs = null;
        try{
            Statement stm = (Statement) cnn.createStatement();
            rs = stm.executeQuery("select libro_id, titulo, categoria, editorial_id, precio from libros;");
        }catch(Exception e){
            System.out.print(e);
        }
        return rs;
    }
}
