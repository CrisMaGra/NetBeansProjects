/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclase002;

/**
 *
 * @author CRISTIAN
 */
public class Persona {
    //ESTADO O CARACTERÍSTICAS
    //Atributos de instancia
    private String nombre;
    public String apellido;
    public int edad;
    public Domicilio domicilio1;
    
    
    
    //Atributos estáticos
    public static int cantBrazos = 2;
    

    //Atributos Final (Estatico o de instancia)
    //COMPORTAMIENTO
    //Constructores
    //Getters y Setters
    public String getNombre(){    
        return nombre;
    }
    public void setNombre(String nombre) {    
        this.nombre = nombre;
    }

    //Métodos de instancia
    public void correr() {
    }
    //Métodos estáticos
    public static void trabajar(){
        
    }
    //Enums
    
}
