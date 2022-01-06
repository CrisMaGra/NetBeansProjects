/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorios;

import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author CRISTIAN
 */
public class LABORATORIOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        // TODO code application logic here
        /*
        System.out.println("HOLA MUNDO");
        //Variables(representacion de una porcion de memoria)
        
        //Declaracion tipo nombre;
        int     nro1 = 2;
        short   nro2 = 4;
        long    nro3 = 6, nro4 = 3, nro5 = 30;
        
        //Declaracion y asignacion inline (en la misma linea), ASignacion "="
        int     nro6 = 100, nro7 = 200;
        
        //NOTA: Usualmente las declaraciones de variables estan al comienzo del programa
        
        long    resultado;
        //Operadores aritmeticos (+, -, *, /)
        
        resultado = nro3 + nro5 - 10 * (nro2 / nro1);
        
        System.out.println(resultado);
        */
        
        
        //clase 2
        
        //Expresion booleana (expresion que puede ser true o false)
       // int n1 = 502, n2 = 20;
        //Operadores de comparacion numericos (>,<,<=,>=,==,!=)
       // System.out.println(n1 != n2);
        /*
        if (n1 < n2){
        System.out.println("n1 es menor que n2");
        }else
            System.out.println("n1 No es menor que n2");*/
        
        /*
        if (n1 > 1000){
        System.out.println("n1 es mayor que 1000");
        System.out.println("..................");
        }else if(n1 > 800){
            System.out.println("n1 es mayor que 800");
            System.out.println("..................");
            }else if(n1 > 500){
                System.out.println("n1 es mayor que 500");
            }*/
        /*
        int NRO1;
        int resultado;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("A continucación, ingrese un número para restarle a 1000: ");
        NRO1 = teclado.nextInt();
        
        System.out.println("El número ingresado es: ");
        System.out.println(NRO1);
        
        resultado = 1000 - NRO1;
        System.out.println(".............................");
        System.out.println("El resultado de la resta es: ");
        System.out.println(resultado);
        */
        
        /*
        // EJERCICIO DE CLASE 2
        
        // Declaro variables.
        int nro1;
        
        // Instancio objeto Scanner.
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        nro1 = teclado.nextInt();
        
        // Muestro resultado.
        if(nro1 > 0){
            System.out.println("El número es: POSITIVO");
        }else if(nro1 < 0){
            System.out.println("El número es: NEGATIVO");
        }else 
            System.out.println("El número es: CERO");*/
        
        // Switch
        // Adiferencia del 'if' que evalúa una expresión booleana, el 'switch' pregunta por el valor puntual de una variable.
        
        // Declaro variables.
        
        //......................................................................
        
        /*
        int nro1 = 0;
        switch( nro1 )
        {
            case 10:
                System.out.println("nro1 = 10");
                break;
            case 20:
                System.out.println("nro1 = 20");
                break;
            case 30:
            case 40:
            case 50:
                System.out.println("nro1 = 30 || nro1 = 40 || nro1 = 50");
                System.out.println("....");
                break;
            default:
                System.out.println("Ninguna de las anteriores.");
        }
        
        // inline-if (if en una sola línea)
        System.out.println("El número es " + (nro1 > 0 ? "positivo": (nro1 == 0? "cero" : "negativo")));*/
        
        // .....................................................................
        // .....................................................................
        // .....................................................................        
        
        /*
        
        //  LABORATORIO 1 MÓDULO 1:
        
        System.out.println("A");
        int x = 10;
        int y = 20;
        System.out.println(x);
        System.out.println(y);
        System.out.println("----");
        
        System.out.println("B");
        x = x + 5;
        y = y + 10;
        System.out.println(x);
        System.out.println(y);
        System.out.println("----");
        
        System.out.println("C");
        x = x - 5;
        y = y - 10;
        System.out.println(x);
        System.out.println(y);
        System.out.println("----");
        
        System.out.println("D");
        x = x * 3;
        y = y * 5;
        System.out.println(x);
        System.out.println(y);
        System.out.println("----");
        
        System.out.println("E");
        x = x / 2;
        y = y / 4;
        System.out.println(x);
        System.out.println(y);*/
        
        
        
        //  LABORATORIO 1 MÓDULO 2:
        
        //  Asignar tres variables con número entero
        //  e informar cual de los tres
        //  es el mayor.

        /*
        //  DEFINO TRES VARIABLES CON NÚMERO ENTERO.
        int nro1 = 10, nro2 = 60, nro3 = 300;
        //  CONDICIÓN.    
        if ( nro1 > nro2 & nro1 > nro3 ){
        //  SI SE CUMPLE LA CONDICIÓN IMPRIMO RESULTADO.
            System.out.println ( "El nro1 es el mayor porque es: " + nro1 );
        //  SI NO SE CUMPLE, NUEVA CONDICIÓN.    
        }else if ( nro2 > nro1 & nro2 > nro3 ){
        //  SI SE CUMPLE LA CONDICIÓN IMPRIMO RESULTADO.
            System.out.println ( "El nro2 es el mayor porque es: " + nro2 );
        //  SI NO SE CUMPLE, NUEVA CONDICIÓN.    
        }else if ( nro3 > nro2 & nro3 > nro1 ){
        //  SI SE CUMPLE LA CONDICIÓN IMPRIMO RESULTADO.    
            System.out.println ( "El nro3 es el mayor porque es: " + nro3 );
        }*/
        
        /* Dados tres números enteros entre 0 y 100 inclusive y distintos entre si, ingresados por consola, indicar, también
           por consola cuál es el mayor y cuál es el menor.
           Si no cumple mostrar "Datos inválidos"*/
        
        
        /*
            Instrucciones de iteración, bucle, repetición
            do-while
            while
            for
        
            Permiten la repetición de un bloque de código según una determinada condición.
        */
        
        // Sintaxis...
        
        // do-while
        /*
        System.out.println("------- do-while -------");
        int t = 100;
        do 
        {
            // BLOQUE DE INSTRUCCIONES A REPETIR (entre llaves)
            System.out.println(t++);
        } while( t <= 10 ); // Mientras esta condición sea 'true' se va a repetir lo que estÃ¡ entre llaves.

        // while
        System.out.println("------- while -------");
        t = 100;
        while( t <= 10 ) 
        {
            System.out.println(t++);
        }
        
        // Ejemplo práctico para ingresar y validar un número.
        Scanner teclado = new Scanner(System.in);
        int nro;
        do
        {
            System.out.println("Ingrese un nro mayor que 0:");
            nro = teclado.nextInt();
        } while( nro <= 0);
        
        // Para las 3 instrucciones de iteraciÃ³n, exisiten 2 instrucciones: break, continue.
        
        // break: Interrumpe abruptamente/corta el ciclo
        System.out.println("----- break -----");
        t = 1;
        do
        {
            if( t == 3 )
                break;  // Sale de la instrucciÃ³n
            
            System.out.println(t++);
        } while( t <= 10 );
        
        // continue: Fuerza el reinicio de una nueva vuelta/ciclo.
        System.out.println("----- continue -----");
        t = 0;
        do
        {
            t++;
            
            if( t == 3 )
                continue;  // Vuelve a iniciar una vuelta. No ejecuta nada que están por debajo del continue.
            
            System.out.println(t);
        } while( t <= 10 );
        
        
        System.out.println("----- for -----");
        for( int i=1; i <= 10; i++ )
        {
            System.out.println(i);
        }
        
        // NOTA: En el for al igual que en el if, si hay una única instrucción se pueden omitir las llaves.
        System.out.println("----- for (sin llaves) -----");
        for( int i=1; i <= 5; i++ )
            System.out.println(i);
        
        // Variante con más de una variable.
        System.out.println("----- for (variante) -----");
        for( int a=-10, b=0, c=1; a < b && b < 10 ; a++, b+=2, c *= 5 )
            System.out.println(a + ", " + b + ", " + c);
        */
        
        
        /*
        
        System.out.println("1) Mostrar en consola la secuencia descendente de 10 a 1.");
        int a=11;
        do
        {
            a--;
            System.out.println(a);
        } while( a > 1 );
        
        System.out.println("2) Mostrar en consola la secuencia descendente del 10 al 5 sin mostrar el 7."); 
        int b=11;
        do
        {
            b--;
            if ( b==7 )
                continue;
            System.out.println(b);
        } while( b > 5 );
        
        System.out.println("3) Mostrar en consola la secuencia ascendente del 1 al 20 pero solo los numero pares ( n % 2==0 )");
        int c=1;
        do
        {
            c++;
            if ( c % 2==0 )
            System.out.println(c);
        } while( c < 20 );
        
        System.out.println("4) Mostrar en consola la sumatoria de los números del 1 al 100 ( solo mostrar total )");
        int suma = 0, d=1;
        do
        {
            suma += d++;
        } while( d <= 100 );
        System.out.println("La sumatoria es: " + suma );
        */
        
        /*
        // Declaro variables.
        int nro1, nro2, nro3;
        
        // Instancio objeto Scanner.
        Scanner teclado = new Scanner(System.in);
        
        // Condición para el ingreso de datos del usuario.
        System.out.println("A continuación ingrese tres número enteros entre 0 y 100 inclusive, distintos entre si por favor.");
        // Pido tres número enteros al usuario.
        System.out.println("Ingrese el primer número: ");
        nro1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número: ");
        nro2 = teclado.nextInt();
        System.out.println("Ingrese el tercer número: ");
        nro3 = teclado.nextInt();
        
        // Dados los tres números enteros, que se cumpla la condición (entre 0 y 100 inclusive, y distintos entre sí),
        // si la condición se cumple busca el número mayor y el menor, y los muestra.
        // Si no se cumple la primer condición muestra "datos inválidos".
        if (nro1>0 && nro2>0 && nro3>0 && nro1<=100 && nro2<=100 && nro3<=100 && nro1!=nro2 && nro2!=nro3 && nro3!=nro1){
            if (nro1 > nro2){
                if (nro1 > nro3){
                    System.out.println("El primer número es el mayor de los tres.");
                    if (nro2 > nro3){
                        System.out.println("El tercer número es el menor de los tres.");
                    }else{
                        System.out.println("El segundo número es el menor de los tres.");
                    }
                }else{
                    System.out.println("El tercer número es el mayor de los tres.");
                    System.out.println("El segundo número es el menor de los tres.");
                }
            }else if (nro2 > nro3){
                System.out.println("El segundo número es el mayor de los tres.");
                if (nro3 > nro1){
                    System.out.println("El primer número es el menor de los tres.");
                }else{
                    System.out.println("El tercer número es el menor de los tres.");
                }
            }else{
                System.out.println("El tercer número es el mayor de los tres.");
                System.out.println("El primer número es el menor de los tres.");   
            }
        }else{
            System.out.println("Disculpe los datos son inválidos");
        }      
      */
       /*
        String car;
        car = "@";
        int inicio = 1, fin = 5, paso = 1;
        //int inicio=5,fin=1,paso=-1;

        for (int k = inicio; k != fin + paso; k += paso) {
            for (int j = 1; j <= k; j++) {
                System.out.print(car);
            }
            System.out.println("");
        }
        paso *= -1;
        fin--;

        for (int k = fin + 1; k != inicio + paso; k += paso) {
            for (int j = 1; j <= k; j++) {
                System.out.print(car);
            }
            System.out.println("");
        }

        // Piramide
        System.out.println("Pirámide de 9");
        for (int i = 1; i <= 11/2+1; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("@");
            }
            System.out.println("@");
        }
        for (int i = 11/2; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("@");
            }
            System.out.println("@");
        } 
        */
                /*  Dado el único parámetro (cant_filas) ingresado en consola (Scanner) mayor que cero e impar, 
         *  dibujar también en consola una figura análoga a la siguiente:
        
         *  Ej (cant_filas = 5):
         *  @
         *  @@
         *  @@@
         *  @@
         *  @
         
        //  Declaro variable.
        int cant_filas = 0;
        
        //  Amigabilidad.
        System.out.println("Por favor a continuación ingrese un número mayor que cero e impar: ");
        
        //  Instancio objeto Scanner.
        Scanner teclado = new Scanner(System.in);
        cant_filas = teclado.nextInt();
        
        //  Condición: dado el único parámetro ingresado en consola mayor que cero e impar.
        //  Si la condición no se cumple, el dato ingresado no es el requerido.
        if (cant_filas <= 0 || cant_filas % 2 == 0){
            System.out.println("El dato no es el requerido.");
        }else{
            // Si la condición se cumple, dibuja en consola una figura análoga con "@" en forma de pirámide.
        
            // Calculo el punto medio.
            int punto_medio = cant_filas/2 + 1;
            
            // Dibujo la parte superior de la figura.
            for (int i = 1; i <= punto_medio; i++)
                dibujar_arrobas(i);
            
            // Dibujo la parte inferior de la figura.
            for (int i = cant_filas/2 ; i >= 1; i--)
                dibujar_arrobas(i);
        }
        */
        
        
        /*  Dado el único parámetro (cant_filas) ingresado en consola (Scanner) mayor que cero e impar, 
         *  dibujar también en consola una figura análoga a la siguiente:
        
         *  Ej (cant_filas = 5):
         *  @
         *  @@
         *  @@@
         *  @@
         *  @
        */
        /*        
        //  Declaro variables.
        int cant_filas = 0, filas = 0, i = 0;
        String resultado = "";
        
        //  Amigabilidad.
        System.out.println("Por favor a continuación ingrese un número mayor que Cero e Impar: ");
        
        //  Instancio objeto Scanner.
        Scanner teclado = new Scanner(System.in);
        cant_filas = teclado.nextInt();
        
        //  Si la condición se cumple el dato ingresado no es el requerido.
        if ( cant_filas > 0 && cant_filas % 2 == 0 ){
            System.out.println("El dato no es el requerido.");
        }else{
            //  Dado el único parámetro ingresado en consola mayor que cero e impar, dibuja en consola una figura análoga con "@" en forma de pirámide.
            filas = cant_filas / 2 + 1;
            for ( i = 1; i <= cant_filas; i++ ){
                if ( filas >= i ){
                    resultado = resultado + "@";
                }else{
                    resultado = resultado.substring( 0, resultado.length()-1 );
                }
                System.out.println(resultado);
            }
        }
        
    } 
    private static void dibujar_arrobas(int cantidad){
        for (int j = 1; j < cantidad; j++){
            System.out.print("@");
        }
        System.out.println("@");*/
        
        /*
        String[] strings = {"Raul", "Geomar", "Peña", "Juan"};

        int cantidad= 0;
        int i = 0;

        do {
            if (!strings[i].toLowerCase().startsWith("j")) {
                i++;
                continue;
            }
            cantidad++;
            i++;
        } while( i < strings.length );
        
        System.out.println ("(" + cantidad + ") palabras comienzan con \"j\"");
       */
        /*
        int nota;
        System.out.print("Introduzca una nota: ");
        Scanner entrada = new Scanner(System.in);
        nota = entrada.nextInt();
        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            System.out.println("INSUFICIENTE");
            break;
            case 5:
            System.out.println("SUFICIENTE");
            break;
            case 6:
            System.out.println("BIEN");
            break;
            case 7:
            case 8:
            System.out.println("NOTABLE");
            break;
            case 9:
            case 10:
            System.out.println("SOBRESALIENTE");
            break;
            default:
            System.out.println("ERROR");
            break;
        }
        */
                /*
        // Arreglos
        
        // NOTA: Los arreglos no alcanza con solo declararlos, sino que además tenemos que DIMENSIONARLOS.
        
        // Variante #1 (declaración y dimensionamiento separados)
        int[] arreglo1;         // Declaración.
        arreglo1 = new int[3];  // Dimensionamiento.
        
        // Asigno valores.
        arreglo1[0] = 11;
        arreglo1[1] = 2;
        arreglo1[2] = 11;
        
        // Recorro y muestro el arreglo.
        for( int indice = 0; indice < arreglo1.length; indice++ )
            System.out.println(arreglo1[indice]);
        
     
        // Variante #2 (Declaración y dimensionamiento in-line)
        float[] importes = new float[5]; 
        
        // Asigno valores.
        importes[0] = 102.4f;
        importes[1] = 12.5f;
        importes[2] = 45.1f;
        importes[3] = 34.0f;
        importes[4] = 77.1f;
        
        // Recorro y muestro el arreglo.
        for( int indice = 0; indice < importes.length; indice++ )
            System.out.println(importes[indice]);
        
        // Variante #3 (Cuando ya conozco los valores de antemano)
        String[] turnos = {"Mañana", "Tarde", "Noche"};
        
        System.out.println(turnos[1]); 
        */
        /*
        System.out.println("Ejercicio N°1");
        // Ejercicio N°1.
        // Dado el vector {10, 20, 5, 15, 30, 20}
        // Informar el vector de la forma: "Índice: X, Valor: Y".
        // Índice: 0, Valor: 10
        // Índice: 1, Valor: 20
        // ...
        
        // Declaración de vector.
        int[] arreglo1;
        
        // Dimensionamiento.
        arreglo1 = new int[6];
        
        // Asigno valores.
        arreglo1[0] = 10;
        arreglo1[1] = 20;
        arreglo1[2] = 5;
        arreglo1[3] = 15;
        arreglo1[4] = 30;
        arreglo1[5] = 20;
        
        // Recorro y muestro el vector de la forma: "Índice: X, Valor: Y". 
        for( int indice = 0; indice < arreglo1.length; indice++ ){
            System.out.println("Índice: " + indice + ", " + "Valor : "+ arreglo1[indice]);
        }
        
        System.out.println("");
        
        System.out.println("Ejercicio N°2");
        // Ejercicio N°2.
        // Totalizar el vector e informar el valor.
        // El total es: ####.
        int total_suma = 0;
        for( int indice = 0; indice < arreglo1.length; indice++ ){
           total_suma += arreglo1[indice] ;
        }
        System.out.println("El total de la suma es: " + total_suma);
        
        System.out.println("");
        
        System.out.println("Ejercicio N°3");
        // Ejercicio N°3.
        // Informar el contenido de los números impares.
        // Ej: las posiciones 1, 3, 5, etc.
        
        for( int indice = 0; indice < arreglo1.length; indice++ ){
            if(indice % 2 != 0){
                System.out.println(arreglo1[indice]);
            }
        }
        
        System.out.println("");
        
        System.out.println("Ejercicio N°4");
        // Ejercicio N°4.
        // Informar el mayor número.
        int mayor = arreglo1[0];
        for( int i=1; i < arreglo1.length; i++ )
            mayor = arreglo1[i] > mayor ? arreglo1[i] : mayor;
        System.out.println("El mayor número es: " + mayor);

        System.out.println("");
        
        System.out.println("Ejercicio N°5");
        // Mostrar cuantas veces aparece el número 20.
        int cantidad = 0;
        for( int i=1; i < arreglo1.length; i++ ){
            cantidad += arreglo1[i] == 20 ? 1 : 0;
        }
        System.out.println("El número 20 aparece " + cantidad + " veces.");
        */
        
        
    }    
}  


