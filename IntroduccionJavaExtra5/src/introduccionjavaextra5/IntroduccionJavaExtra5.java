
package introduccionjavaextra5;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*Una obra social tiene tres clases de socios:
        o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
        todos los tipos de tratamientos.
        o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
        los mismos tratamientos que los socios del tipo A.
        o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
        tratamientos.
        o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
        real que represente el costo del tratamiento (previo al descuento) y determine el
        importe en efectivo a pagar por dicho socio.*/ 
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el importe: ");
        float importe =leer.nextFloat();
        
        System.out.print("Ingrese el tipo de socio\nSocio A\nSocio B\nSocio C\nOpcion:");
        char socios = leer.next().charAt(0);
            
            switch(socios){
                case 'a':
                    System.out.println("Socio A");
                    float socio_a= (50*importe)/100;
                    System.out.println("El importe a pagar es: $" + socio_a);
                    break;
                    
                case 'b':
                    System.out.println("Socio B");
                    float socio_b = (35*importe)/100;
                    System.out.println("El importe a pagar es: $" + socio_b);
                    break;
                    
                case 'c':
                    System.out.println("Socio C");
                    System.out.println("EL importe a pagar es : $" + importe);
                    break;
                    
            }
        
    }
    
}
