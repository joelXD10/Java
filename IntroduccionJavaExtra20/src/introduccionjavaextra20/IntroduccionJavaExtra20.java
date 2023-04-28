package introduccionjavaextra20;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*. Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
        parámetro. Después haremos otra función o procedimiento que imprima el vector.*/ 
        
        
        
        int[]lista = new int [3];
        
        int[]lista_numeros = ListaNumeros(lista);
        System.out.println("");
        MostrarListaNumeros(lista_numeros);
        
    }
    
    public static int[] ListaNumeros(int[] lista_numeros){
        Scanner leer = new Scanner (System.in);
        
        for (int i = 0; i < lista_numeros.length; i++) {
            System.out.print("Ingrese un numero en el Array[" + i + "]: ");
            lista_numeros[i] = leer.nextInt();
        }
        
        return lista_numeros;
    }
    
    public static void MostrarListaNumeros(int[] lista_numeros){
        for (int i = 0; i < lista_numeros.length; i++) {
            System.out.println("Lista de numero [" + i + "]: " + lista_numeros[i]);
        }
    }
    
}
