package poo5;

import Entidad.Atributo;
import Servicio.pooServicio;


public class Poo5 {

   
    public static void main(String[] args) {
        
        pooServicio cuenta = new pooServicio();
        Atributo Cuenta = cuenta.crearCuenta();
        
        System.out.println("");
        Cuenta.consultarDatos();
        System.out.println("");
        Cuenta.consultarSaldo();
    }
    
}