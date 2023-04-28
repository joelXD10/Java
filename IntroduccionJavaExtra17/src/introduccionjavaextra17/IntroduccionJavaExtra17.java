package introduccionjavaextra17;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
        por parámetro para que nos indique si es o no un número primo, debe devolver true si es
        primo, sino false*/
        
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Ingrese un numero: ");
        int numero = leer.nextInt();
        
        boolean numero_primo = NumeroPrimo(numero);
        System.out.println("¿El numero " + numero + " es primo? " + numero_primo);
    }
    
    public static boolean NumeroPrimo(int numero){
        boolean bandera = false;
        int contador = 0;
        
        for (int i = 1; i <= numero; i++) {
            if ( numero % i == 0){
                contador++;
            }
        }
        
        if (contador == 2){
            bandera = true;
        }
        
        return bandera;
    }
}
