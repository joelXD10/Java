/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjavaextra3;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
        Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String*/ 
        
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese una letra:");
        String vocal= leer.next();
            if(vocal.substring(0).equals("a") || vocal.substring(0).equals("e") || vocal.substring(0).equals("i") || vocal.substring(0).equals("o") || vocal.substring(0).equals("u")){
                System.out.println("Es Vocal");
            }else
                System.out.println("No es vocal");
    }
    
}
