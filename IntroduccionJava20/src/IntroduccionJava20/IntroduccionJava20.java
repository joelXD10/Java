package IntroduccionJava20;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
        suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
        permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
        El programa deberá comprobar que los números introducidos son correctos, es decir,
        están entre el 1 y el 9.*/
        
        Scanner leer = new Scanner (System.in);
        
        int[][] matriz = new int[3][3];
        
     //Rellenar matriz 
        System.out.println("Ingrese los numeros del 1 al 9 a la matriz: ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    do{
                        System.out.print("Matriz [" +i+ "]" + "[" +j+"]: ");
                        matriz[i][j] = leer.nextInt();
                    }while(matriz[i][j]<=0 || matriz[i][j]>=10);
                }
            }
            
     //Mostar matriz
        System.out.println("Matriz: "); 
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(" ");
             }
        
     //Calculos de la matriz   
        int resultado1= matriz [0][0] + matriz [1][1]+ matriz [2][2];
        int resultado2= matriz [1][0] + matriz [1][1]+ matriz [1][2];
        int resultado3= matriz [0][0] + matriz [1][0]+ matriz [2][0];
        
        if(resultado1== resultado2 && resultado1==resultado3){
            System.out.println("Cubo Magico Correcto!!!");
        }else 
            System.out.println("No es un Cubo Magico");
    }
    
}
