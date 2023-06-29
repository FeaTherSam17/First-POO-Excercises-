
package packHerencia;
import packAbstract.Figura;


public class Circulo extends Figura {
    //atributos
    protected double radio;
   // protected String nombre;
    
    public Circulo(String nombre, double radio){
        super (nombre);
        this.radio = radio;

    }
    
    public double getradio(){
        return radio;
    }
    public void setradio(double radio){
        this.radio = radio;       
    }
    
    
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;       
    }
    
    
    // NO tiene parametro porque el valor es de la propia clase
    public double areaFig(){
        return Math.PI*radio*radio;
    }

}
