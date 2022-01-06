package Clase004;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author CRISTIAN
 */
public class Clase004 {

    public static void main(String[] args) {
        /*
        float var1 = 25, var2 = 30, reS;

        System.out.println("Suma");
        reS = var1 + var2;
        System.out.println(reS);

        System.out.println("-----");

        System.out.println("Resta");
        reS = var1 - var2;
        System.out.println(reS);

        System.out.println("-----");

        System.out.println("División");
        reS = var1 / var2;
        System.out.println(reS);

        System.out.println("-----");

        System.out.println("Multiplicación");
        reS = var1 * var2;
        System.out.println(reS);

        System.out.println("-----");

        int numA = 0, numB = 0, bandera = 1;
        String oP;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        numA = entrada.nextInt();

        System.out.println("Ingrese el segundo número: ");
        numB = entrada.nextInt();

        System.out.println("Elija un operador '+' '-' '*' '/' : ");
        oP = entrada.next();

        switch (oP) {
            case "+":
                System.out.println("El resultado de la suma es: " + (reS = numA + numB));
                break;
            case "-":
                System.out.println("El resultado de la resta es: " + (reS = numA - numB));
                break;
            case "/":
                System.out.println("El resultado de la división es: " + (reS = numA / numB));
                break;
            case "*":
                System.out.println("El resultado de la multiplicación es: " + (reS = numA * numB));
                break;
            default:
                System.out.println("Opción no válida.");
        }
         */

 /*
        // Utilizamos la Clase Random esta clase nos ayuda a generar numeros aleatorios
        Random aleatorio = new Random();

        // Utilizamos la Clase Scanner para pedir los datos por la consola
        Scanner teclado = new Scanner(System.in);

        // tenemos la utilidad nextInt que nos da un numero aleatorio entero
        // con un limite nextInt(Limite)
        // le sumamos 1 ya que el numero aleatorio no incluye el limite
        int numeroAleatorio = (aleatorio.nextInt(10) + 1);

        // mostramos por pantalla
        System.out.println("Adivina el numero y gana");
        // mostramos un salto de linea para diferenciar el titulo
        System.out.print("\n");

        // utilizamos el ciclo do while ya que por lo menos vamos a preguntar una vez
        do {
            System.out.print("Indique un numero:");
            int numeroUsuario = teclado.nextInt();

            // preguntamos si es igual al numero generado por la clase Random
            if (numeroUsuario == numeroAleatorio) {
                System.out.println("Felicitaciones Adivinaste");
                break;
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("Intenta un numero menor");
            } else {
                System.out.println("Intenta un numero mayor");
            }
            // otra forma de imprimir una linea en blanco
            System.out.println();

        } while (true);

        // debemos cerrar la comunicacion con la consola, no nos preocupemos ya que lo
        // veremos mas adelante el por qué de esto :)
        teclado.close();
         
        // TODO Auto-generated method stub
        // Utilizamos la Clase Scanner para pedir los datos por la consola
        Scanner teclado = new Scanner(System.in);

        // declaramos e inicializamos las variables
        int numeroMaximoIntentos = 3;
        boolean credencialescorrectas = false;

        // mostramos por pantalla
        System.out.println("Ingreso al Sistema");
        // mostramos un salto de linea para diferenciar el titulo
        System.out.print("\n");

        // ciclar mientras no coloque las credenciales de forma correcta o llegue a los
        // maximos intentos
        for (int i = 0; (!credencialescorrectas && i < numeroMaximoIntentos); i++) {
            System.out.print("Introduzca su usuario: ");
            String usuario = teclado.next();
            System.out.print("Introduzca su clave: ");
            String clave = teclado.next();

            // preguntamos si ingreso las credenciales de forma correcta
            if (usuario.equalsIgnoreCase("Administrador") && clave.equals("admin1234")) {
                credencialescorrectas = true;
            } else {
                System.out.println("Credenciales incorrectas, Intente de nuevo ");
            }
            // otra forma de imprimir una linea en blanco
            System.out.println();
        }

        if (credencialescorrectas) {
            System.out.println("Ingreso correctamente ( ◠‿◠)");
        } else {
            System.out.println("Usuario Bloqueado ( ・_・)");
        }

        // debemos cerrar la comunicacion con la consola, no nos preocupemos ya que lo
        // veremos mas adelante el por qué de esto :)
        teclado.close();
        */
        
    }

}
