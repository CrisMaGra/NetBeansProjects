/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto;

/**
 *
 * @author CRISTIAN
 */
public class PrincipalAuto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto();
        
        auto1.marca = "Chevrolet";
        auto1.color = "rojo";
        auto1.patente = "AU001AU";
        
        auto2.marca = "Honda";
        auto2.color = "azul";
        auto2.patente = "AU002AU";
        
        auto1.mostrarDatos();
        auto2.mostrarDatos();
        
        
       
        
        
        
        
    }
    
}
