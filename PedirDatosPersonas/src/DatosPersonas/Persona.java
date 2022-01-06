/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DatosPersonas;

/**
 *
 * @author CRISTIAN
 */
public class Persona {
    private String nombre, apellido;
    private int edad;
    Domicilio domi = new Domicilio();
    Documento doc = new Documento();
    void mostrarDatos(){
        
        String mensaje = "Tipo de DNI: " + doc.tipoDoc + ", número: " + doc.numDoc + ", apellido: " + apellido + ", nombre: " + nombre + ", edad: " + edad + ", domicilio " + domi.getNomCalle() + " " + domi.getNumCalle() + " de " + domi.getNomLocalidad() + ". Es " + (edad >= 18 ? "mayor de edad." : "menor de edad.");
        System.out.println(mensaje);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
