/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packCalcEjercicio;
import java.util.Scanner;
/**
 *
 * @author Polly
 */
public class CalculoPrueba {
    public static void main (String[] args){
        Calculo objCalculo = new Calculo();
        Scanner lectura = new Scanner(System.in);
        int op=0;
        
        System.out.println("Sobrecarga de metodos para calcular diferentes cosas");
        System.out.println("");
        do{
            System.out.println("1.- Calcular el factorial de un numero");
            System.out.println("2.- Elevar un numero (positivo) a una potencia dada(positivo)");
            System.out.println("3.- Convertir grados Celsius a Fahrenheit");
            System.out.println("4.- Determinar de que tipo es un triangulo a partir de sus tres lados");
            System.out.println("5.- Salir");
            op = lectura.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Digite un numero entero");
                    int factorial = lectura.nextInt();
                    int factorialCal = objCalculo.calcular(factorial);
                    System.out.println("El factorial de "+ factorial +" es "+factorialCal);
                    break;
                    
                case 2:
                    System.out.println("Digite la base");
                    double base = lectura.nextDouble();
                    System.out.println("Digite el exponente");
                    double exponente = lectura.nextDouble();
                    double potencia = objCalculo.calcular(base, exponente);
                    System.out.println(base + " elevado a "+exponente+ " es "+potencia);
                    
                    break;
                    
                case 3:
                    System.out.println(" Digite los grados Celsius a convertir");
                    double gradosC=lectura.nextDouble();
                    double Fahrenheit = objCalculo.calcular(gradosC);
                    System.out.println(gradosC+" grados Celsius a Fahrenheit es: "+Fahrenheit+"F");
                    break;
                    
                case 4:
                    System.out.println("Digite los lados del triangulo");
                    System.out.println("Lado 1");
                    double l1=lectura.nextDouble();
                    System.out.println("Lado 2");
                    double l2=lectura.nextDouble();
                    System.out.println("Lado 3");
                    double l3=lectura.nextDouble();
                    
                    String triangulo = objCalculo.calcular(l1, l2, l3);
                    System.out.println("El tipo de triangulo es: "+triangulo);
                    break;
                    
            }
            
            
        }while(op != 5);
    }
}
