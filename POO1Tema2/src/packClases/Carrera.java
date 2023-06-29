/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package packClases;

public class Carrera {
    private int cveCar;
    private String nomCar;
    
    //------------> Constructores <------------
    
    //Por defecto
    public Carrera(){
        System.out.println("---> Constructor por defecto");
    }
    
    //Por parametro
    public Carrera(int cveCar, String nomCar){
        this.cveCar= cveCar;
        this.nomCar = nomCar;
        System.out.println("---> Constructor por parametro");
    }
    
    //Copiador
    public Carrera(Carrera obj){
        this.cveCar = obj.cveCar;
        this.nomCar = obj.nomCar;
        System.out.println("---> Constructor copiador");
    }
    
    //------------> Constructores <------------  
    
    
    
    public void setcveCar(int cveCar){
        this.cveCar = cveCar;
    }
    public int getcveCar(){
        return cveCar;
    }
    
    public void setnomCar(String nomCar){
        this.nomCar = nomCar;
    }
    public String getnomCar(){
        return nomCar;
    }
    
    
    
    
}
