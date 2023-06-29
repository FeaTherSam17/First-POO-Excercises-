/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packProyecto;

/**
 *
 * @author Polly
 */
public class EmpleadoPorHora extends Empleado implements Aumento{

    //ATRIBUTOS DEL EMPLEADO POR HORA
    protected double sueldoH;
    protected double horaSem;
    
    //CONSTRUCTOR
    public EmpleadoPorHora(String nombre, String apellidoP, String apellidoM, String IMSS, double sueldoH, double horaSem){
        super(nombre,apellidoP,apellidoM,IMSS); //PASO DE PARAMETROS POR HERENCIA DEL EMPLEADO
        this.horaSem=horaSem;
        this.sueldoH=sueldoH;
    }
      
    //METODOS GET Y SET DE LOS NUEVOS ATRIBUTOS
    public void setsueldoH(double sueldoH){
        this.sueldoH=sueldoH;
    }
    public double getasueldoH(){
        return sueldoH;
    }
    
    public void sethoraSem(double horaSem){
        this.sueldoH=sueldoH;
    }
    public double gethoraSemn(){
        return horaSem;
    }
    
    
    // METODO ABSTRACTO DEL EMPLEADO IMPLEMENTADO PARA CALCULAR LOS INGRESOS

    public void Aumento(int dia, int mes, int anyo){
       if(dia==DIA && mes==MES && anyo == ANYO){
           //Aumento sueldo por hora
         double sueldo = sueldoH*0.07;
         double sueldo1;
         sueldo1 = sueldoH+sueldo;
         sueldoH = sueldo1;
         
         double sueldoHfinal = sueldoH+sueldo1;
         
         nomina = sueldoHfinal;

           }else{
           //getNomina();       
          }
       }
    
    
    public void ingresos(){
        /* double sueldo = ventasBrutas;
         double sueldo1 = ventasBrutas*(tarifaComision/100);
         sueldo = sueldo1 + salarioBase;
         return sueldo;*/
         double sueldo1 = sueldoH*horaSem;
            setNomina(sueldo1);
    
        }
    
    
}
