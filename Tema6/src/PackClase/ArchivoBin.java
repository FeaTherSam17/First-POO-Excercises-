/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackClase;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Clase para escribir y leer datos numéricos en un archivo binario
 *
 * AUTOR: Alma P. Vasquez
 */
/**
 *
 * @author Polly
 */
public class ArchivoBin {

    InputStreamReader ISR = new InputStreamReader(System.in);
    BufferedReader BR = new BufferedReader(ISR);

    //METODO PARA ESCRIBIR
    public int escritura(String nomar) throws Exception {

        String numControl, aPat, aMat, nombre;
        double promedio = 0;
        int carrera, num = 0;

// DECLARACION DEL OBJETO ASOCIADO AL ARCHIVO
        DataOutputStream dos = null;

//ABRE O CREA ARCHIVO para agregar datos
        try {
            dos = new DataOutputStream(new FileOutputStream(nomar, true));
        } catch (IOException e) {
            System.out.println("Error de Apertura o Creacion");
            return 1;
        }

// ESCRIBE REGISTRO DEL ARCHIVO
        try {
            do {
                System.out.print("INGRESE Num. Control [salida=999]: ");
                numControl = (BR.readLine());
                if (!numControl.equals("999")) {
                    System.out.print("INGRESE EL NOMBRE: ");
                    nombre = (BR.readLine());
                    System.out.print("INGRESE EL APELLIDO PATERNO: ");
                    aPat = (BR.readLine());
                    System.out.print("INGRESE EL APELLIDO MATERNO: ");
                    aMat = (BR.readLine());
                    System.out.print("INGRESE EL PROMEDIO: ");
                    promedio = Double.parseDouble(BR.readLine());
                    System.out.print("INGRESE CARRERA: ");
                    carrera = Integer.parseInt(BR.readLine());

                    dos.writeUTF(numControl);
                    dos.writeUTF(nombre);
                    dos.writeUTF(aPat);
                    dos.writeUTF(aMat);
                    dos.writeDouble(promedio);
                    dos.writeInt(carrera);

                }
            } while (!numControl.equals("999"));

        } catch (NumberFormatException e) {
            System.out.println("Error en captura");
            return 2;
        } catch (IOException e) {
            System.out.println("Error escritura");
            return 2;
        } finally {
            dos.close();
        }

        return 0;
    }

    //METODO PARA LEER
    public int lectura(String nomarc) throws Exception {
        int num;
        float cant;
        String numControl, aPat, aMat, nombre;
        double promedio;
        int carrera;

        DataInputStream dis = null;
        try {

            dis = new DataInputStream(new FileInputStream(nomarc));
        } catch (FileNotFoundException e) {
            System.out.println("Error de Apertura-Lec");
            return 1;
        }

        try {
            System.out.println(" LISTADO DE ALUMNOS");
            System.out.println(dis.available());
            while (dis.available() != 0) {

                numControl = dis.readUTF();
                nombre = dis.readUTF();
                aPat = dis.readUTF();
                aMat = dis.readUTF();
                promedio = dis.readDouble();
                carrera = dis.readInt();

                System.out.println();
                System.out.println("Num. de Control: " + numControl);
                System.out.println("Nombre: " + nombre
                        + " " + aPat
                        + " " + aMat);
                System.out.println("Promedio " + promedio);
                System.out.println("Codigo de Carrera: " + carrera);
            }

        } catch (IOException e) {
            System.out.println("Error lectura");
            return 0;
        } finally {
            dis.close();
        }
        return 0;
    }

