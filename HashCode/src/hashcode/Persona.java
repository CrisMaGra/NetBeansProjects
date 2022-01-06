/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcode;

/**
 *
 * @author CRISTIAN
 */
public class Persona {
    private String nombre, dni;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, String dni, int edad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        
    }

    @Override
    public int hashCode() {
        // int aux = Integer.parseInt(dni);     una forma de hacerlo para transformar de String a Integer-
        return Integer.valueOf(dni);//          otra forma de hacerlo-
       
    }
    
    
}
