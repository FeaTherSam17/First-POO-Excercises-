/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmpleadoMain;
//Cambios hechos el 04/05/2023 antes de la clase

/**
 *
 * @author Polly
 */
import PackException.CadenaNoValidaException;//listo
import PackException.NumeroNoValidoException;
import PackException.EntradaNoValidaException;
import PackException.IMSSInvalidoException;//listo
import static java.lang.Character.isDigit;

import packProyecto.*;
import java.util.Scanner;
import static packProyecto.Aumento.ANYO;
import static packProyecto.Aumento.DIA;
import static packProyecto.Aumento.MES;

public class EmpleadoMain {

    //*******METODOS*******
    //public static void capturaEmpH()
    public static void desplegarNom(int opcion, Empleado emp[], int Dia, int Mes, int Anyo) {
        //Se utiliza un ciclo para recorrer todo el arreglo y mostrar los objetos deseados
        //es emp[i] ya que es un arreglo
        for (int i = 0; i < emp.length && emp[i] != null; i++) {
            // se crea un objeto temporal ya que el objeto empleado no tiene los metodos para calcular los aumentos
            if (emp[i] instanceof EmpleadoAsalariadoComision && opcion == 3) {
                System.out.println("******* DESPLEGANDO NOMINA *******");
                EmpleadoAsalariadoComision objT3 = (EmpleadoAsalariadoComision) emp[i];

                System.out.println(emp[i].getNombre() + " " + emp[i].getapellidoP() + " " + emp[i].getapellidoM());
                System.out.println("No.IMSS: " + emp[i].getIMSS());
                System.out.println("Ventas Brutas: " + objT3.getventasBrutas());
                System.out.println("Salario base " + objT3.getsalarioBase());
                System.out.println("Tarifa de comision : " + objT3.gettarifaComision());
                objT3.Aumento(Dia, Mes, Anyo);
                //aumento = emp[i].setNomina(aumento);
                System.out.println("Nomina: " + objT3.getNomina());
                System.out.println("La fecha actual es: " + DIA + "/" + MES + "/" + ANYO);

            } else if (emp[i] instanceof EmpleadoComision && emp[i] instanceof EmpleadoAsalariadoComision && opcion == 2) {

            } else if (emp[i] instanceof EmpleadoComision && opcion == 2) {
                System.out.println("******* DESPLEGANDO NOMINA *******");
                EmpleadoComision objT2 = (EmpleadoComision) emp[i];
                System.out.println(emp[i].getNombre() + " " + emp[i].getapellidoP() + " " + emp[i].getapellidoM());
                System.out.println("No.IMSS: " + emp[i].getIMSS());
                System.out.println("Ventas brutas: " + objT2.getventasBrutas());
                System.out.println("Tarifa de comision: " + objT2.gettarifaComision());
                objT2.Aumento(Dia, Mes, Anyo);
                System.out.println("Nomina: " + emp[i].getNomina());
                System.out.println("La fecha actual es: " + DIA + "/" + MES + "/" + ANYO);

            } else if (emp[i] instanceof EmpleadoPorHora && opcion == 1) {
                System.out.println("******* DESPLEGANDO NOMINA *******");
                EmpleadoPorHora objT = (EmpleadoPorHora) emp[i];
                System.out.println(emp[i].getNombre() + " " + emp[i].getapellidoP() + " " + emp[i].getapellidoM());
                System.out.println("No.IMSS: " + emp[i].getIMSS());
                objT.Aumento(Dia, Mes, Anyo);
                System.out.println("Nomina: " + objT.getNomina());
                System.out.println("Sueldo por hora: " + objT.getasueldoH());
                System.out.println("Horas trabajadas: " + objT.gethoraSemn());
                System.out.println("La fecha actual es: " + DIA + "/" + MES + "/" + ANYO);

            }
        }
    }

