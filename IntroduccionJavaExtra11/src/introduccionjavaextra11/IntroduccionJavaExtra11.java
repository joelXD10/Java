/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjavaextra11;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero y devuelva el número de dígitos que
        componen ese número. Por ejemplo, si introducimos el número 12345, el programa
        deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
        de división. Nota: recordar que las variables de tipo entero truncan los números o
        resultados.*/ 
        
        Scanner leer = new Scanner(System.in);
          
          
        System.out.print("Introduzca un número entero: ");
        int numero = leer.nextInt();
        leer.close();
        
        int cantidadDigitos = 0;
        
        while (numero != 0) {
            numero /= 10;
            cantidadDigitos++;
        }
        
        System.out.println("El número de dígitos es: " + cantidadDigitos);
    }
    
}
