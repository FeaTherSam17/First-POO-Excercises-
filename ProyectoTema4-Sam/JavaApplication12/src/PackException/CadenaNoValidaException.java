/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackException;

/**
 *
 * @author Usuario
 */
public class CadenaNoValidaException extends Exception{
    
    public CadenaNoValidaException(){
        
    }
    
    public CadenaNoValidaException (String mensaje){
        super(mensaje);
    }
}
