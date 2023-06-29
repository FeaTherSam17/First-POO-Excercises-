/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packExamen;

/**
 *
 * @author Usuario
 */
public class JornadaLab {
    private String clave;
    private double sueldoHora;
    private double horasSem;
    
    public JornadaLab(String clave, double sueldoHora, double horasSem){
        this.clave=clave;
        this.horasSem=horasSem;
        this.sueldoHora=sueldoHora;
    }
    
    public void setclave(String clave){
        this.clave= clave;
    }
    public String getclave(){
        return clave;
    }
    
    
    public double calculo(){
        if (horasSem>40){
            double horasExt = horasSem - 40;
            double impTE = horasExt*sueldoHora*2;
            return impTE + sueldoHora*40;
        } else{
            return sueldoHora*horasSem;
              }
    }
    
    public double calculo(double descuento){
        return calculo()-descuento; 
    }
    
    
    
    
    
}
