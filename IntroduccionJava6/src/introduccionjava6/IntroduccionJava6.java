
package introduccionjava6;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crear un programa que dado un numero determine si es par o impar*/
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero= leer.nextInt();
        
        if( numero % 2==0){
            System.out.println("Numero Par");
        }else
            System.out.println("Numero Impar");
    }
    
}
