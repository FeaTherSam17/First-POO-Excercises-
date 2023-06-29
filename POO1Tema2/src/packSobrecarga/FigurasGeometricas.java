/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packSobrecarga;

/**
 *
 * @author Usuario
 */
public class FigurasGeometricas {
    public String nombreFig;
    
    //-------> Constructor <-------
    public FigurasGeometricas(String nombreFig){
        this.nombreFig = nombreFig;
    }
    
    public void setNombreFig(String nombreFig){
        this.nombreFig = nombreFig;
    }
    public String getNombreFig(){
        return nombreFig;
    }
    
        //Math. (clase matematicas)
    
            //-----------> AREA <-----------
    //Circulo
    public double area(double radio){
        double areaC;
        areaC = Math.PI *radio*radio;
        
        return areaC;
    }
    
    //Rectangulo
    public double area(double base, double altura){
        double areaR;
        areaR = base*altura;
        
        return areaR;
    }
     
    //Trapecio
    public double area(double baseMayor, double baseMenor, double altura){
        double areaT;
        areaT = ((baseMayor+baseMenor)*altura)/2;
        
        return areaT;
    }
    
             //-----------> PERIMETRO <-----------
    
    //Circulo
    public double perimetro(double radio){
        double perimetroC;
        perimetroC = 2*Math.PI*radio;
        
        return perimetroC;
    }
    
    //Rectangulo
    public double perimetro(double base, double altura ){
        double perimetroR;
        perimetroR = 2*base + 2*altura;
        
        return perimetroR;
    }
    
    //Trapecio
    public double perimetro(double lado1, double lado2, double lado3, double lado4 ){
        double perimetroT;
        perimetroT= lado1 + lado2 + lado3 + lado4;
        
        return perimetroT;
    }
    
    
}
