package introduccionjavaextra7;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
        de n números (n>0). El valor de n se solicitará al principio del programa y los números
        serán introducidos por el usuario. Realice dos versiones del programa, una usando el
        bucle “while” y otra con el bucle “do - while”.*/
        
        Scanner leer = new Scanner(System.in);
        
        int valor_total = 0;
        int valor_maximo = 0;
        int valor_minimo = 1000000;
        int contador1 = 0; 
        int contador2 = 0;
        int numeros;
        
            do{
                System.out.println("Ingrese numeros: ");
                numeros = leer.nextInt();
                contador1++; 
                valor_total = valor_total+numeros;
                valor_minimo = numeros;
                    //Valor minimo y Valor maximo.
                    if(numeros<valor_minimo){
                        valor_minimo = numeros;
                    }else if(numeros>valor_maximo){
                        valor_maximo = numeros;
                    }  
            }while(contador1<3);
            
        System.out.println("El valor minimo es: " + valor_minimo);
        System.out.println("EL valor maximo es: " + valor_maximo);
        System.out.println("El promedio es: " + (valor_total/contador1));

        
        
    }
    
}
