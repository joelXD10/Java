
package Entidad;

///ATRIBUTOS
       public class Atributo {
           private int altura;
           private int base;
           
           
///CONSTRUCTOR VACIO

    public Atributo() {
    }
    
///CONSTRUCTOR 
    public Atributo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
    
///GETTERS

    public float getAltura() {
        return altura;
    }

    public float getBase() {
        return base;
    }
    
///SETTERS

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
 ///SUPERFICIE
    public float Superficie (){
        float sup;
        sup= altura*base;
        return sup;
    }
        
 ///PERIMETRO
    public float Perimetro(){
        float per;
        per=(base+altura)*2;
        return per;
    }
    
///METODO PARA DIBUJAR EL TRIANGULO
    public int Dibujar(){
        int i, j;
       /// matriz= new int[altura][base];
        for(i=0 ;i<base;i++){  
            for(j=0; j<altura ;j++)
                System.out.print("*");
                System.out.println(" ");
            }
               return 0;
        }  
 }


