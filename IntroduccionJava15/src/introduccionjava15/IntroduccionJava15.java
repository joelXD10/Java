package introduccionjava15;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
        muestre por pantalla en orden descendente.*/
        
        Scanner leer = new Scanner (System.in);
        int[]vector = new int[11];
        
            for (int i = vector.length-1; i >= 0; i--) {
                vector[i]= i;
                System.out.println("vector ["+i+"]"+ i );
        }
    }

}
