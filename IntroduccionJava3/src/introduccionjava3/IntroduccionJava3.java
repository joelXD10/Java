
package introduccionjava3;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          /*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
        en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.*/
          
          Scanner leer = new Scanner(System.in).useDelimiter("\n");
          
          System.out.println("Ingrese una frase: ");
          String frase= leer.next();
          
          System.out.println(frase.toLowerCase());
          System.out.println(frase.toUpperCase());
                  
    }
    
}
