/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package packClases;
import java.util.Scanner;
import java.util.GregorianCalendar;



public class AlumnoMain {

    //Samuel Alcantara Fernandez
    
    public static void capturaCar(Carrera C[],int i){
        Scanner lectura = new Scanner(System.in);
        
        System.out.println("Nombre");
        String nom = lectura.next();
        System.out.println("Clave");
        int cc = lectura.nextInt();
        
        C[i] = new Carrera (cc,nom);
    }


    public static void capturaAlum(Alumno A[],int i){
       // Alumno obAlum1 = new Alumno();      
        Scanner leer = new Scanner (System.in);

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
        
        A[i].setnombre(nom);
        A[i].setnoControl(nc);
        A[i].setcveCar(cc);
        A[i].setsemAct(sm);
        A[i].setaNac(an);
        A[i].setdNac(dn);
        A[i].setmNac(mn);          
        
}

    public static String nomCarrera(Carrera C[],int cveBus, int lim ){
        for(int i=0; i<lim;i++){
            if(cveBus == C[i].getcveCar()){
                return C[i].getnomCar();
            }
        }
        return null;
    }
    
    
    public static void desplegarAlu(Alumno A[]){
        for (int i=0; (i <A.length) && ( A[i] != null); i++){
            System.out.println("Alumno "+ A[i].getnombre()+" No de control"+A[i].getnoControl()+" Edad: "+ A[i].edad());
            
        }
    }
    
   
    public static void despCarera(Carrera C [],Alumno A[],int car, int lim){
        String nombreC = nomCarrera(C,car,lim); 
        
        if(nombreC != null){
        System.out.println("Alumnos de Ingenieria en " + nombreC);
        for (int i=0;i<lim;i++){
            if (A[i].getcveCar()==car)
                System.out.println("Alumno "+A[i].getnombre() + " Es de "+ A[i].getcveCar() );
            }
        }
    }
    
    //lim establece el limite de alumnos
    
    
    public static void xEdad(Alumno A[],int lim,int edad){
        for (int i=0; i<lim; i++ ){
            if( (A[i].edad() )==edad){
                System.out.println("Alumno "+A[i].getnombre());
            }
        }
    }
    

    
    public static void xSem(Alumno A[],int lim, int sem){
        for (int i=0; i<lim; i++ ){
            if( (A[i].getsemAct()) == sem ){
                System.out.println("Alumno "+ A[i].getnombre());
            }
        }
    }
    
    public static Alumno[] copiaAlumno(Alumno A[],int lim, int semestre){
        Alumno AluS[] = new Alumno[lim];
        int j =0;
        for(int i=0;i<lim;i++){
            if(A[i].getsemAct()==semestre){
                AluS[j]=new Alumno (A[i]);
            }
        }
        
        return AluS;
    }
    
           
    //public Alumno[] copiaAlum(Alu[]);
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        
        int op = 0;
        int c = 0;
        int c2=0;
        Alumno Alu[]= new Alumno[15];
        Carrera Car[] = new Carrera[7];
        
        do{
        System.out.println("MENU");
        System.out.println("1 Captura datos Alumnos");
        System.out.println("2 Captura datos Carrera");
        System.out.println("3 Listado de Alumnos");
        System.out.println("4 Alumnos de Carreras");
        System.out.println("5 Alumnos para X carrera");
        System.out.println("6 Alumnos mayores de X edad");
        System.out.println("7 Alumnos de semestre y carrera X");
        System.out.println("8. Copiar los alumnos de un semestre"
        +" dado a un segundo arreglo");
        System.out.println("9 Salida");
        System.out.println("Introduce una opcion");
        op = leer.nextInt();
        
        switch(op){
            case 1: Alu[c] = new Alumno(); 
                capturaAlum(Alu,c);
                c++;
                break;
                
            case 2: capturaCar(Car,c2);
                c2++;
                break;
                
            case 3: desplegarAlu(Alu);
            break;
            
            case 4: //aluCar();
                
            break;
            
            case 5: System.out.println("Que carrera quiere desplegar?");
            int cc = leer.nextInt();
            despCarera(Car, Alu,cc,c);
            break;    
            
            case 6: 
                System.out.println("Alumnos de que edad quiere desplegar");
                int edad = leer.nextInt();
                xEdad(Alu,c,edad);
                c++;
            break;
                
            case 7: System.out.println("De que semestre quiere ver los alumnos");
                int semestre = leer.nextInt();
                xSem(Alu,c,semestre);
            c++;
            break;
            
            case 8: System.out.println("Ingrese el semestre");
            int semc = leer.nextInt();
            
            Alumno Alu2[] = copiaAlumno(Alu,c,semc);
            desplegarAlu(Alu2);
            break;
            
            case 9:
                System.out.println("Saliendo");
                break;
                
        }
        
        }while(op!=9);
        
    }
    
}
