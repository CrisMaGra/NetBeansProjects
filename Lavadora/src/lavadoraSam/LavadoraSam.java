
package lavadoraSam;
import lavadora.Lavadora;
import java.util.Scanner;

public class LavadoraSam {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 - ropa blanca / 2 - ropa color");
        int tipoRopa = entrada.nextInt();
        
        System.out.println("¿Cuantos kilos de ropa?");
        int kilos = entrada.nextInt();
        
        Lavadora mensajero = new Lavadora(kilos, tipoRopa);
        
        mensajero.CicloFinalizado();

    }
    
}
