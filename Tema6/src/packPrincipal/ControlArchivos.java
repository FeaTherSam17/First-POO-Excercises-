 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packPrincipal;

import PackClase.ArchivoBin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Polly
 */
public class ControlArchivos {

    static BufferedReader read = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, Exception {

        // Samuel Alcantara Fernandez
        
        int op = 0;
        ArchivoBin archivo = new ArchivoBin();

        do {
            System.out.print("\n"
                    + "\n||--------------------Menu de ARCHIVOS------------------------------"
                    + "\n   1.  Capturar Alumno"
                    + "\n   2.  Desplegar codigos de archvo"
                    + "\n   3.  Copiar los alumnos con promedio de 85 en adelante a otro archivo."
                    + "\n   4.  Mezclar dos archivos por carrera."
                    + "\n   5.  leer un archivo origen y se copia a dos archivos los numeros de controlde otro tecnologico"
                    + "\n   quedaran el el archivo llamado Externos y el resto en otro archvo  "
                    + "\nIngresa una opcion... -----}    ");
            //substring
            try{
            op = Integer.parseInt(read.readLine());
            }catch(IOException | NumberFormatException e){
                System.out.println("Error en el dato de entrada");
            }
            switch (op) {
                case 1:
                    try {
                    System.out.println("Ingresa nombre de archivo");
                    String nom = read.readLine();
                    archivo.escritura(nom);
                } catch (Exception e) {
                    System.out.println("!! ERROR de apertura de archivo");
                }

                break;
                case 2:
                    try {
                    System.out.println("Ingresa nombre de archivo");
                    String nom = read.readLine();
                    archivo.lectura(nom);
                } catch (Exception e) {
                    System.out.println("!! ERROR de apertura de archivo");
                }
                    break;
                    
                case 3:
                    try{
                        System.out.println("Ingresa el nombre del archivo original");
                        String nom=read.readLine();
                        System.out.println("Ingresa el nombre del archivo copia");
                        String copia=read.readLine();
                        
                        archivo.copia(nom, copia);
                    }catch(Exception e){
                        System.out.println("Error en la apertura del archivo");
                    }
                    
                    break;
                    
                case 4:
                    try {
                    System.out.println("Ingresa el nombre del primer archivo");
                    String nomAr1 = read.readLine();
                    System.out.println("Ingresa el nombre del segundo archivo");
                    String nomAr2 = read.readLine();
                    System.out.println("Ingresa el nombre del tercer archivo");
                    String nomAr3 = read.readLine();
                    
                    try{
                    archivo.carrera(nomAr1,nomAr2,nomAr3);
                    }catch(Exception e){
                        
                    }
                } catch (IOException e) {
                    System.out.println("!! ERROR de apertura de archivo");
                }

                break;

                
                case 5:
                    try{
                        System.out.println("Ingrese el nombre del archivo origen");
                        String origen = read.readLine();
                        
                        System.out.println("Ingrese el nombre del archivo de alumnos del Tec de Toluca");
                        String tecTol = read.readLine();
                        
                        try{
                        archivo.separar(origen, tecTol);
                        }catch(Exception e){

                        }
                    }catch(IOException e){
                        System.out.println("Dato invalido");
                    }

                    
                    
                    
                default:
                    break;
            }
        } while (op != 9);

    }
}
