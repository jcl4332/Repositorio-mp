
package Clases;

import Interfaces.FabricaEsbirro;


public class FabricaGhoul implements FabricaEsbirro {

    @Override
    public Ghoul crearEsbirro() {
        Ghoul esbirroGhoul= new Ghoul();
        return esbirroGhoul;
    }
    
}
