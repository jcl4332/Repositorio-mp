
package Clases;

import Enumerados.Lealtad;


public class Humano extends Esbirro {

    private String lealtad; //alta normal baja
    
    public Humano(Lealtad lealtad, String nombre, int salud) {
        this.lealtad = lealtad.toString();
        this.nombre = nombre;
        this.salud = salud;
    }

    Humano() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


    public String getLealtad() {
        return lealtad;
    }

    public void setLealtad(String lealtad) {
        this.lealtad = lealtad;
    }
    
    
}
