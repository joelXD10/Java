package introduccion.javaextra15;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
        restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
        matemática y deben devolver sus resultados para imprimirlos en el main.*/
        
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        System.out.print("Ingrese un numero: ");
        int numero1 = leer.nextInt();
        
        System.out.print("Ingrese otro numero: ");
        int numero2 = leer.nextInt();
        
        System.out.println("Ingrese una opcion:\n1) SUMA\n2) RESTA\n3) MULTIPLICACIÓN\n4) DIVISION\nOPCION: ");
        int opcion = leer.nextInt();
        
        switch (opcion){
            case 1:
                System.out.println("SUMA");
                int suma = Suma(numero1, numero2);    
                break;
            case 2:
                System.out.println("RESTA");
                int resta = Resta(numero1, numero2);
                break;
            case 3:
                System.out.println("MULTIPLICACIÓN");
                int multiplicacion = Multiplicacion(numero1, numero2);
                break;
            case 4:
                System.out.println("DIVISIÓN");
                int division = Division(numero1, numero2);
                break;
        }
        
    }
    ///Funciones de operacniones matematicas 
    public static int Suma(int numero1, int numero2){
        int resultado = numero1 + numero2;
        System.out.println("La suma es: " + resultado);
        return resultado;
    }
    
    public static int Resta (int numero1, int numero2){
        int resultado = numero1 - numero2;
        System.out.println("La resta es: " + resultado);
        return resultado;
    }
    
    public static int Multiplicacion(int numero1 , int numero2){
        int resultado = numero1 * numero2;
        System.out.println("La multiplicacion es: " + resultado);
        return resultado;
    }
    
    public static int Division(int numero1, int numero2){
        int resultado = numero1/numero2;
        System.out.println("La division es: " + resultado);
        return resultado;
    }
    
}
