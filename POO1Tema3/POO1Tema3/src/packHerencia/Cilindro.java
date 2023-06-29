
package packHerencia;

/**
 *
 * @author Usuario
 */
//"extends Circulo" hereda los aributos de la clase Circulo a Cilindro
public class Cilindro extends Circulo {
     protected double altura;
     //Constructor
     public Cilindro(double radio, String nombre, double altura){
         super (nombre,radio);
         this.altura=altura;
                 
     }
     
    public double getradio(){
        return radio;
    }
    public void setradio(double radio){
        this.radio = radio;       
    }
     
     public void setaltura(double altura){
        this.altura=altura;

     }
     public double getaltura(){
       return altura;
     }
     
     // como en la clase circulo existe un metodo llamado area
     // el medoto area del circulo se oculta
     public double area(){
         return 2*Math.PI*radio*(radio+altura);
     }
     
     //"super".area llama el metodo de la clase padre "Circulo"
     // o clase anterior
    public double volumen(){
        return super.areaFig()*altura;
    }
}
