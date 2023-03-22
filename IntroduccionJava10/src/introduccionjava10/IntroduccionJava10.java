
package introduccionjava10;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
        números al usuario hasta que la suma de los números introducidos supere el límite inicial. */

        Scanner leer = new Scanner (System.in);

        int cont=0;

        System.out.println("Ingrese un numero limite: ");
        int limite= leer.nextInt();

            do{
                System.out.println("Ingrese numeros hasta que supere el limite: ");
                int numeros= leer.nextInt();

                cont=cont+numeros;

            }while(limite>=cont);
       
       
       
       
    }
    
}
