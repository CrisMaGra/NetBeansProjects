/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersonas;

import java.util.Scanner;

/**
 *
 * @author CRISTIAN
 */
public class PedirDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Persona[]personas;
        
        System.out.println("Ingrese la cantidad de personas: ");
        int cantPersonas = teclado.nextInt();
        
        personas = new Persona[cantPersonas];
        
        
        for (int i = 0; i < personas.length; i++) {
            Persona personaAux = new Persona();
            System.out.println("Datos de persona " + (i+1));
            System.out.print("Ingrese tipo de DNI: ");
            personaAux.doc.tipoDoc = teclado.next();
            System.out.print("Ingrese número de DNI: ");
            personaAux.doc.numDoc = teclado.nextInt();
            System.out.print("Ingrese apellido: ");
            personaAux.setApellido(teclado.next()); 
            System.out.print("Ingrese nombre: ");
            personaAux.setNombre(teclado.next());
            System.out.print("Ingrese edad: ");
            personaAux.setEdad(teclado.nextInt());
            System.out.print("Ingrese localidad: ");
            personaAux.domi.setNomLocalidad(teclado.next());
            System.out.print("Ingrese nombre de calle: ");
            personaAux.domi.setNomCalle(teclado.next());
            System.out.print("Ingrese número de calle: ");
            personaAux.domi.setNumCalle(teclado.nextInt());
            
            personas[i] = personaAux;
            System.out.println("-----------------------------------------------------------");
        }
        
        for (int i = 0; i < personas.length; i++) {
            personas[i].mostrarDatos();
        }
        
        teclado.close();
    }
    
}
