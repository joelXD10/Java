package introduccionjavaextra14;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
        hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
        de hijos para averiguar la media de edad de los hijos de todas las familias.*/
        
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        System.out.print("Ingrese el apellido de la familia: ");
        String nombre_familia = leer.next();
        
        System.out.print("Ingrese el numero de familias que quiere ingresar: ");
        int familia = leer.nextInt();
        int []hijos = new int[familia];
        int edad;
        int contador_edad = 0;
        
        for (int i = 0; i < hijos.length; i++) {
            System.out.print("Ingrese la edad de cada hijo: ");
            edad = leer.nextInt();
            
            hijos[i] = edad;
            
            contador_edad = contador_edad + edad;
        }
        
        System.out.println("\nLa familia: " + nombre_familia + "\nTotal de hijos: " + hijos.length + "\nLa edad media es de: " + (contador_edad/hijos.length));
    }
    
}
