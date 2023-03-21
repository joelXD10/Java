
package prestamoanses;

import java.util.Scanner;


public class PrestamoAnses {

  
    public static void main(String[] args) {
        
        Scanner leer= new Scanner(System.in);
        float prestamo,total1 ,total2, total3, cuota1, cuota2, cuota3, tasa1, tasa2, tasa3;
        
        System.out.println("Ingrese la cantidad a pedir de prestamo");
        prestamo=leer.nextFloat();
        System.out.println("");
        
        tasa1=(float) ((prestamo*36.04)/100);
        cuota1=(prestamo+tasa1)/24;
        total1=tasa1+prestamo;
        System.out.println("24 cuotas de: $"+cuota1);
        System.out.println("intereses: $"+(total1-prestamo));
        System.out.println("Prestamo con el interes de 36.04% es de: $"+ total1);
        System.out.println("");
       
        tasa2= (float)((prestamo*37.03)/100);
        cuota2= (prestamo+tasa2)/36;
        total2=tasa2+prestamo; 
        System.out.println("36 cuotas de: $"+cuota2);
              System.out.println("intereses: $"+(total2-prestamo));
         System.out.println("Prestamo con el interes del 37.03 es de: $"+ total2);
         System.out.println("");
        
        tasa3=(float) ((prestamo*37.55)/100);
        cuota3=(prestamo+tasa3)/48;
         total3=tasa3+prestamo;
        System.out.println("48 cuotas de: $"+cuota3);
        System.out.println("intereses: $"+(total3-prestamo));
        System.out.println("Prestamo con interes del 37.55% es de: $"+ total3);
 
        
        
        
    }
    
}
