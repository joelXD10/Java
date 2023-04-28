package introduccionjavaextra22;

/**
 *
 * @author joel
 */
public class IntroduccionJavaExtra22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*. Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y
        muestre la suma de sus elementos*/
        
        int[][]numeros = new int[2][2];
        
        int[][] matriz = CompletarMatriz(numeros);
        MostrarMatriz(matriz);
        
    }
    
    public static int[][] CompletarMatriz (int[][]numeros){
        
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                numeros[i][j] = (int) (Math.random()*10+1);
            }
        }
        
        return numeros;
    }
    
    public static void MostrarMatriz(int[][] numeros){
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println("Matriz [" + i + "][" + j + "]: " + numeros[i][j] );
            }
            
        }
    }
    
}
