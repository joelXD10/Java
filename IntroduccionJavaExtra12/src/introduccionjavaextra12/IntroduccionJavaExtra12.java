package introduccionjavaextra12;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-0-
        0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
        Ejemplo:*/ 
        
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese el primer numero: ");
        int numero1 = leer.nextInt();
        
        System.out.print("Ingrese el segundo numero: ");
        int numero2 = leer.nextInt();
        
        System.out.print("Ingrese el tercer numero: ");
        int numero3 = leer.nextInt();
        
        String letra1 = Integer.toString((int) numero1);
        String letra2 = Integer.toString((int) numero2);
        String letra3 = Integer.toString((int) numero3);
        
        String frase = letra1.replace('3','E') + "-" + letra2.replace('3','E') + "-" + letra3.replace('3','E');    
     
        System.out.println(frase);    
    }
    
}