    public static void desplegarEmpleados(Empleado A[], int opcion) {
        //No devolvera nada, solo estara mostrando los empleados que cumplan con lo solicitado
        //Se usara un ciclo para recorrer el arreglo en busqueda de los que coincidan con lo solicitado
        for (int i = 0; i < A.length && A[i] != null; i++) {
            if (A[i] instanceof EmpleadoAsalariadoComision && opcion == 3) {
                //No es necesario crear un objeto temporal ya que lo que se mostrara seran atributos en comun
                System.out.println("******* DESPLEGANDO EMPLEADOS *******");
                System.out.println("Empleado Asalariado Por Comision ");
                EmpleadoAsalariadoComision objT3 = (EmpleadoAsalariadoComision) A[i];
                System.out.println(A[i].getNombre() + " " + A[i].getapellidoP() + " " + A[i].getapellidoM());
                System.out.println("No.IMSS: " + A[i].getIMSS());
                System.out.println("Ventas Brutas: " + objT3.getventasBrutas());
                System.out.println("Salario base " + objT3.getsalarioBase());
                System.out.println("Tarifa de comision : " + objT3.gettarifaComision());

            } else if (A[i] instanceof EmpleadoComision && A[i] instanceof EmpleadoAsalariadoComision && opcion == 2) {

            } else if (A[i] instanceof EmpleadoComision && opcion == 2) {
                System.out.println("******* DESPLEGANDO EMPLEADOS *******");
                System.out.println("Empleado Por Comision ");
                System.out.println(A[i].getNombre() + " " + A[i].getapellidoM() + " " + A[i].getapellidoP());
                System.out.println("No. IMSS: " + A[i].getIMSS());
                EmpleadoComision objT2 = (EmpleadoComision) A[i];
                System.out.println("Ventas brutas: " + objT2.getventasBrutas());
                System.out.println("Tarifa de comision: " + objT2.gettarifaComision());

            } else if (A[i] instanceof EmpleadoPorHora && opcion == 1) {
                System.out.println("******* DESPLEGANDO EMPLEADOS *******");
                System.out.println("Empleado Por Hora ");
                System.out.println(A[i].getNombre() + " " + A[i].getapellidoM() + " " + A[i].getapellidoP());
                System.out.println("No. IMSS: " + A[i].getIMSS());
                EmpleadoPorHora objT = (EmpleadoPorHora) A[i];
                System.out.println("Sueldo por hora: " + objT.getasueldoH());
                System.out.println("Horas trabajadas: " + objT.gethoraSemn());

            }

        }
    }

    // Este metodo de busqueda retornara la posicion del ojeto a buscar
    public static int busqueda(Empleado A[], String IMSS) {
        // Se usa un ciclo para recorrer el arreglo u comparar con instanceof
        for (int i = 0; i < A.length && A[i] != null; i++) {
            if (A[i].getIMSS().equals(IMSS)) {
                /* System.out.println(A[i].getIMSS());
                System.out.println(" " + A[i].getNombre());
                System.out.println(" " + A[i].getapellidoP());
                System.out.println(" " + A[i].getapellidoM()); */
                return i;

            }
        }
        return -1;
    }

    //Metodo para desplegar un solo empleado
    //Este usa lo que retorna de la busqueda
    public static void desplegarEmpleado(int indice, Empleado A[]) {

        if (A[indice] instanceof EmpleadoAsalariadoComision) {
            //No es necesario crear un objeto temporal ya que lo que se mostrara seran atributos en comun
            System.out.println("******* DESPLEGANDO EMPLEADO *******");
            System.out.println("Empleado Asalariado Por Comision ");
            System.out.println(A[indice].getNombre() + " " + A[indice].getapellidoM() + " " + A[indice].getapellidoP());
            System.out.println("No. IMSS: " + A[indice].getIMSS());
            EmpleadoAsalariadoComision objT3 = (EmpleadoAsalariadoComision) A[indice];
            System.out.println("Ventas Brutas: " + objT3.getventasBrutas());
            System.out.println("Salario base " + objT3.getsalarioBase());
            System.out.println("Tarifa de comision : " + objT3.gettarifaComision());

        } else if (A[indice] instanceof EmpleadoComision && A[indice] instanceof EmpleadoAsalariadoComision) {

        } else if (A[indice] instanceof EmpleadoComision) {
            System.out.println("******* DESPLEGANDO EMPLEADO *******");
            System.out.println("Empleado Por Comision ");
            System.out.println(A[indice].getNombre() + " " + A[indice].getapellidoM() + " " + A[indice].getapellidoP());
            System.out.println("No. IMSS: " + A[indice].getIMSS());
            EmpleadoComision objT2 = (EmpleadoComision) A[indice];
            System.out.println("Ventas brutas: " + objT2.getventasBrutas());
            System.out.println("Tarifa de comision: " + objT2.gettarifaComision());

        } else if (A[indice] instanceof EmpleadoPorHora) {
            System.out.println("******* DESPLEGANDO EMPLEADO *******");
            System.out.println("Empleado Por Hora ");
            System.out.println(A[indice].getNombre() + " " + A[indice].getapellidoM() + " " + A[indice].getapellidoP());
            System.out.println("No. IMSS: " + A[indice].getIMSS());
            EmpleadoPorHora objT = (EmpleadoPorHora) A[indice];
            System.out.println("Sueldo por hora: " + objT.getasueldoH());
            System.out.println("Horas trabajadas: " + objT.gethoraSemn());

        }

    }

