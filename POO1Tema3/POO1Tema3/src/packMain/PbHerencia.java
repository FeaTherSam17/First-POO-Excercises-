
//package packHerencia;
package packMain;
import packHerencia.*;
import packAbstract.Figura;

import java.util.Scanner;

public class PbHerencia {

    public static void recorrido(Figura A[],int i){
        for (int j=0; j < A.length -1 ;j++){
           if(A[j]==null){
                A[j]=A[j+1];
                A[j+1]=null;
 
            }
           
        }
    }
   
           
    public static int buscar (int opcion, double radio, Figura A[] ){
        for (int i=0; i<A.length && A[i]!= null;i++ ){
            
            if(A[i] instanceof Cono && opcion == 3){
                Cono obT = (Cono)A[i];
                if (obT.getradio()==radio){
                    return i;
                    }
            }

                else if (A[i] instanceof Cilindro && opcion == 2){
                    Cilindro obT1= (Cilindro)A[i];
                    if(obT1.getradio()== radio){
                        return i;
                    }
                }
                    else if(A[i]instanceof Circulo && opcion == 1){
                        Circulo obt3 = (Circulo)A[i];
                        if(obt3.getradio()==radio){
                            return i;
                        }
                    }
                }  
      
       return -1;     
    }
    
    
    
    public static void desplegarFig(Figura A[]){
        for(int i=0; i<A.length; i++){
            //Se usa A[i] para los primeros 2 porque esos metodos los tiene Figura
            //El arreglo es de tipo figura
            if (A[i]!= null){
            System.out.println("FIGURA : "+A[i].getNombre());
            System.out.println("AREA: "+A[i].areaFig());
            //Apartir de aqui los demas datos dependeran de el tipo de figura

            if (A[i] instanceof Cono){
                Cono objTemp3=(Cono)A[i];
                        
                System.out.println("RADIO: "+objTemp3.getradio());
                System.out.println("ALTURA: "+objTemp3.getaltura());
                System.out.println("GENERATRIZ: "+objTemp3.getgeneratiz());
            }
            else if(A[i] instanceof Cilindro){
                Cilindro objTemp2=(Cilindro)A[i];
                System.out.println("RADIO: "+objTemp2.getradio());
                System.out.println("ALTURA: "+objTemp2.getaltura());
            }
            else if(A[i] instanceof Circulo){
                Circulo objTemp1=(Circulo)A[i];
                System.out.println("RADIO: "+objTemp1.getradio());    
                 }
   
            }
   
        }
    }
    
    
    