    public void copia(String nom1, String nom2) throws IOException {
        //El nom1 sera el archivo a copiar
        //El nom2 sera el archivo copiado 

        //Se usa entrada y salida
        DataOutputStream dos = null;
        DataInputStream dis = null;

        //DATOS
        int num;
        //float cant;
        String numControl = "", aPat = "", aMat = "", nombre = "";
        double promedio;
        int carrera;

        try {

            //ENTRADA == LECTURA
            dis = new DataInputStream(new FileInputStream(nom1));
            //SALIDA == ESCRITURA
            dos = new DataOutputStream(new FileOutputStream(nom2, false));    //El >false< indica una sobreescritura            

        } catch (IOException e) {
            System.out.println("Error en la apertura o creacion de archivos");
        }

        //ESTE TRY ES PARA LA LECTURA
        /*SE LEERAN LOS DATOS DEL ARCHIVO QUE SE LE PASE. OBVIAMENTE ESTOS SE PASARAN A UNAS VARIABLES PARA
            PODER LEERLAS, AL TENER LOS DATOS, ESTOS SE COMPARARAN, SOLO EL PROMEDIO Y LOS QUE CUMPLAN 
            SE ESCRIBIRAN EN EL ARCHIVO COPIA*/
        try {
            //ESTE WHILE SE ASEGURA QUE ESTEN DATOS EN EL ARCHIVO (QUE NO ESTE VACIO VAYA)
            while (dis.available() != 0) {
                numControl = dis.readUTF();
                nombre = dis.readUTF();
                aPat = dis.readUTF();
                aMat = dis.readUTF();
                promedio = dis.readDouble();
                carrera = dis.readInt();
                //ESTE IF SEPARARA A LOS ALUMNOS DEL RESTO DE LOS INUTILES
                //dos.writeDouble(promedio);
                
                if (promedio >= 8.5) {
                    //SI SE CUMPLE, SE CREEARA UN ARCHIVO LLAMADO COPIA DONDE SE ALMACENARAN A LOS ELEGIDOS XD
                    dos.writeUTF(numControl);
                    dos.writeUTF(nombre);
                    dos.writeUTF(aPat);
                    dos.writeUTF(aMat);
                    dos.writeDouble(promedio);
                    dos.writeInt(carrera);
                    
                    //IMPRIME A LOS ELEGIDOS
                    /*
                        System.out.println("Num. de Control: " + numControl);
                        System.out.println("Nombre: " + nombre
                        + "Apellido Paterno: " + aPat +
                        "Apellido Materno: " + aMat);
                        System.out.println("Promedio " + promedio);
                        System.out.println("Codigo de Carrera: " + carrera);
                        System.out.println(promedio);
                     */
                }

            }

        } catch (Exception e) {
            System.out.println("Error en la lectura de los datos");
        }

    }

    public void carrera(String nomAr1, String nomAr2, String nomAr3) throws Exception {
        /*VARIABLES QUE ALMACENARAN LOS DATOS DE LOS ARCHIVOS
         */
        String numControl = "", aPat = "", aMat = "", nombre = "";
        double promedio = 0;
        int carrera = 0;

        String numControl2 = "", aPat2 = "", aMat2 = "", nombre2 = "";
        double promedio2 = 0;
        int carrera2 = 0;

        
        //CREACION DEL FLUJO DE ENTRADA Y SALIDA
        DataOutputStream DOS = null; //SALIDA ESCRITURA
        DataInputStream DIS = null;   //ENTRADA LECTURA ARCHIVO 1
        DataInputStream DIS2 = null;  //ENTRADA LECTURA ARCHIVO 2

        try {
            //INICIALIZACION DE FLUJOS DE ENTRADA Y SALIDA
            DIS = new DataInputStream(new FileInputStream(nomAr1));
            DIS2 = new DataInputStream(new FileInputStream(nomAr2));
            DOS = new DataOutputStream(new FileOutputStream(nomAr3, false));

        } catch (IOException e) {
            System.out.println("Error en la creacion o apertura de archivos");
        }

        try {
            if (DIS.available() != 0 && DIS2.available() != 0) {
                numControl = DIS.readUTF();
                nombre = DIS.readUTF();
                aPat = DIS.readUTF();
                aMat = DIS.readUTF();
                promedio = DIS.readDouble();
                carrera = DIS.readInt();
                
                //LECTURA DEL SEGUNDO ARCHIVO
                numControl2 = DIS2.readUTF();
                nombre2 = DIS2.readUTF();
                aPat2 = DIS2.readUTF();
                aMat2 = DIS2.readUTF();
                promedio2 = DIS2.readDouble();
                carrera2 = DIS2.readInt();
                
                do {
                    /*Ciclo Do-While que permitira leer los datos de los archivos mientras los 2 tengan algo escrito*/
                    //LECTURA DEL PRIMER ARCHIVO

                    //SI EL PROMEDIO DEL PRIMER ARCHIVO ES MENOR QUE DE EL SEGUNDO ARCHIVO
                    //SE ESCRIBE EN EL >>NUEVO<< ARCHIVO LOS DATOS DEL ALUMNO DEL PRIMERO PROMEDIO
                    try {
                        
                        if (promedio < promedio2) {
                         
                            DOS.writeUTF(numControl);
                            DOS.writeUTF(nombre);
                            DOS.writeUTF(aPat);
                            DOS.writeUTF(aMat);
                            DOS.writeDouble(promedio);
                            DOS.writeInt(carrera);

                            numControl = DIS.readUTF();
                            nombre = DIS.readUTF();
                            aPat = DIS.readUTF();
                            aMat = DIS.readUTF();
                            promedio = DIS.readDouble();
                            carrera = DIS.readInt();
                            
                        } else {// EN CASO SE SER CONTRARIO, QUIERE DECIR QUE EL PROMEDIO 2 ES MENOR, POR LO TANTO SE 
                            // ESCRIBEN LOS DATOS DEL ALUMNO DEL SEGUNDO ARCHIVO
                            
                            DOS.writeUTF(numControl2);
                            DOS.writeUTF(nombre2);
                            DOS.writeUTF(aPat2);
                            DOS.writeUTF(aMat2);
                            DOS.writeDouble(promedio2);
                            DOS.writeInt(carrera2);
                            
                             //LECTURA DEL SEGUNDO ARCHIVO
                            numControl2 = DIS2.readUTF();
                            nombre2 = DIS2.readUTF();
                            aPat2 = DIS2.readUTF();
                            aMat2 = DIS2.readUTF();
                            promedio2 = DIS2.readDouble();
                            carrera2 = DIS2.readInt();
                            
                        }
                    } catch (IOException e) {
                        System.out.println("Error en la lectura del archivo");
                    }

                } while (DIS.available() != 0 && DIS2.available() != 0);

            }
            
            
            // IMPRIMIR ARCHIVOS
            if(DIS.available()==0){
                if(promedio<=promedio2){
                    
                            DOS.writeUTF(numControl);
                            DOS.writeUTF(nombre);
                            DOS.writeUTF(aPat);
                            DOS.writeUTF(aMat);
                            DOS.writeDouble(promedio);
                            DOS.writeInt(carrera);  
                            
                            
                            DOS.writeUTF(numControl2);
                            DOS.writeUTF(nombre2);
                            DOS.writeUTF(aPat2);
                            DOS.writeUTF(aMat2);
                            DOS.writeDouble(promedio2);
                            DOS.writeInt(carrera2);
                            
                while(DIS2.available()!=0){
                    
                    numControl2 = DIS2.readUTF();
                            nombre2 = DIS2.readUTF();
                            aPat2 = DIS2.readUTF();
                            aMat2 = DIS2.readUTF();
                            promedio2 = DIS2.readDouble();
                            carrera2 = DIS2.readInt();
                            
                            DOS.writeUTF(numControl2);
                            DOS.writeUTF(nombre2);
                            DOS.writeUTF(aPat2);
                            DOS.writeUTF(aMat2);
                            DOS.writeDouble(promedio2);
                            DOS.writeInt(carrera2);
                    
                    
                }
                }
            }else if(DIS2.available()==0){
                if(promedio<=promedio2){
                   
                            DOS.writeUTF(numControl2);
                            DOS.writeUTF(nombre2);
                            DOS.writeUTF(aPat2);
                            DOS.writeUTF(aMat2);
                            DOS.writeDouble(promedio2);
                            DOS.writeInt(carrera2);  
                            
                            
                            DOS.writeUTF(numControl);
                            DOS.writeUTF(nombre);
                            DOS.writeUTF(aPat);
                            DOS.writeUTF(aMat);
                            DOS.writeDouble(promedio);
                            DOS.writeInt(carrera);
                            
                while(DIS.available()!=0){
                    
                    numControl = DIS.readUTF();
                            nombre = DIS.readUTF();
                            aPat = DIS.readUTF();
                            aMat = DIS.readUTF();
                            promedio = DIS.readDouble();
                            carrera = DIS.readInt();
                            
                            DOS.writeUTF(numControl);
                            DOS.writeUTF(nombre);
                            DOS.writeUTF(aPat);
                            DOS.writeUTF(aMat);
                            DOS.writeDouble(promedio);
                            DOS.writeInt(carrera);
                    
                    
                }
                }
            }
            
            
            
            
            
            
            
                System.out.println(promedio);
        } catch (IOException e) {
            System.out.println("Error en la apertura del archivo");
        }

    }
                
                