    public static void recorrido(int indice, Empleado A[]) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] == null) {
                A[i] = A[i + 1];
                A[i + 1] = null;
            }
        }

    }

    //METODO DE ELIMINACION
    /*Este metodo retornara un objeto de tipo empleado que mostrara el empleado eliminado
    como se hizo en el proyecto de las Figuras*/
    public static Empleado eliminar(int indice, Empleado A[]) {
        Empleado obt = A[indice];//Se crea un objeto temporal
        A[indice] = null; // se elimina el objeto del arreglo
        recorrido(indice, A);//se recorren los objetos
        return obt;//se retorna el OBJETO temporal, para que en el main podamos obtener sus datos
    }

    //METODO VALIDAR IMSS
    public static boolean ValidarIMSS(String imss) {
        char arregloImss[]=imss.toCharArray();
        int cont=0;
        for (int i = 0; i < imss.length(); i++) {
            if((Character.isDigit(arregloImss[i])==true)){
             cont++;   
            }
        }
        if(cont==11){
            return true;
        }else{
            return false;
        }
        
    }

    //CADENA NO VALIDA
    public static boolean ValidarCadena(String cad) {
        int cont = 0;
        char arreglo[] = cad.toCharArray();//se convierte la cadena a arreglo de caracteres
        for (int i = 0; i < cad.length(); i++) {
            

            if ((Character.isLetter(arreglo[i]) == true) || (arreglo[i] == ' ')) {
                cont++;
            }
        }
        if (cont == cad.length()) {
            return true;
        } else {
            return false;
        }

    }

    //*******FIN DE LOS METODOS*******
    public static void main(String[] args) throws NumeroNoValidoException, EntradaNoValidaException, CadenaNoValidaException,IMSSInvalidoException {
        int op = 0;
        /*la variable i se declara e inicializa antes del menu, ya que si se pusiera en cada caso
        estaria sobreescribiendo los datos y por lo tanto jamas avanzaria si se quiere alamcenar
        un tipo diferente de dato por que cada caso tendria i=0*/
        int i = 0;

        Empleado ar[] = new Empleado[30];
        Scanner leer = new Scanner(System.in);
        //*******PRUEBA*******
        EmpleadoPorHora empleado1 = new EmpleadoPorHora("Erika", "Addams", "Shelby", "E54kAddS7", 7000, 40);
        EmpleadoAsalariadoComision empleado2 = new EmpleadoAsalariadoComision("Erika", "Addams", "Shelby", "1718", 500000, 8, 20000);
        //  System.out.println("sueldo"+empleado2.ingresos());
        System.out.println("Nomina" + empleado2.getNomina());

        System.out.println("El empleado " + empleado1.getNombre());
        // System.out.println("Tiene un sueldo de: " + empleado1.ingresos());
        System.out.println("Nomina");
        //**************
        int hola = 7;
        System.out.println(isDigit(hola));

        do {
            boolean error = false;
            do {
                System.out.println("");
                System.out.println("Ingrese un numero >w<");
                System.out.println("***************************");
                System.out.println("*   CONTROL DE LA NOMINA  *");
                System.out.println("***************************");
                System.out.println("1.- Agregar Empleado ");
                System.out.println("2.- Desplegar Nómina de Empleados");// de cierto tipo…solicitar fecha de proceso…+"(Nombre completo, IMSS, ingresos) 
                System.out.println("3.- Desplegar empleados de un tipo ");
                System.out.println("4.- Consultar un empleado");
                System.out.println("5.- Dar de baja un empleado ");
                System.out.println("6.- Salir");
                System.out.println("");

                try {
                    //leer.nextInt();
                    op = leer.nextInt();
                    //if()throw new EntradaNoValidaException("La entrada es incorrecta intentelo de nuevo imbecil");
                    error = false;
                    //}catch(EntradaNoValidaException e){
                } catch (Exception e) {

                    System.out.println("La entrada es incorrecta mejor aprende a leer ._.");
                    leer.next();
                    error = true;
                }

                //}
            } while (error == true);

            switch (op) {
                case 1:
                    boolean error2 = false;
                    do {
                        System.out.println("Que tipo de empleado desea agregar? :)");
                        System.out.println("1- Empleado por hora");
                        System.out.println("2- Empleado por comision");
                        System.out.println("3- Empleado asalariado por comision");
                        try {

                            op = leer.nextInt();

                            error2 = false;

                        } catch (Exception e) {

                            System.out.println("Entrada no valida ._.");
                            leer.next();
                            error2 = true;
                        }
                    } while (error2 == true);

                    switch (op) {
                        case 1:
                            //Captura de datos del empleado por hora ****puede hacerse un metodo para esto...***
                            boolean comprobar = true;//Variable que valida la cadena
                            System.out.println("Ingrese los datos");
                            String nombre;
                            do {//Ciclo que se repetira hasta que el nombre sea correcto
                                System.out.println("Nombre");
                                nombre = leer.next();//Primero se lee la cadena y se usa una excepcion personalizada

                                try {//excepcion
                                    comprobar = ValidarCadena(nombre);//Validara el nombre y en caso de ser falso se producira una excepcion
                                    error = false;//hace que el error se false (CLAVE PARA LA CONDICION DEL WHILE)
                                    if (comprobar == false) {
                                        throw new CadenaNoValidaException("Nombre no valido");//Si no se valida la cadena se crea una excepcion
                                    }
                                    System.out.println(comprobar);                  //>>>>>>>PRUEBA<<<<<<<
                                } catch (CadenaNoValidaException e) {
                                    System.out.println(e.getMessage());
                                    error = true;//Se hace que la variable error sea falsa para cumplir la condicion del while y hacer que vuelva a preguntar
                                }
                            } while (error == true);

                            
                            String apellidoP;
                            do{
                            System.out.println("Apellido Paterno");
                            apellidoP = leer.next();
                            try {
                                comprobar = ValidarCadena(apellidoP);
                                error=false;
                                if (comprobar == false) {
                                    throw new CadenaNoValidaException("Cadena no valida");
                                }
                                System.out.println(comprobar);
                            } catch (CadenaNoValidaException e) {
                                System.out.println(e.getMessage());
                                error=true;
                            }
                            }while(error==true);
                            
                            
                            String apellidoM;
                            do{
                            System.out.println("Apellido Materno");
                            apellidoM = leer.next();
                            try {
                                comprobar=ValidarCadena(apellidoM);
                                error=false;
                                if (comprobar == false) {
                                    throw new CadenaNoValidaException("Cadena no valida");
                                }
                                System.out.println(comprobar);
                            } catch (CadenaNoValidaException e) {
                                System.out.println(e.getMessage());
                                error=true;
                            }
                            }while(error==true);
                            
                            
                            String IMSS=null;
                            do{
                                System.out.println("No. IMSS");
                                IMSS=leer.next();
                                try{
                                comprobar=ValidarIMSS(IMSS);
                                error=false;
                                    System.out.println(comprobar);
                                if(comprobar==false)throw new IMSSInvalidoException("El IMSS es invalido");
                                }catch(IMSSInvalidoException e){
                                    System.out.println(e.getMessage());
                                    error=true;
                                }
                            }while(error==true);
                            

                            //letras
                            System.out.println("Ingrese el Sueldo por Hora");
                            double sueldoH;
                            double horaSem;
                            try {
                                sueldoH = leer.nextDouble();
                                System.out.println("Ingrese las horas trabajadas");
                                horaSem = leer.nextDouble();

                                if ((sueldoH <= 0) || (horaSem < 0)) {
                                    throw new NumeroNoValidoException("El sueldo no puede ser menor o igual que cero");
                                }
                                ar[i] = new EmpleadoPorHora(nombre, apellidoP, apellidoM, IMSS, sueldoH, horaSem);
                                ar[i].ingresos();// Metodo que calcula los ingresos
                                i++;
                            } catch (NumeroNoValidoException e) {
                                System.out.println(e.getMessage());
                            }

                            break;
                        case 2:
                            System.out.println("Ingrese los datos");
                            //String nombre;
                            do {//Ciclo que se repetira hasta que el nombre sea correcto
                                System.out.println("Nombre");
                                nombre = leer.next();//Primero se lee la cadena y se usa una excepcion personalizada

                                try {//excepcion
                                    comprobar = ValidarCadena(nombre);//Validara el nombre y en caso de ser falso se producira una excepcion
                                    error = false;//hace que el error se false (CLAVE PARA LA CONDICION DEL WHILE)
                                    if (comprobar == false) {
                                        throw new CadenaNoValidaException("Nombre no valido");//Si no se valida la cadena se crea una excepcion
                                    }
                                    System.out.println(comprobar);                  //>>>>>>>PRUEBA<<<<<<<
                                } catch (CadenaNoValidaException e) {
                                    System.out.println(e.getMessage());
                                    error = true;//Se hace que la variable error sea falsa para cumplir la condicion del while y hacer que vuelva a preguntar
                                }
                            } while (error == true);
                            
                            
                             do{
                            System.out.println("Apellido Paterno");
                            apellidoP = leer.next();
                            try {
                                comprobar = ValidarCadena(apellidoP);
                                error=false;
                                if (comprobar == false) {
                                    throw new CadenaNoValidaException("Cadena no valida");
                                }
                                System.out.println(comprobar);
                            } catch (CadenaNoValidaException e) {
                                System.out.println(e.getMessage());
                                error=true;
                            }
                            }while(error==true);
                             
                             
                            do{
                            System.out.println("Apellido Materno");
                            apellidoM = leer.next();
                            try {
                                comprobar=ValidarCadena(apellidoM);
                                error=false;
                                if (comprobar == false) {
                                    throw new CadenaNoValidaException("Cadena no valida");
                                }
                                System.out.println(comprobar);
                            } catch (CadenaNoValidaException e) {
                                System.out.println(e.getMessage());
                                error=true;
                            }
                            }while(error==true);
                            
                            
                            do{
                                System.out.println("No. IMSS");
                                IMSS=leer.next();
                                try{
                                comprobar=ValidarIMSS(IMSS);
                                error=false;
                                    System.out.println(comprobar);
                                if(comprobar==false)throw new IMSSInvalidoException("El IMSS es invalido");
                                }catch(IMSSInvalidoException e){
                                    System.out.println(e.getMessage());
                                    error=true;
                                }
                            }while(error==true);
                            
                            System.out.println("Ingrese las ventas Brutas");
                            double ventasBrutas = leer.nextDouble();
                            System.out.println("Ingrese la tarifa de comision");
                            double tarifaComision = leer.nextDouble();
                            ar[i] = new EmpleadoComision(nombre, apellidoP, apellidoM, IMSS, ventasBrutas, tarifaComision);
                            i++;
                            break;
                        case 3:
                            System.out.println("Ingrese los datos");
                            do {//Ciclo que se repetira hasta que el nombre sea correcto
                                System.out.println("Nombre");
                                nombre = leer.next();//Primero se lee la cadena y se usa una excepcion personalizada

                                try {//excepcion
                                    comprobar = ValidarCadena(nombre);//Validara el nombre y en caso de ser falso se producira una excepcion
                                    error = false;//hace que el error se false (CLAVE PARA LA CONDICION DEL WHILE)
                                    if (comprobar == false) {
                                        throw new CadenaNoValidaException("Nombre no valido");//Si no se valida la cadena se crea una excepcion
                                    }
                                    System.out.println(comprobar);                  //>>>>>>>PRUEBA<<<<<<<
                                } catch (CadenaNoValidaException e) {
                                    System.out.println(e.getMessage());
                                    error = true;//Se hace que la variable error sea falsa para cumplir la condicion del while y hacer que vuelva a preguntar
                                }
                            } while (error == true);
                            
                            
                             do{
                            System.out.println("Apellido Paterno");
                            apellidoP = leer.next();
                            try {
                                comprobar = ValidarCadena(apellidoP);
                                error=false;
                                if (comprobar == false) {
                                    throw new CadenaNoValidaException("Cadena no valida");
                                }
                                System.out.println(comprobar);
                            } catch (CadenaNoValidaException e) {
                                System.out.println(e.getMessage());
                                error=true;
                            }
                            }while(error==true);
                             
                             
                            do{
                            System.out.println("Apellido Materno");
                            apellidoM = leer.next();
                            try {
                                comprobar=ValidarCadena(apellidoM);
                                error=false;
                                if (comprobar == false) {
                                    throw new CadenaNoValidaException("Cadena no valida");
                                }
                                System.out.println(comprobar);
                            } catch (CadenaNoValidaException e) {
                                System.out.println(e.getMessage());
                                error=true;
                            }
                            }while(error==true);
                            
                            do{
                                System.out.println("No. IMSS");
                                IMSS=leer.next();
                                try{
                                comprobar=ValidarIMSS(IMSS);
                                error=false;
                                    System.out.println(comprobar);
                                if(comprobar==false)throw new IMSSInvalidoException("El IMSS es invalido");
                                }catch(IMSSInvalidoException e){
                                    System.out.println(e.getMessage());
                                    error=true;
                                }
                            }while(error==true);
                            
                            System.out.println("Ingrese las ventas Brutas");
                            ventasBrutas = leer.nextDouble();
                            System.out.println("Ingrese la tarifa de comision");
                            tarifaComision = leer.nextDouble();
                            System.out.println("Ingrese el salario base");
                            double salarioBase = leer.nextDouble();
                            ar[i] = new EmpleadoAsalariadoComision(nombre, apellidoP, apellidoM, IMSS, ventasBrutas, tarifaComision, salarioBase);
                            ar[i].ingresos(); // Metodo que calcula los ingresos
                            i++;
                            break;
                    }
                    break;
                //Sueldo por hora
                case 2:
                    boolean error3 = false;
                    do {

                        System.out.println("De que tipo de empleado desea desplegar la nomina? :)");
                        System.out.println("1- Empleado por hora");
                        System.out.println("2- Empleado por comision");
                        System.out.println("3- Empleado asalariado por comision");
                        try {
                            op = leer.nextInt();
                        } catch (Exception e) {
                            System.out.println("Tu no entiendes imbecil estupido");
                            error3 = true;
                            leer.next();
                        }
                    } while (error3 == true);

                    System.out.println("Ingrese la fecha");
                    System.out.println("Dia");
                    int Dia = leer.nextInt();
                    System.out.println("Mes");
                    int Mes = leer.nextInt();
                    System.out.println("Anyo");
                    int Anyo = leer.nextInt();

                    desplegarNom(op, ar, Dia, Mes, Anyo);
                    break;

                case 3:
                    boolean error4;
                    do {
                        System.out.println("Que tipo de empleado desea desplegar? ");
                        System.out.println("1- Empleado por hora");
                        System.out.println("2- Empleado por comision");
                        System.out.println("3- Empleado asalariado por comision");
                        try {
                            op = leer.nextInt();
                            error4 = false;
                        } catch (Exception e) {
                            System.out.println("Entrada no valida");
                            error4 = true;
                            leer.next();
                        }
                        desplegarEmpleados(ar, op);
                    } while (error == true);
                    break;

                case 4://*******BUSQUEDA*******
                    //Dado que el numero del IMSS es unico, solamente se pedira ese dato para encontrar el empleado
                    System.out.println("Ingrese el numero del IMSS");
                    String IMSS = leer.next();
                    //Se implementara un metodo de busqueda para encontrar al empleado
                    int busqueda = busqueda(ar, IMSS);
                    if (busqueda != -1) {
                        desplegarEmpleado(busqueda, ar);
                        System.out.println("Posicion: " + busqueda);
                    } else {
                        System.out.println("El empleado No existe");
                    }
                    break;

                case 5:
                    //Dado que el numero del IMSS es unico, solamente se pedira ese dato para encontrar el empleado
                    System.out.println("Ingrese el numero de IMSS ");
                    IMSS = leer.next();
                    int indice = busqueda(ar, IMSS);
                    if (indice != -1) {
                        //Se hizo que el metodo de eliminacion retorne un empleado para que se pueda usar para obtener los datos
                        //en el main para despues eliminarlo
                        Empleado objTemp = eliminar(indice, ar);
                        System.out.println();
                        System.out.println(objTemp.getNombre() + " " + objTemp.getapellidoP() + " " + objTemp.getapellidoM());
                        System.out.println("No. IMSS " + objTemp.getIMSS());
                        System.out.println("Ha sido eliminado");
                        objTemp = null;
                    } else {
                        System.out.println("El empleado no existe");
                    }
                    eliminar(indice, ar);
                    break;
            }

        } while (op != 6);

    }
}
