package introduccionjavaextra19;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
        comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
        elementos).*/
        
        int[]array1 = new int[3];
        int[] array2 = new int[3];
        
        ////Valores del array 1.
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;
        
        ///Valores del arrary 2.
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 5;
        
        
        
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if(array1[i] != array2[j]){
                    System.out.println("Se termino la ejecucion");
                    System.out.println("El array1[" + i + "]: " + array1[i]);
                    System.out.println("El array2[" + j + "]: " + array2[j]);
                    break;
                }
            }
        }
    }
    
}
