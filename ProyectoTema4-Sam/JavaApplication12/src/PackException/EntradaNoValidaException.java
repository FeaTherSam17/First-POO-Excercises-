/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackException;

/**
 *
 * @author Usuario
 */
public class EntradaNoValidaException extends Exception{
    
    public EntradaNoValidaException(){
        
    }
    public EntradaNoValidaException(String mensaje){
        super(mensaje);
    }
}
