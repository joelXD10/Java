
package Servicio;

import Entidad.Atributo;
import java.util.Scanner;

public class Server {
    
    public Atributo calculo(){
        Atributo calculo= new Atributo();
       Scanner leer= new Scanner (System.in);
        
        calculo.setNum1((float)Math.random()*54);
        calculo.setNum2((float)Math.random()*12);
        
        return calculo;
        
        }
    


 
}
