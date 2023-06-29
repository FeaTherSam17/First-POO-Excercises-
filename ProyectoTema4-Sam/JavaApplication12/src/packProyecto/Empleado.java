
package packProyecto;
/**
 *
 * @author Polly
 */
public abstract class Empleado{
    //ATRIBUTOS - TODOS LOS EMPLEADOS TIENEN ESTOS DATOS
    protected String nombre;
    protected String apellidoP;
    protected String apellidoM;
    protected String IMSS;
    protected double nomina;

    
    //METODO CONSTRUCTOR
    public Empleado (String nombre, String apellidoP, String apellidoM, String IMSS){
        this.IMSS=IMSS;
        this.apellidoM=apellidoM;
        this.apellidoP=apellidoP;
        this.nombre=nombre;
    }
    
       //metodos get y set
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setapellidoP(String apellidoP){
        this.apellidoP=apellidoP;
    }
    public String getapellidoP(){
        return apellidoP;
    }
    
    public void setapellidoM(String apellidoM){
        this.apellidoM=apellidoM;
    }
    public String getapellidoM(){
        return apellidoM;
    }
    
    public void setIMSS(String IMSS){
        this.IMSS=IMSS;
    }
    public String getIMSS(){
        return IMSS;
    }
    
    //nomina 
    public void setNomina(double nomina){
        this.nomina=nomina;
    }
    
    public double getNomina(){
        return nomina;
    }
    
    
    //METODO ABSTRACTO PARA CALCULAR LOS INGRESOS
    public abstract void ingresos();
    
}
