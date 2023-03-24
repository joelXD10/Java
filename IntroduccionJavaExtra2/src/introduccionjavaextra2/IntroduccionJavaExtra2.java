/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package introduccionjavaextra2;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
        una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
        tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
        iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.*/ 
        
        int a, b, c, d;
        
        a=1;
        b=2;
        c=3;
        d=4;
        
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
        System.out.println(" ");
        b=c;
        c=a;
        a=d;
        d=b;
        
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("c: "+c);
        System.out.println("d: "+d);
    }
    
}
