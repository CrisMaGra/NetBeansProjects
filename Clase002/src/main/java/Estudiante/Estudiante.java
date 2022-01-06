/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiante;

/**
 *
 * @author CRISTIAN
 */
public class Estudiante extends Persona{
    int a;
    static int b;
    
    Estudiante(){
        b++;
    }
    
    public void showData(){
        System.out.println("El valor de b: " + b);
    }
}

