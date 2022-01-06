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
public class Auto {
    String color, marca, patente, status;
    boolean llave;
    
    void encender(){
        llave = true;
    }
    
    void apagar(){
        llave = false;
    }
    
    void mostrarDatos(){
        if(llave == true){
            status = "encendido";
        }else{
            status = "apagado";
        }
        System.out.println("El vehículo de patente: " + patente + ", es de marca: " + marca + ", es de color: " + color + ", y se encuentra " + status + ".");
    }
}
