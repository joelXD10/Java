
package introduccionjavaextra1;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
        usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/ 
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad de minutos");
        int minutos = leer.nextInt();
        
        int dias = minutos / 1440;
        int horas = (minutos % 1440) / 60;
        System.out.println( dias + " días, " + horas + " horas");
        
    }
    
}