    public static Figura eliminarFig(int pos,Figura A[] ){
        Figura objtem=A[pos];
        A[pos]=null;
        recorrido(A,pos);  
        return objtem;
    }
    
    
    public static void modificarFig(int opcion, int posicion, Figura A[]){
        Scanner leer = new Scanner (System.in);
        double radio;
        double altura;
        double generatriz;
        if (A[posicion] instanceof Cono && opcion==3){
            
            System.out.println("Intresa el Radio");
            radio = leer.nextDouble();
            System.out.println("Ingresa la Altura");
            altura = leer.nextDouble();
            System.out.println("Ingrese la Generatriz");
            generatriz = leer.nextDouble();
            Cono objTemp3=(Cono)A[posicion];
            objTemp3.setgeneratriz(generatriz);
            objTemp3.setradio(radio);
            System.out.println("El area del cono es "+objTemp3.areaFig());
            System.out.println("El volumen es "+objTemp3.volumen());
        }else if (A[posicion] instanceof Cilindro && opcion==2){
            
            System.out.println("Ingresa el Radio");
            radio = leer.nextDouble();
            System.out.println("Ingresa la Altura");
            altura = leer.nextDouble();
                    //objCilindro.setradio(radio);
                    //entre parentesis el tipo de dato al que se quiere convertir
            Cilindro objTemp2=(Cilindro)A[posicion];
            objTemp2.setaltura(altura);
            System.out.println("El area del cilindro es "+objTemp2.areaFig());
            System.out.println("El volumen del cilindro es "+objTemp2.volumen());
        }else if(A[posicion] instanceof Circulo && opcion==1){
            System.out.println("Intresa el Radio");
                    radio = leer.nextDouble();
                    Circulo objTemp3=(Circulo)A[posicion];
                    objTemp3.setradio(radio);
                    
                    System.out.println("El area del Circulo es "+objTemp3.areaFig());
        }
        
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int op,i=0;
        Figura ar []=new Figura[10];
        double radio=0,altura =0, generatriz=0;
        do{
            System.out.println("");
            System.out.println("FIGURAS GEOMETRICAS ");
            System.out.println("1. CIRCULO");
            System.out.println("2. CILINDRO");
            System.out.println("3. CONO");
            System.out.println("4. Listado de Figuras");
            System.out.println("5. Eliminar Figura");
            System.out.println("6. Modificar figura");
            System.out.println("9. Salir");
            op = leer.nextInt();
            
            switch(op){
                case 1:
                    System.out.println("Ingresa el radio del circulo");
                    radio = leer.nextDouble();
                    ar[i]=new Circulo("Circulo",radio);
                    
                    //Circulo objCirculo = new Circulo(radio);
                    
                    //objCirculo.setradio(radio);
                    System.out.println("El area del "+ ar[i].getNombre() +" es:"+ ar[i].areaFig());
                    i++;
                    break;
                
                case 2:
                    System.out.println("Ingresa el Radio");
                    radio = leer.nextDouble();
                    System.out.println("Ingresa la Altura");
                    altura = leer.nextDouble();
                    ar[i]=new Cilindro(radio,"Cilindro",altura);                    
                    //objCilindro.setradio(radio);
                    
                    //entre parentesis el tipo de dato al que se quiere convertir
                    Cilindro objTemp1=(Cilindro)ar[i];
                    objTemp1.setaltura(altura);
                    System.out.println("El area del cilindro es "+objTemp1.areaFig());
                    System.out.println("El volumen del cilindro es "+objTemp1.volumen());
                    i++;
                    break;
                    
                case 3:
                    System.out.println("Intresa el Radio");
                    radio = leer.nextDouble();
                    System.out.println("Ingresa la Altura");
                    altura = leer.nextDouble();
                    System.out.println("Ingrese la Generatriz");
                    generatriz = leer.nextDouble();
                    ar[i]=new Cono(radio,"Cono",altura,generatriz);
                    Cono objTemp2=(Cono)ar[i];
                    objTemp2.setgeneratriz(generatriz);
                    objTemp2.setradio(radio);
                    
                    //Cono objCono =new Cono(radio);
                    
                    /*objCono.setradio(radio);
                    objCono.setaltura(altura);
                    objCono.setgeneratriz(generatriz);
                    */
                    System.out.println("El area del cono es "+objTemp2.areaFig());
                    System.out.println("El volumen es "+objTemp2.volumen());
                    i++;
                    break;
                    
                case 4:   
                    desplegarFig(ar);
                    break;
                    
                case 5:
                    System.out.println("Que figura desea eliminar");
                    System.out.println("1. Circulo \n 2.Cilindro \n 3. Cono");
                    int opE= leer.nextInt();
                    
                    System.out.println("Que radio tiene");
                    double rad= leer.nextInt();
                    
                    int indice = buscar(opE,rad,ar);
                    //System.out.println(indice); LINEA DE PRUEBA PARA VER QUE LUGAR DEL ARREGLO ESTA ELIMINANDO 
                    if(indice != -1){
                        Figura obE = eliminarFig(indice,ar);
                        System.out.println(obE.getNombre()+" Se ha eliminado");
                        obE = null;
                        
                    }else {
                        System.out.println("La figura no Existe");
                        break;
                    }
                    
                    //recorrer(ar,i);
                    
                    break;
                    
                case 6:
                    System.out.println("Que figura desea modificar");
                    System.out.println("1. Circulo \n 2.Cilindro \n 3. Cono");                      
                    int opM= leer.nextInt();
                    System.out.println("Cual es su radio");
                    rad=leer.nextDouble();
                    
                    int posicion = buscar(opM,rad,ar);
                    modificarFig(opM,posicion,ar);
                    
                    break;
            }
        }while(op!=9);    
    } 
}
