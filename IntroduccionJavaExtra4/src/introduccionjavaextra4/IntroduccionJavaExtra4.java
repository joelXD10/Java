
package introduccionjavaextra4;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
        equivalente en romano*/ 
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero del 1 al 10");
        int numero = leer.nextInt();
        System.out.println("");
        System.out.print("N° Romano: ");
        
            if(numero>=1 && numero<=3){
                for (int i = 0; i <numero; i++) {
                    System.out.print("I");
                }
            }else if(numero==4){
                System.out.println("IV");
            } else if(numero==5){
                System.out.println("V");
            } else if (numero>=6 && numero<=8){
                System.out.print("V");
                for (int i = 0; i < numero-5; i++) {
                    System.out.print("I");
                }   
            } else if(numero==9){
                System.out.println("IX");
            } else if(numero==10){
                System.out.println("X");
            }
            
        System.out.println(" ");    
    }
    
}
