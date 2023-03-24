package introduccionjavaextra8;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
        detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y
        la cantidad de números impares. Al igual que en el ejercicio anterior los números
        negativos no deben sumarse. Nota: recordar el uso de la sentencia break.*/ 
        
        Scanner leer = new Scanner (System.in);
        
        int numeros_par = 0;
        int numeros_impar = 0;
        
        System.out.println("Ingrese numeros enteros: ");
        int numeros = leer.nextInt();
        
            while(numeros % 5!=0){
                    if(numeros % 2==0){
                        numeros_par++;
                    }else
                        numeros_impar++;
                System.out.println("Ingrese numeros enteros: ");
                numeros = leer.nextInt();
            }
        
            System.out.println("Numeros par: " + numeros_par);
            System.out.println("Numeros_impar: " + numeros_impar);
    }
    
}
