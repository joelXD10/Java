package introduccionjava5;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
        doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
        
      Scanner leer = new Scanner(System.in); 
      
        System.out.println("Ingrese un numero: ");
        int numero= leer.nextInt();
        double raiz_cuadrada= Math.sqrt(numero);
        
        System.out.println("Raiz cuadrada: "+ raiz_cuadrada);
        System.out.println("Doble: "+(numero*2));
        System.out.println("Doble: "+(numero*3));
        
    }
    
}
