
package Clases;


public class Ghoul extends Esbirro {

    private int dependencia; //1-5
    
    public Ghoul(int dependencia, String nombre, int salud) {
        this.dependencia = dependencia;
        this.nombre = nombre;
        this.salud = salud;
    }

    Ghoul() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    public int getDependencia() {
        return dependencia;
    }

    public void setDependencia(int dependencia) {
        this.dependencia = dependencia;
    }
  
    
    
}
