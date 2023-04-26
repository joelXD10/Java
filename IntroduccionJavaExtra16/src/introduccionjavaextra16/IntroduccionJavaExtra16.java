
package introduccionjavaextra16;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
        las personas ingresadas por teclado e indique si son mayores o menores de edad.
        Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
        mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/
        
        Scanner leer = new Scanner  (System.in);
        
        String opcion;
        
        do{
            MostrarPersonas();
            System.out.print("Deseea ingresar mas personas: \nSi\nNo\nOpcion: ");
            opcion = leer.next();
            System.out.println("");
            
            if("no".equals(opcion)){
                System.out.println("Salio del programa");
               break;
            }
            
        }while(true);
        
    }
    
    public static void MostrarPersonas(){
        int edad;
        String nombre;
        
        Scanner leer = new Scanner  (System.in);
        
        System.out.print("Ingrese el nombre: ");
        nombre = leer.next();
        
        System.out.print("ingrese la edad de la persona: ");
        edad = leer.nextInt();
        
        if (edad>18){
            System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nEs Mayor\n");
        }else{
            System.out.println("Nombre: " + nombre + "\nEdad: " + edad + "\nEs Menor\n");
        }
    }
}
