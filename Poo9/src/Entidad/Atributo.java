
package Entidad;


public class Atributo {
    private float num1, num2;

    public Atributo() {
        
    }

    public Atributo(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
///METODO DEVUELVE EL MAYOR NUMERO
    public void MayorNumero(){
                System.out.println("METODO DEVUELVE EL NUMERO MAYOR");
        if (this.num1>this.num2){
         System.out.println("Numero 1 es mayor: "+ num1);      
        }else 
            System.out.println("Numero 2 es mayor: "+num2);  
            System.out.println("");
                
    }   
///METODO DEVUELVE POTENCIA    
     public void calcularPotencia(){
        int primero, segundo, minimo, maximo, potencia;
            System.out.println("METODO DEVUELVE POTENCIA");    
       primero=Math.round (num1);
       segundo= Math.round(num2);
       minimo=Math.min(primero,segundo);
       maximo=Math.max(primero,segundo);
            System.out.println("El numero mayor es: "+primero);
            System.out.println("El numero menor es: "+segundo);
       potencia=(int) Math.pow(maximo, minimo);
            System.out.println(maximo+"^"+minimo+"= "+ potencia);
            System.out.println("");
       
    }
 
///METODO DEVUELVE RAIZ
     public float calcularRaiz(){
      int valor1, valor2, minimo;
      float raiz;
            System.out.println("METODO DEVUELVE RAIZ");
      minimo=(int) Math.min(num1, num2);
      valor1=Math.abs(minimo);
            System.out.println(valor1);
       raiz=(int) Math.sqrt(valor1);
            System.out.println("La raiz cuadrada de "+minimo+" es: "+raiz);
      return raiz;   
     }
     
    
}
