package introduccionjava17;

import java.util.Scanner;

/**
 *
 * @author joel
 */
public class IntroduccionJava17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
        de 2 dígitos, etcétera (hasta 5 dígitos).*/
        
        Scanner leer = new Scanner (System.in);
        
        int contador_1 = 0;
        int contador_2 = 0;
        int contador_3 = 0;
        int contador_4 = 0;
        int contador_5 = 0;
            
        int[]vector_numeros= new int[5];
        
        
        for (int i = 0; i < vector_numeros.length ; i++) {
            System.out.println("Ingrese un numero: ");
            vector_numeros[i]= leer.nextInt();
                
                if(vector_numeros[i]>=0 && vector_numeros[i]<=9){
                    contador_1++;
                }else if (vector_numeros[i]>=10 && vector_numeros[i]<=99){
                    contador_2++;
                }else if (vector_numeros[i]>=100 && vector_numeros[i]<=999){
                    contador_3++;
                }else if (vector_numeros[i]>=1000 && vector_numeros[i]<=9999){
                    contador_4++;
                }else if (vector_numeros[i]>=10000 && vector_numeros[i]<=99999){
                    contador_5++;
                }
        }
        
        System.out.println("N° con 1 digito: "+ contador_1);
        System.out.println("N° con 2 digito: "+ contador_2);
        System.out.println("N° con 3 digito: "+ contador_3);
        System.out.println("N° con 4 digito: "+ contador_4);
        System.out.println("N° con 5 digito: "+ contador_5);
        
    }
    
}
