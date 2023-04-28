/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introduccionjavaextra21;

import java.util.Scanner;

/**
 
 * @author joel
 */
public class IntroduccionJavaExtra21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas
        adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y
        desaprobados. Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos
        prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
        Primer trabajo práctico evaluativo 10%
        Segundo trabajo práctico evaluativo 15%
        Primer Integrador 25%
        Segundo integrador 50%
        Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del
        programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
        desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor o
        igual al 7 de sus notas del curso.*/ 
        
        Menu();
     
    }
    
    public static float[] Notas(float[] notas){
        Scanner leer = new Scanner (System.in);
                
            for (int i = 0; i < notas.length; i++) {
                System.out.print("Ingrese sus notas: ");
                notas[i] = leer.nextFloat();
            }
        
            return notas;
    }
    
    public static float Promedio(float []registro){
        float promedio, trabajo_practico1, trabajo_practico2, integrador1, integrador2;
        
        trabajo_practico1 = (10*registro[0])/100;
        trabajo_practico2 = (15*registro[1])/100;
        integrador1 = (25*registro[2])/100;
        integrador2 = (50*registro[3])/100;
        
        promedio = (trabajo_practico1 + trabajo_practico2 + integrador1 + integrador2)/4;
        
        System.out.println("Promedio: " + promedio);
        
            if (promedio>7){
                System.out.println("Aprobo");
            }else{
                System.out.println("No Aprobo");
            }
        
        return promedio;
    }
    
     public static void Menu(){
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        
        float [] notas = new float[4];
       
            for (int i = 0; i < 2; i++) {
             
             System.out.print("Ingrese el nombre del alumno: ");
             String alumno = leer.next();
                float[] registro = Notas(notas);
                float promedio = Promedio(registro);
            }
        
        
    }
}
