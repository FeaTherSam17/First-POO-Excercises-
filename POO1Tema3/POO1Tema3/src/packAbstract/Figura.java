
package packAbstract;

/**
 *
 * @author Usuario
 */

public abstract class Figura {
    
    protected String nombre;
    public abstract double areaFig();

    
    public Figura(String nombre){
        this.nombre=nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    
}
