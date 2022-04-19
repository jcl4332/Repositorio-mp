
package Clases;

import Interfaces.FabricaEsbirro;


public class FabricaHumano implements FabricaEsbirro {

    @Override
    public Humano crearEsbirro() {
        Humano esbirroHumano= new Humano();
        return esbirroHumano;
    }
    
    
    
}
