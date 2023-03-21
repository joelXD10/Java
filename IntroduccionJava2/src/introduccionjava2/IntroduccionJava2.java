package introduccionjava2;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
        pantalla.*/
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese su nombre: ");
        String nombre= leer.next();
        
        System.out.println("Su nombre es: "+ nombre);
    }
    
}
