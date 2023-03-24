/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjavaextra10;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa para que el usuario adivine el resultado de una multiplicación entre
        dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
        si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
        al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
        utilizar la función Math.random() de Java.*/
        
        Scanner leer = new Scanner (System.in);
        
        int numero;
        int numero1 = (int) (Math.random() * 11);
        int numero2 = (int) (Math.random() * 11);
        int resultado = numero1 * numero2 ;
        
        
            do {
                System.out.print("Adivine el resultado\n" + numero1 + "x" + numero2 + ": ");
                numero= leer.nextInt();
                
                    if(numero==resultado){
                        System.out.println("Correcto");
                        break;
                    }else
                        System.out.println("Incorreco, intentelo de nuevo");
                        System.out.println("");
            } while (true);
        
        
        
    }
    
}
