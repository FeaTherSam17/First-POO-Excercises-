/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packSobrecarga;
import java.util.Scanner;
import packAbstract.Figura;
import packHerencia.Circulo;

/**
 *
 * @author Usuario
 */
       
public class NewMainFiguras {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lectura = new Scanner(System.in);
        int op=0;
        int i=0;
        Figura arregloF[]= new Figura [10];
                
        System.out.println("Programa que calcula el Area y perimetro del las figuras");
        
        do{
            System.out.println();
            System.out.println("1.- Area del circulo");
            System.out.println("2.- Area del rectangulo");
            System.out.println("3.- Area del trapecio");
            System.out.println("4.- Perimetro del circulo");
            System.out.println("5.- Perimetro del rectangulo");
            System.out.println("6.- Perimetro del trapecio");
            System.out.println("7.- Salida");
            op=lectura.nextInt();
            
            switch(op){
                
                case 1:
                    FigurasGeometricas circulo = new FigurasGeometricas("Circulo");
                    System.out.println("Ingrese el radio del circulo");
                    double radio = lectura.nextFloat();
                    Circulo objCir = new Circulo(radio);
                    arregloF[i] = objCir;

                    double area1 = objCir.areaFig(); // area variable???
                    System.out.println("El area de " + circulo.getNombreFig()+" es " + area1);
                    i++;
                    break;
                    
                case 2:
                    FigurasGeometricas rectangulo = new FigurasGeometricas("Rectangulo");
                    
                    rectangulo.setNombreFig("Rectangulo");
                    
                    System.out.println("Ingrese la base del Rectangulo");
                    double base = lectura.nextDouble();
                    System.out.println("Ingresa la altura del Rectangulo");
                    double altura = lectura.nextDouble();
                    double area2 = rectangulo.area(base, altura); //
                    
                    System.out.println("El area de " + rectangulo.getNombreFig()+" es " + area2);
                    break;
                    
                    
                case 3:
                    FigurasGeometricas trapecio = new FigurasGeometricas("Trapecio");
                    
                    trapecio.setNombreFig("Trapecio");
                    
                    System.out.println("Ingrese la base Mayor del Trapecio");
                    double baseMayor = lectura.nextDouble();
                    System.out.println("Ingrese la base Menor del Trapecio");
                    double baseMenor = lectura.nextDouble();
                    System.out.println("Ingrese la base la Alura del Trapecio");
                    double alturaT = lectura.nextDouble();
                    
                    double areaT=trapecio.area(baseMayor, baseMenor, alturaT); ///
                    
                    System.out.println("El area del "+trapecio.getNombreFig()+" es "+areaT);
                    
                    break;
                    
                    //se cambia el nombre del objeto porque puede variar el valor
                    // no tiene por que ser el mismo que el del area :(:
                case 4:
                    FigurasGeometricas circulop = new FigurasGeometricas("Circulo");
                    circulop.setNombreFig("Circulo");
                    System.out.println("Ingrese el radio del circulo");
                    radio = lectura.nextFloat();
                    double perimetroc = circulop.perimetro(radio); // area variable???
                    System.out.println("El area de " + circulop.getNombreFig()+" es " + perimetroc);
                    break;
                    
                    
                case 5:
                    FigurasGeometricas rectangulop = new FigurasGeometricas("Rectangulo");
                    
                    rectangulop.setNombreFig("Rectangulo");
                    
                    System.out.println("Ingrese la base del Rectangulo");
                    base = lectura.nextDouble();
                    System.out.println("Ingresa la altura del Rectangulo");
                    altura = lectura.nextDouble();
                    double perimetroR = rectangulop.perimetro(base, altura); //
                    
                    System.out.println("El area de " + rectangulop.getNombreFig()+" es " + perimetroR);
                    break;
                    
                    
                case 6:
                    FigurasGeometricas trapeciop = new FigurasGeometricas("Trapecio");
                    
                    trapeciop.setNombreFig("Trapecio");
                    
                    System.out.println("Ingrese el lado 1 del Trapecio");
                    double Lado1t = lectura.nextDouble();
                    System.out.println("Ingrese el lado 2 Trapecio");
                    double lado2t = lectura.nextDouble();
                    System.out.println("Ingrese el lado 3 del Trapecio");
                    double Lado3t = lectura.nextDouble();
                    System.out.println("Ingrese el lado 4 Trapecio");
                    double lado4t = lectura.nextDouble();
                    
                    double PerimetroT=trapeciop.perimetro(Lado1t, lado2t, Lado3t, lado4t); ///
                    
                    System.out.println("El perimetro del "+trapeciop.getNombreFig()+" es "+ PerimetroT);
                    break;
                    
                    
            }
        }while(op != 7);
      
    }
    
}
