
package poo3;

import Entidad.Atributo;
import Servicio.Servicio;


public class Poo3 {

    public static void main(String[] args) {
        Servicio nul = new Servicio();
        Atributo num = nul.num();
        
            System.out.println(num);
            
            System.out.println("La suma es: "+num.suma());
            System.out.println("La resta es: "+num.resta());
            System.out.println("La divicion es: "+num.dividir());
            System.out.println("La multiplicacion es: "+num.multiplicar());
            
        
    }
    
}
