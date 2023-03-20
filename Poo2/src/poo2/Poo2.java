package poo2;

import Entidad.Circunferencia;
import Servicio.CircuferenciaServicio;

/**
 *
 * @author joel
 */
public class Poo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         CircuferenciaServicio n1= new CircuferenciaServicio();
         
         Circunferencia cir= n1.CrearCirculo();
         
         System.out.println();
         System.out.println("El area de la circunferencia es: "+ cir.area());
         System.out.println("El perimetro de la circunferencia es: "+cir.perimetro());
    
    }
    
}
