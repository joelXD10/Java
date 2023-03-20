package Entidad;


///ATRIBUTOS
public class Atributo {
    private int numeroCuenta, DNI;
    private float saldoActual;
    
///CONSTRUCTOR
    public Atributo() {
    }

///CONSTRUCTOR COMPLETO
    public Atributo (int numeroCuenta, int DNI, float saldoActual){
        this.numeroCuenta = numeroCuenta;
        this.DNI= DNI;
        this.saldoActual = saldoActual;
    }
    
///SETTERS  OBTiENE EL VALOR
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(float saldoActual) {
        this.saldoActual = saldoActual;
    }

///GETERS MUESTRA EL VALOR
    public int getNumeroCuenta() {    
        return numeroCuenta;
    }
     public int getDNI() {
        return DNI;
    }

    public float getSaldoActual() {    
        return saldoActual;
    }
///METODO DE INGRESAR
    public float ingresar(double ingreso) {
        this.saldoActual= (float) (ingreso+this.saldoActual);
        System.out.println("$"+this.getSaldoActual());
        System.out.println("");
        return this.saldoActual;
                }            
    
 ///METODO DE RETIRAR 
    public float retirar (double retiro){
        if (this.saldoActual> retiro){
          this.saldoActual= (float) (this.saldoActual-retiro);  
        }else{
           this.saldoActual=0; 
        }
        
        System.out.println("$"+this.getSaldoActual());
        System.out.println("");
        return this.saldoActual;
    }
    
 ///EXTRACCION RAPIDA
    public float extraccionRapida(float extraccion){
        float porcentaje;
        porcentaje=(20*this.saldoActual/100);
        
        if(extraccion<porcentaje){
            this.saldoActual=this.saldoActual-extraccion;
             System.out.println(this.getSaldoActual());
             System.out.println("");
            return this.saldoActual;
             }else
                System.out.println("Su monto excede el 20%");
                System.out.println("$"+this.getSaldoActual());
                System.out.println("");
             return this.saldoActual;
         
    }

    ///CONSULTAR SALDO
    public void consultarSaldo(){
        System.out.println("Su saldo en total es: $"+ this.getSaldoActual());
}
    ///CONSULTAR DATOS
    public void consultarDatos(){
        System.out.println("Numero de Cuenta: "+this.numeroCuenta);
        System.out.println("DNI: "+this.getDNI());
    }
}

