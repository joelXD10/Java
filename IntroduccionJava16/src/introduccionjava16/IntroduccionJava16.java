package introduccionjava16;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
        usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
        numero y si se encuentra repetido*/
        
        Scanner leer = new Scanner (System.in);
      
        System.out.println("Ingrese el tamaño del vector: ");
        int tamaño= leer.nextInt();
        int[] vector = new int[tamaño]; 
        
            for (int i = 0; i < vector.length ; i++) {
                vector [i]= (int)(Math.random()*100+1);
                System.out.println(vector[i]);
            }
    }
    
}
