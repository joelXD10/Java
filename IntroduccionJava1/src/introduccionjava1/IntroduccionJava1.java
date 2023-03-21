package introduccionjava1;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
        dos. El programa deberá después mostrar el resultado de la suma
        */
        Scanner leer= new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int numero1= leer.nextInt();
        System.out.println("Ingrese otro numero: ");
        int numero2= leer.nextInt();
        
        System.out.println("La suma es: "+(numero1+numero2));
        
    }
    
}
