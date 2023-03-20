package Entidad;

import javax.swing.JOptionPane;

/**
 *
 * @author joel
 */
// ATRIBUTOS
        public class Circunferencia {
            private float radio;
        
///CONSTRUCTOR
    public Circunferencia(float radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }   
    
///SETTERS
    public void setRadio(float radio) {
        this.radio = radio;
    }
    
///GETTERS
    public float getRadio() {
        return radio;
    }   
    
    ///CIRCUNFERENCIA
    public float area(){
       float ar;
       ar=(float)(3.14*Math.pow(radio,2));
       return ar;
    }
    
///PERIMETRO
    public float perimetro(){
        float per;
        per=(float) (2*3.14*radio);
        return per;
    }
            }



