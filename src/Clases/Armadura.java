

package Clases;



public class Armadura extends Equipo {

  

    public Armadura(String nombre, int defensa, int ataque) {
        this.nombre = nombre;
        this.defensa = defensa;
        this.poder = ataque;
    }

    Armadura() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
