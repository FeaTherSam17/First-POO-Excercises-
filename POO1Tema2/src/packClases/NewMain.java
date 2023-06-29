/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package packClases;
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);

       Alumno obAlum1 = new Alumno();      
        System.out.println("Fecha actual "+obAlum1.dia()+"/"+ obAlum1.mes()+ "/"+obAlum1.año());
        System.out.println("Nombre: ");
        String nom = leer.next();
        
        System.out.println("Fecha de nacimiento:");
        System.out.println("Dia");
        int dn = leer.nextInt();
        
        System.out.println("Mes:");
        int mn = leer.nextInt();
        
        System.out.println("Año");
        int an = leer.nextInt(); 
        
        System.out.println("Num. control");
        String nc = leer.next(); 
        
        System.out.println("Semestre actual");
        int sm = leer.nextInt(); 
        
        System.out.println("Clave de carrera");
        int cc = leer.nextInt();
        
        obAlum1.setnombre(nom);
        obAlum1.setnoControl(nc);
        obAlum1.setcveCar(cc);
        obAlum1.setsemAct(sm);
        obAlum1.setaNac(an);
        obAlum1.setdNac(dn);
        obAlum1.setmNac(mn);          
        
        
        Alumno obAlum2 = new Alumno();
        
        System.out.println("Nombre: ");
        nom = leer.next();
        
        System.out.println("Fecha de nacimiento:");
        System.out.println("Dia");
        dn = leer.nextInt();
        
        System.out.println("Mes:");
        mn = leer.nextInt();
        
        System.out.println("Año");
        an = leer.nextInt(); 
        
        System.out.println("Num. control");
        nc = leer.nextLine(); 
        
        System.out.println("Semestre actual");
        sm = leer.nextInt(); 
        
        System.out.println("Clave de carrera");
        cc = leer.nextInt();
        
        obAlum2.setnombre(nom);
        obAlum2.setnoControl(nc);
        obAlum2.setcveCar(cc);
        obAlum2.setsemAct(sm);
        obAlum2.setaNac(an);
        obAlum2.setdNac(dn);
        obAlum2.setmNac(mn);
        
        int ed1 = obAlum1.edad();
        int ed2 = obAlum2.edad();
        if(ed1>ed2){
            System.out.println("El mayor es "+obAlum1.getnombre()+"y tiene "+ ed1 +" años");
        }
        else if(ed2>ed1){
            System.out.println("El mayor es "+ obAlum2.getnombre()+ "y tiene "+ed2+" años");
        }
        else{
            System.out.println("Los alumnos tienen la misma edad");
        }
     
        
        
    }
    
}

