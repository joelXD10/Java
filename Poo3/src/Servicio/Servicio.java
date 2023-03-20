
package Servicio;

import Entidad.Atributo;
import java.util.Scanner;


public class Servicio {

///CREACION DEL OBJETO    
        public Atributo num (){
            Atributo num= new Atributo();
            
 ///LLENAR LOS ATRIBUTOS
               Scanner leer = new Scanner (System.in);
               System.out.println("Ingrese el primer numero:");
               num.setNumero1(leer.nextInt());
               System.out.println("Ingrese el segundo numero:");
               num.setNumero2(leer.nextInt());
               System.out.println(" ");
               return num;
        }
}
