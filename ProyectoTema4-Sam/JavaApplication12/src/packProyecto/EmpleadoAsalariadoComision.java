/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packProyecto;

/**
 *
 * @author Polly
 */
public class EmpleadoAsalariadoComision extends EmpleadoComision implements Aumento{
    
     protected double salarioBase;
      //CONSTRUCTOR
    public EmpleadoAsalariadoComision(String nombre, String apellidoP, String apellidoM, String IMSS, 
            double ventasBrutas, double tarifaComision, double salarioBase){
        super(nombre,apellidoP,apellidoM,IMSS,ventasBrutas,tarifaComision);
        this.salarioBase=salarioBase;
    }
    
    //METODOS GET Y SET DE LOS NUEVOS ATRIBUTOS
    public void setsalarioBase(double salarioBase){
        this.salarioBase=salarioBase;
    }
    public double getsalarioBase(){
        return salarioBase;
    }
    
    
    public void Aumento(int dia, int mes, int anyo){
       if(dia==DIA && mes==MES && anyo == ANYO){
           //Aumento salario
         double salario = salarioBase*0.05;
         double salarioB;
         salarioB = salarioBase+salario;
         salarioBase = salarioB;
         
         //Aumento tarifa
         double tarifa = (tarifaComision/100)*0.07;
         double tarifaC = tarifaComision+tarifa*100;
         tarifaComision = tarifaC;

         double nomina1 = salarioB+(ventasBrutas*tarifaComision/100);
         
         nomina = nomina1;

           }else{
           //getNomina();       
          }
       }
    
    
    
    
    // METODO ABSTRACTO DEL EMPLEADO IMPLEMENTADO PARA CALCULAR LOS INGRESOS
    public void ingresos(){
        /* double sueldo = ventasBrutas;
         double sueldo1 = ventasBrutas*(tarifaComision/100);
         sueldo = sueldo1 + salarioBase;
         return sueldo;*/
         double sueldo1 = ventasBrutas*(tarifaComision/100)+salarioBase;
            setNomina(sueldo1);
    
        }
    
          
     
     
}
