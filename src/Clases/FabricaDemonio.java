
package Clases;

import Interfaces.FabricaEsbirro;

public class FabricaDemonio implements FabricaEsbirro {

    @Override
    public Demonio crearEsbirro() {
        Demonio esbirroDemonio= new Demonio();
        return esbirroDemonio;   
    
    
    }
}
