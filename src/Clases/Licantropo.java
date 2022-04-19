
package Clases;

import java.util.List;



public class Licantropo extends Personaje{

    private int rabia;
    public Licantropo(String nombre, Arma[] arma, Armadura armadura, List<Esbirro> listaEsbirro,int rabia)
    {
        this.nombre = nombre;
        this.arma = arma;
        this.armadura = armadura;
        this.listaEsbirros = listaEsbirro;       
        this.poder = 3;
        this.salud = 3;
        this.rabia=rabia;
        
        listaDebilidades.add(new Debilidad("Agotamiento",random.nextInt(5)+1)); //menos daño
        
              
        listaFortalezas.add(new Fortaleza("Luna llena",random.nextInt(5)+1)); //mas defensa
         
        
        
        
    }
}
