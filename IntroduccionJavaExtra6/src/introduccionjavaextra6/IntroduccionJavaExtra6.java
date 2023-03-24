/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjavaextra6;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
        debajo de 1.60 mts. y el promedio de estaturas en general.*/ 
        
        Scanner leer = new Scanner (System.in);
        float promedio_altura1 = 0;
        float altura;
        float promedio_altura = 0;
        int contador = 0;
        
        
        System.out.print("Ingrese la cantidad de personas: ");
        int personas = leer.nextInt();
        
        System.out.println("Ingrese la altura de las personas: ");
            //Se ingesa la altura de la personas
            for (int i = 0; i < personas; i++) {
                System.out.print(i + "Persona: ");
                altura = leer.nextFloat();        
                
                    //ALgoritmo para personas con estatura debajo de 1,60mts.
                    if(altura<1.60){
                        contador++;
                        promedio_altura1 = promedio_altura1 + altura;
                    }
                    
                promedio_altura= promedio_altura+altura;    
            }
            
        System.out.println("El promedio de altura es de: " + (promedio_altura/personas));    
        System.out.println("El promedio debajo de 1,60mts es de: " + (promedio_altura1/contador));
        
    }
    
}

