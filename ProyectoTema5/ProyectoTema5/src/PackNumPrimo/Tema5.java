package PackNumPrimo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import PackExceptions.NumeroNoValidoException;

/**
 *
 * @author Usuario
 */

//Indicar si un numero es primo
// incicar que numero hay en cierta posiciion de un arreglo
public class Tema5 {

    public static boolean NumPrime(int numero) throws NumeroNoValidoException {
        if (numero <= 0) {
            throw new NumeroNoValidoException("El numero es menor o igual que cero");
        }
        if (numero == 1) {
            return true;
        } else {
            for (int i = 2; i < numero; i++) {

                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }

    }

    //EXCEPCIONES
    //Atrapa la excepcion 
    public static int buscaAR(int i) {
        int A[] = {10, 20, 30, 40};
        try {
            return A[i];
        } catch (IndexOutOfBoundsException e) {
            System.out.println("La poscicion no existe en el arreglo");
            return -1;
        }
    }

    //Lanzar la excepcion
    public static int buscaAR2(int i) throws IndexOutOfBoundsException {
        int A[] = {10, 20, 30, 40};
        return A[i];
    }
    
    public static int CalcularPotencia(int base, int exponente) throws NumeroNoValidoException{
        if((exponente<0)) throw new NumeroNoValidoException("Exponente no valido");
        if(exponente ==0 && base == 0) throw new NumeroNoValidoException("Operacion no valida");
        int resultado=1;
        for(int i=1;i<=exponente ;i++){
            resultado=resultado*base;
        }
        
        return resultado;
    }
    
    
    
    
    

    public static void main(String args[]) throws IOException, IndexOutOfBoundsException {

        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(3 % 2);
        int op = 0;
        do {
            System.out.println("<<<<<<<Menu>>>>>>>");
            System.out.println("1. Indicar si un numero es primo");
            System.out.println("2. Indicar que numero hay en cierta posicion de un arreglo catch");
            System.out.println("3. Indicar que numero hay en cierta posicion de un arreglo throw");
            System.out.println("4. Calcular la potencia de un numero");
            System.out.println("7. Salir");
            try {
                op = Integer.parseInt(BR.readLine());
            } catch (NumberFormatException e) {
                System.out.println(">> ERROR en el dato de entrada");

            }

            switch (op) {
                case 1:
                    boolean err1 = false;
                    do {
                        try {        //TRY
                            System.out.println("Ingresa el numero:");
                            int numero = 0;
                            numero = Integer.parseInt(BR.readLine());
                            boolean res = NumPrime(numero);
                            System.out.println(res);
                            err1 = false;

                        } catch (NumeroNoValidoException e) {          //CATCH
                            System.out.println(e.getMessage());
                            err1 = true;
                        }
                    } while (err1 == true);

                    break;

                case 2:
                    System.out.println("Indica la posicion de arreglo:");
                    int numero = Integer.parseInt(BR.readLine());

                    int arr = buscaAR(numero);
                    if (arr != -1) {
                        System.out.println("El numero es: " + arr);
                    }
                    //System.out.println(arr);
                    break;

                case 3:
                    boolean valido = true;
                    do {
                        System.out.println("Indica la poosicion de arreglo");
                        numero = Integer.parseInt(BR.readLine());
                        try {
                            arr = buscaAR2(numero);
                            System.out.println(arr);
                            valido = true;
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("La posicion del arreglo no existe");
                            valido = false;
                        }
                    } while (valido == false);
                    break;
                    
                case 4:
                    System.out.println("Ingresa la base");
                    int base = Integer.parseInt(BR.readLine());
                    System.out.println("Ingresa el exponente");
                    int exponente = Integer.parseInt(BR.readLine());
                    try{
                    int potencia=CalcularPotencia(base,exponente);
                    System.out.println(potencia);
                    }catch(NumeroNoValidoException e){
                        System.out.println(e.getMessage());
                    }
            }

        } while (op != 7);

    }
}
