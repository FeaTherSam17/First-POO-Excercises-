/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packClases;
import java.util.GregorianCalendar;
import packInterface.InterFecha;

//constructor copiador
public class Alumno extends packAbstract.Persona implements InterFecha{
    //atributos
    private String nombre; //set.Nombre asigna valor; get.NOmbre obtiene el valor
    private int aNac, mNac, dNac;
    private String noControl;
    private int semAct;
    private int cveCar;

    
    public Alumno(){
    }
    
    public Alumno(Alumno ob){
    this.nombre = ob.nombre;
    this.aNac = ob.aNac;
    this.cveCar = ob.aNac;
    this.dNac = ob.dNac;
    this.semAct = ob.semAct;
    this.noControl = ob.noControl;
    
    }
    
    

    
    
    //asigna valor al atributo del objeto
    public void setnombre(String nombre){
        this.nombre = nombre;
        //atributo    parametro
    }
    // Obtiene el valor del objeto
    public String getnombre(){
        return nombre; //retorna el valor de atributo
    }
    
    public void setaNac (int aNac){
        this.aNac = aNac;
    }
    public int getaNac(){
        return aNac;
    }

    public void setmNac(int mNac){
        this.mNac = mNac;
    }
    public int getmNac(){
        return mNac;
    }
    
    public void setdNac(int dNac){
        this.dNac = dNac;
    }
    public int getdNac(){
        return dNac;
    }
    
    public void setnoControl(String noControl){
        this.noControl = noControl;
    }
    public String getnoControl(){
        return noControl;
    }
    
    public void setsemAct(int semAct){
        this.semAct = semAct;
    }
    public int getsemAct(){
        return semAct;
    }
    
    public void setcveCar (int cveCar){
        this.cveCar = cveCar;
    }
    public int getcveCar(){
        return cveCar;
    }
    
    
    public int dia(){
        GregorianCalendar objG = new GregorianCalendar();
        
        return objG.get(dAct);
    }
    
    public int mes(){
        GregorianCalendar objG = new GregorianCalendar();
        return objG.get(mAct)+1;
    }
    
    public int año(){
        GregorianCalendar objG= new GregorianCalendar();
        return objG.get(aAct);
    }
    
   
    
    public int edad(){
        int edad;
        edad = año() - getaNac();
        if (getmNac()>mes())
            edad --;
        
        return edad;
    }
    
    /*
    public int;
        return ed;  edad (int aActual, int mesActual){
        int ed = aActual - getaNac();
        if (getmNac() > mesActual)
            ed -- ;
        return ed; 
    } 
   */
    
    
}

