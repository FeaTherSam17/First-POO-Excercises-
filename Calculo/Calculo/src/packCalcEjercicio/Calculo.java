/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packCalcEjercicio;

public class Calculo {
    /*
    private int factorial;
    private double base, exponente, gradosC, lado1, lado2, lado3;
    
    public void setfactorial(int factorial){
        this.factorial=factorial;
    }
    public int getfactorial(){
        return factorial;
    }
    
    public void setbase(double base){
        this.base=base;
    }
    public double getbase(){
        return base;
    }
    
    public void setexponente(double exponente){
        this.exponente=exponente;
    }
    public double getexponente(){
        return exponente;
    }
    
    public void setgradosC(double gradosC){
        this.gradosC=gradosC;
    }
    public double getgradosC(){
        return gradosC;
    }
    
    public void setlado1(double lado1){
        this.lado1=lado1;
    }
    public double getlado1(){
        return lado1;
    }
    
    public void setlado2(double lado2){
        this.lado2=lado2;
    }
    public double getlado2(){
        return lado2;
    }
    
    public void setlado3(double lado3){
        this.lado3=lado3;
    }
    public double getlado3(){
        return lado3;
    }
    */
    
    //FACTORIAL
    public int calcular (int factorial){
        
        if (factorial == 0){
            factorial = 1;
            return factorial;
        }else{
            
            int resultado =1;
            for(int i=factorial;i>0;i--){
            resultado=resultado*i; 
            }
        return resultado;
        }
    }
    
    //EXPONENTE
    public double calcular (double base, double exponente){
        if ((base == 0)&&(exponente== 0)){
            return -1;
        }
        else{
            double potencia = Math.pow(base, exponente);
            return potencia;
        }
    }
    
    // CELCIUS A FARENHEIT
    public double calcular(double gradosC){
        double F;
        F=((2/5)*gradosC)+32;
        return F;
    } 
    
    //TIPO DE TRIANGULO
    public String calcular(double lado1, double lado2, double lado3){
        String triangulo;
        if((lado1<=0)||(lado2<=0)||(lado3<=0)){
            return "No es un triangulo";
        }
        else if((lado1==lado2)&&(lado1==lado3)){
            triangulo ="Triangulo equilatero";
        }else if((lado1==lado2)||(lado1==lado3||(lado1==lado3))){
            triangulo = "Triangulo isóceles";
        }else{
            triangulo = "Triangulo escaleno";
        }
        
        return triangulo;
    }
    
    
    
}
