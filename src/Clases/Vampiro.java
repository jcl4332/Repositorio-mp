
package Clases;

import java.util.List;
import java.util.Random;




public class Vampiro extends Personaje{
    
    private int puntosSangre;
    private int edad;

    public Vampiro(String nombre, Arma[] arma, Armadura armadura, List<Esbirro> listaEsbirro, int puntosSangre, int edad)
    {
        this.nombre = nombre;
        this.arma = arma;
        this.armadura = armadura;
        this.listaEsbirros = listaEsbirro;
        this.poder = 3;
        this.salud = 3;
        this.puntosSangre=puntosSangre;
        this.edad=edad;
        
      
        listaDebilidades.add(new Debilidad("Luz intensa",random.nextInt(5)+1)); //menos defensa
       
        
        listaFortalezas.add(new Fortaleza("Agilidad",random.nextInt(5)+1)); //mas daño
       
    }
}
