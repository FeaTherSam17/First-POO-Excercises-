/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PackException;

/**
 *
 * @author Usuario
 */
public class IMSSInvalidoException extends Exception {
    //tamanio y numeros
    public IMSSInvalidoException(){
        
    }
    
    public IMSSInvalidoException(String mensaje){
        super(mensaje);
    }
}
