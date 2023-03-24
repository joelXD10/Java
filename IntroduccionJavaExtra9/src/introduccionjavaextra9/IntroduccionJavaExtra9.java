
package introduccionjavaextra9;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Simular la división usando solamente restas. Dados dos números enteros mayores que
        uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
        Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
        resultado es el residuo, y el número de restas realizadas es el cociente. */ 
        
        Scanner leer = new Scanner (System.in);
        
        int contador = 0;
        int resultado;
        int aux;
        
        System.out.println("Ingrese el primer numero: ");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 = leer.nextInt();
        
        int numero_minimo = Math.min(numero2, numero1);
        int numero_maximo = Math.max(numero2, numero1);
                
            do{
                contador++;
                resultado = numero_maximo-numero_minimo;                
                    if(numero_maximo>=numero_minimo){
                        numero_maximo = resultado;                       
                        System.out.println(numero_maximo);
                    }
            }while(numero_minimo<=numero_maximo);
            
        System.out.println("Resultado: " + contador );    
        System.out.println("Residuo: " + resultado );
       
    }
    
}
