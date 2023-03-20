
package poo9;

import Entidad.Atributo;
import Servicio.Server;



public class Poo9 {

 
    
    public static void main(String[] args) {
        Server calculo = new Server ();
        Atributo num = calculo.calculo();
        System.out.println("Primer numero aleatorio: "+ num.getNum1());
        System.out.println("");
        System.out.println("Segundo numero aleatorio: "+ num.getNum2());
        System.out.println("");
        num.MayorNumero();
        num.calcularPotencia();
        num.calcularRaiz();
    }
    
}
