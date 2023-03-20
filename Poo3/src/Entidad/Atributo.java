
package Entidad;

///ATRIBUTOS
        public class Atributo {
            private int numero1;
            private int numero2;
            
///CONSTRUCTORES VACIO
    public Atributo() {
    }
    
///CONSTRUCTOR CON ATRIBUTOS    

    public Atributo(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

///GETTER
    public int getNumero1() {
        return numero1;
    }

   
    public int getNumero2() {
        return numero2;
    }

///SETTER
     public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
///METODO SUMA    
    public int suma (){
        int sum;
        sum=numero1+numero2;
        return sum;
         }
    
 ///METODO RESTA
    public int resta (){
        int res;
        res=numero1-numero2;
        return res;
    }
 
 ///METODO MULTIPLICAR
    public int multiplicar (){
        int mult;
        if(numero1==0 || numero2==0){
            System.out.println("Error!!! uno de sus dos numero es 0");
            return 0;
        } else
            mult= numero1*numero2;
            return mult;
        
    }
  
 ///METODO DIVIDIR
    public int dividir (){
        int div;
        if (numero1==0 || numero2==0){
           System.out.println("Error!!! uno de sus numero es 0");
           return 0; 
        } else
             div= numero1/numero2;
            return div;
    }

}
            

       

    