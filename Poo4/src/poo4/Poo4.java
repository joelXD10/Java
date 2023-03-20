package poo4;

import Entidad.Atributo;
import Servicio.Servicio;


public class Poo4 {

   
    public static void main(String[] args) {
        
             Servicio Rectangulo= new Servicio();
             Atributo rectangulo= Rectangulo.CrearRectangulo();
             
             System.out.println(Rectangulo);
             System.out.println("La superficie del rectagulo es: "+ rectangulo.Superficie());
             System.out.println("El perimetro del rectangulo es: "+ rectangulo.Perimetro());
             System.out.println("");
             System.out.println(rectangulo.Dibujar());
    }
    
}
