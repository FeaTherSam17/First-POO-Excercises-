/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packExamen;

/**
 *
 * @author Usuario
 */
public class ExamPOOT1 {
    public static void main (String[] args){
    JornadaLab objJornada= new JornadaLab("1FTHR5453",200,45);
    double sueldo = objJornada.calculo(500);
    System.out.println("El sueldo total es de "+ sueldo);
    }
}
