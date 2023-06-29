
package packHerencia;

/**
 *
 * @author Usuario
 */
public class Cono extends Cilindro {
    private double generatriz;
    private String nombre;
    
    public Cono(double radio,String nombre, double altura,double generatriz){
        super(radio,nombre,altura);
        this.generatriz= generatriz;
    }
    
    
    public double getradio(){
        return radio;
    }
    public void setradio(double radio){
        this.radio = radio;       
    }
    
    
    
    
    
    public void setgeneratriz(double generatriz){
        this.generatriz=generatriz;
    }
    public double getgeneratiz(){
        return generatriz;
    }
    
    public double areaFig(){
        return Math.PI*radio*(radio+generatriz);
    }
    //solo se puede llamar un metodo de una clase padre, en este caso no se
    //podria llamar un metodo de circulo estando en cono (2 saltos)
    // porque solo llama a los metodos de una clase anterior
    public double volumen(){
        return super.volumen()/3;
    }
    
}
