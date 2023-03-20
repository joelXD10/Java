
package Servicio;

import Entidad.Atributo;
import java.util.Scanner;


    public class Servicio {
 
///CREACION DEL OBJETO
        public Atributo CrearRectangulo(){
            Atributo rectangulo= new Atributo ();
  
///LLENAR LOS ATRIBUTOS
            Scanner leer= new Scanner(System.in);
            
                System.out.println("Ingrese la base del rectagulo");
                rectangulo.setBase(leer.nextInt());
                System.out.println("Ingrese la altura del rectangulo");
                rectangulo.setAltura(leer.nextInt());
                
                return rectangulo;
            
        }
}
