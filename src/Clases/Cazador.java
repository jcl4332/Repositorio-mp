package Clases;

import java.util.List;
import java.util.Random;



public class Cazador extends Personaje{
    
    private int voluntad;

    public Cazador(String nombre, Arma[] arma, Armadura armadura, List<Esbirro> listaEsbirro, int voluntad)
    {
        this.nombre = nombre;
        this.arma = arma;
        this.armadura = armadura;
        this.listaEsbirros = listaEsbirro;
        this.poder = 3;
        this.salud = 3;
        this.voluntad=voluntad;
        
        
        listaDebilidades.add(new Debilidad("Oscuridad",random.nextInt(5)+1)); //menos defensa
                
        listaFortalezas.add(new Fortaleza("Flechas perforantes",random.nextInt(5)+1)); //mas daño
       
    }
}

