package introduccionjava18;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
        traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
        cambiando sus filas por columnas (o viceversa).*/ 
        
        Scanner leer = new Scanner (System.in);
        
        //Matriz 
        int[][] matriz_numeros = new int [3][3];
        
        System.out.println("Ingrese los numeros a la matriz: ");
        
        //Rellenar la matriz con numeros
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("Matriz[" + i + "]" + "[" + j + "]:");
                    matriz_numeros[i][j] = leer.nextInt();
                }        
            }
        System.out.println(" ");    
         
        //Mostrar la matriz por pantalla    
        System.out.println("Matriz Original");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz_numeros[i][j] + " ");
                }
                System.out.println(" ");
            }
            
        //Matriz transpuesta    
        int aux;    
        System.out.println("Matriz Transpuesta: ");    
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < i; j++) {
                    aux= matriz_numeros[i][j];
                    matriz_numeros[i][j] = matriz_numeros[j][i];
                    matriz_numeros[j][i] = aux;
                }
            }
            
       //Mostrar matriz transpuesta por pantalla
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz_numeros[i][j] + " ");
                }
                System.out.println("");
            }
    }
    
}
