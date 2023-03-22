package introduccionjava12;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
c       uadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
        * * * * 
        *     *
        *     *
        * * * *  */
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese el tamaño del cuadrado: ");
        int cuadrado= leer.nextInt();
        
            for (int i = 0; i < cuadrado; i++) {
                System.out.print("*");
            }
            
            System.out.println("");
            
            for (int i = 0; i < cuadrado-2; i++) {
                System.out.print("*");
                    for (int j = 0; j < cuadrado-2; j++) {
                        System.out.print(" ");
                    }
                System.out.println("*");
            }
            
            for (int i = 0; i < cuadrado; i++) {
                System.out.print("*");
            }
    }
    
}
