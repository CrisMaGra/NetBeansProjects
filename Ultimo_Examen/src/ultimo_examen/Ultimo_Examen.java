
package ultimo_examen;
import java.util.Scanner;
/**
 *
 * @author CRISTIAN
 * 
 */
public class Ultimo_Examen {
    //  Declaración de vectores globales.
    //  Declaro vector tipo String nombre del mes.
    private static String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
    
    //  Declaro vector tipo String de trimestres.
    private static String[] trimestre = {"Primer", "Segundo", "Tercer", "Cuarto"};
    
    //  Declaración de vectores para valores de números enteros.
    private static float[] valor_mes2021 = new float[12], trimestre2021 = new float[4], total_anual2021 = new float[1];
        
    public static void main(String[] args) {         
        //  Amigabilidad.
        System.out.println("Debe ingresar los valores de facturación para cada mes del año y al finalizar se emite un informe.");
        System.out.println("");
        
        //  Invoca método que solicita facturación mensual.
        obtener_Facturacion_Mensual();
        
        //  Invoca método que calcula facturación total del año.
        sumar_Total_Facturacion();
        System.out.println();
        
        //  Muestra informe.
        emitir_Informe();
        
        //  Muestra total anual de facturación.
        System.out.println("Total de facturación anual: " + total_anual2021[0]);
        
        
        
    }
    
    //  Pide y toma el valor de facturación mensual, y los guarda en su mes correspondiente. También invoca al método de control trimestral.
    public static void obtener_Facturacion_Mensual(){
        //  Instancio objeto Scanner.
        Scanner teclado = new Scanner(System.in);
        
        //  Pido por teclado valor de facturación del mes, e invoco al método de control trimestral.
        for (int p = 0; p < mes.length ; p++){
            System.out.print("A continuación ingrese el monto de facturación para el mes de " + mes[p] + ": ");
            
            //  Pide valor de facturación mes a mes.
            valor_mes2021[p] = teclado.nextFloat();
        }
    }

    //  Obtiene el parámetro enviado del método emitir_Informe() que es (m+1) y toma la posición de "control".
    public static void control_Trimestral(int control){
        //  Toma el valor del mes y lo suma con el siguiente mes, y lo guarda por trimestre. 
        for (int i = control-3; i < control  ; i++){
            trimestre2021[control/3-1] += valor_mes2021[i];
        }
    }

    //  Método que suma facturación total del año.    
    public static void sumar_Total_Facturacion(){
        for (int i = 0; i <= 11 ; i++){
            total_anual2021[0] += valor_mes2021[i];
        }
    }
    
    public static void promedio_Mensual(){
        //  Calcula promedio mensual de facturación.
        float prom_mensual = total_anual2021[0] / valor_mes2021.length;
       
        //  Muestra promedio mensual.
        System.out.println("Promedio de facturación mensual: " + prom_mensual);
    }
    
    //  Método que emite informe.
    public static void emitir_Informe(){
        //  Muestra mes a mes el monto de facturación.
        for (int m = 0; m < 12; m++){
            System.out.println("Monto de facturación para el mes de " + mes[m] + ": " +valor_mes2021[m]);
            
            if((m + 1) % 3==0){
                //  Invoca método que solicita el control trimestral, si es que la condición se cumple. Y lleva el parámetro con el valor de (m+1) al método "control_trimestral".
                control_Trimestral(m+1);
                
                //  Muestra por trimestre el subtotal.
                System.out.println("Subtotal " + trimestre[(m+1)/3-1] + " trimestre: $" + trimestre2021[(m+1)/3-1]);
            }
            System.out.println("");
            //  Invoca método promedio mensual
            promedio_Mensual();
        }       
    } 
}
