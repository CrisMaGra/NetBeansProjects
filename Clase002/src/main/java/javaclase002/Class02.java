
package javaclase002;

public class Class02 {

    
    public static void main(String[] args) {
        Domicilio domi = new Domicilio();
        Persona persona1 = new Persona();
        
        persona1.setNombre("Juan");
        persona1.apellido = "Martinez";
        persona1.edad = 25;
        persona1.domicilio1 = domi;
        persona1.domicilio1.calle = "Mendoza";
        persona1.domicilio1.numero = 2552;
        
        System.out.println("Nombre: " + persona1.getNombre() + " " + persona1.apellido);
        System.out.println("Edad: " + persona1.edad);
        System.out.println("Domicilio: " + persona1.domicilio1.calle + " " + persona1.domicilio1.numero);
        
        
        
        try {
	Integer a = 1 / 0;
	System.out.println("El cálculo obtenido es " + a);
        } catch (ArithmeticException e) {
                System.out.print("Fallo el cálculo,");
        } finally {
                System.out.println("Finalizado el cálculo de la ecuación");
        }
                
    }
    
}
