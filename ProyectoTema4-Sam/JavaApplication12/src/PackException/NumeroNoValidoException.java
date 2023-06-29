/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackException;

/**
 *
 * @author Usuario
 */
public class NumeroNoValidoException extends Exception {
    public NumeroNoValidoException(){
        
    }
    
    public NumeroNoValidoException(String mensaje){
        super(mensaje);
    }
}
