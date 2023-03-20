
package Servicio;

import Entidad.Atributo;
import java.util.Scanner;


public class pooServicio {
    ///CREADOR DEL OBJETO
    public Atributo crearCuenta (){
        Atributo cuenta = new Atributo();
        
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese su numero de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese su DNI");
        cuenta.setDNI(leer.nextInt());
        System.out.println("Ingrese su saldo actual");
        cuenta.setSaldoActual(leer.nextFloat());
        
        System.out.println("Ingrese el monto a sumar a su saldo actual");
        cuenta.ingresar(leer.nextDouble());
        
        System.out.println("Ingrese el monto a extraer de su saldo");
        cuenta.retirar(leer.nextDouble());
        
        System.out.println("Ingrese el monto de su extraccion rapida solo se podra extraer el 20% de su saldo actual");
        cuenta.extraccionRapida(leer.nextFloat());
     
        return cuenta;
                
    }
} 
