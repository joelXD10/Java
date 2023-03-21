
package introduccionjava4;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
        Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese los grados C°: ");
        float grados =leer.nextFloat();
        
        float grados_fahrenheit = 32 + (9 * grados / 5);
        
        System.out.println("Grados F°= "+ grados_fahrenheit );
    }
    
}
