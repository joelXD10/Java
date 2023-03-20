package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author joel
 */
///CREACION DEL OBJETO
        public class CircuferenciaServicio {
            public Circunferencia CrearCirculo(){
                Circunferencia circulo= new Circunferencia();
                
///SE LLENA EL ATRIBUTO
                Scanner leer= new Scanner (System.in);
                
                System.out.println("Ingrese el radio");
                circulo.setRadio(leer.nextFloat());
                return circulo;
    
        }
 }
