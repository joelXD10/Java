package introduccionjava11;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
        pantalla el siguiente menú:
        MENU 1. Sumar 2. Restar 3. Multiplicar 4. Dividir 5. Salir */
       
       Scanner leer = new Scanner(System.in);
       
        System.out.println("ELija el primer numero:");
        int numero1= leer.nextInt();
        
        System.out.println("ELija el segundo numero: ");
        int numero2= leer.nextInt();
        
        System.out.println("MENU");
        System.out.println("1. Sumar");    
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividr");
        System.out.println("5. Salir");
        
        System.out.println("Opcion: ");
        int opcion= leer.nextInt();
        
            switch (opcion){
                case 1:
                    System.out.println("El resultado de la suma es: " + (numero1+numero2));
                    break;
                
                case 2:
                    System.out.println("El resultado de la resta es: " + (numero1-numero2));
                    break;
                    
                case 3:
                    System.out.println("El resultado de la multiplicacion es: " + (numero1*numero2));
                    break;
                
                case 4:
                    System.out.println("El resultado de la division es: " + (numero1/numero2));
                    break;
                          
                case 5:
                    System.out.println("Salir");
                    break;
            }
                    
    }
    
}
