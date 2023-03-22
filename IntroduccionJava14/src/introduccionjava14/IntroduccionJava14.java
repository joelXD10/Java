
package introduccionjava14;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).
        El cambio de divisas es:
         * 0.86 libras es un 1 €
         * 1.28611 $ es un 1 €
         * 129.852 yenes es un 1 € */
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de Euros: ");
        double euros = leer.nextInt();
        
        double libras = euros*0.86;
        double pesos = euros*1.28611;
        double yenes = euros*129.852;
        
        System.out.println("Libras: " + libras);
        System.out.println("Peos: " + pesos);
        System.out.println("Yenes: " + yenes);
        
    
             
                
    }
    
}