    public void separar(String origen, String nomTec)throws Exception{
        
        DataInputStream dis = null;
        
        DataOutputStream dos2=null;
        DataOutputStream dos =null;
        
        try{
            dis= new DataInputStream(new FileInputStream(origen));
            dos = new DataOutputStream(new FileOutputStream(nomTec,false));
            dos2 = new DataOutputStream(new FileOutputStream("Externos",false));
            
            
        }catch(FileNotFoundException e){
            System.out.println("No se encontro el archivo");
        }
        
        
        //DATOS
        String numControl="", aPat="", aMat="", nombre="";
        double promedio= 0.0;
        int carrera=0;
        
        try{
        while(dis.available()!=0){
            
            numControl=dis.readUTF();
            nombre=dis.readUTF();
            aPat=dis.readUTF();
            aMat=dis.readUTF();
            promedio=dis.readDouble();
            carrera=dis.readInt();
            
            String parametro=numControl.substring(2, 4); //empieza en cero y el limite es 1+ el que se quiere
            if(parametro.equals("28")){
                
                dos.writeUTF(numControl);
                dos.writeUTF(nombre);
                dos.writeUTF(aPat);
                dos.writeUTF(aMat);
                dos.writeDouble(promedio);
                dos.writeInt(carrera);
                
            }else{
                dos2.writeUTF(numControl);
                dos2.writeUTF(nombre);
                dos2.writeUTF(aPat);
                dos2.writeUTF(aMat);
                dos2.writeDouble(promedio);
                dos2.writeInt(carrera);
            }
            
            
        }
        
        }
        catch(IOException e){
            System.out.println("Error en la lectura");
        }
        
        
        
    }
}
