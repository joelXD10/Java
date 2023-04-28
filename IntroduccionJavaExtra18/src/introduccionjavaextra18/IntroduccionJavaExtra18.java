package introduccionjavaextra18;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
        N, con los valores ingresados por el usuario.*/ 
        
        Scanner leer = new Scanner(System.in);
        
        int numero; 
        int sumador = 0 ;
        System.out.print("Ingrese la cantidad de numeros a guardar: ");
        int numeros = leer.nextInt();
        
        int[] lista_numeros = new int [numeros];
        
        for (int i = 0; i < lista_numeros.length; i++) {
            System.out.print("Ingrese un numero: ");
            numeros = leer.nextInt();
            
            lista_numeros[i] =  numeros;
            sumador = lista_numeros[i] + sumador;
        }
        
        System.out.println("La suma de los numeros guardados en el array son: " + sumador);
        
    }
    
}
