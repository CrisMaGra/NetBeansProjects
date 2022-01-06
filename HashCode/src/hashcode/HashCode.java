
package hashcode;

/**
 *
 * @author CRISTIAN
 */
public class HashCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona a = new Persona("Juan", "33569852", 33);
        
        System.out.println("código de Hash de persona 'a': " + a.hashCode());
        
    }
    
}
