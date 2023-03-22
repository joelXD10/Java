/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjava13;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que a través de una función nos convierta una cantidad de euros
        introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
        función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
        una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
        (void).*/
        
        Scanner leer = new Scanner (System.in);
        
        System.out.println("Ingrese la cantidad de Euros: ");
        double euros = leer.nextFloat();
        
        double libras = euros*0.86;
        double pesos = euros*1.28611;
        double yenes = euros*129.852;
        
        System.out.println("Libras: " + libras);
        System.out.println("Pesos: " + pesos);
        System.out.println("Yenes: " + yenes);
    }
    
}
