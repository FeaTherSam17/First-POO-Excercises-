/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packProyecto;

import static packProyecto.Aumento.ANYO;
import static packProyecto.Aumento.DIA;
import static packProyecto.Aumento.MES;

/**
 *
 * @author Polly
 */
public class EmpleadoComision extends Empleado implements Aumento{
    
    //ATRIBUTOS
    protected double ventasBrutas;
    protected double tarifaComision;
    
    //CONSTRUCTOR
    public EmpleadoComision(String nombre, String apellidoP, String apellidoM, String IMSS, double ventasBrutas, double tarifaComision){
        super(nombre,apellidoP,apellidoM,IMSS);
        this.tarifaComision=tarifaComision;
        this.ventasBrutas=ventasBrutas;
    }
    
    
    //METODOS GET Y SET DE LOS NUEVOS ATRIBUTOS
    public void setventasBrutas(double ventasBrutas){
        this.ventasBrutas=ventasBrutas;
    }
    public double getventasBrutas(){
        return ventasBrutas;
    }
    
    public void settarifaComision(double tarifaComision){
        this.tarifaComision=tarifaComision;
    }
    public double gettarifaComision(){
        return tarifaComision;
    }
    
    //metodo para calcular el ingreso segun las ventas realizadas
    public void ingresos(){

         double sueldo1 = ventasBrutas*(tarifaComision/100);
            setNomina(sueldo1);
    
        }
    
    public void Aumento (int dia, int mes, int anyo){
       if(dia==DIA && mes==MES && anyo == ANYO){
           //Aumento del sueldo por Hora
           double sueldo = ventasBrutas*0.07;
           //double sueldo2= sueldoH + sueldo1;
           if (ventasBrutas==1000000){
               //return ingresos();
               nomina = 220000;
           }
           else if (tarifaComision == 20){
           nomina = ventasBrutas*.22;
           //return sueldo;
           }
           else {
               nomina = sueldo;
                      }
       }
       else {
               //return ingresos()*(tarifaComision/100);
               }
    }
}
