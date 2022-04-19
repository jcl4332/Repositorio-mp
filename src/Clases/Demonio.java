
package Clases;

import Enumerados.Lealtad;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Demonio extends Esbirro {

     private String pacto;
     private List<Esbirro> listaEsbirros= new ArrayList<>();

    public Demonio(String pacto, String nombre, int salud, List<Esbirro> listaEsbiros) {
        this.pacto = pacto;
        this.nombre = nombre;
        this.salud = salud;
        this.listaEsbirros=listaEsbirros;
    }
     
    Demonio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public List<Esbirro> getListaEsbirros() {
        return listaEsbirros;
    }

    public void setListaEsbirros(List<Esbirro> listaEsbirros) {
        this.listaEsbirros = listaEsbirros;
    }
    
    public String getPacto() {
        return pacto;
    }

    public void setPacto(String pacto) {
        this.pacto = pacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void generarEsbirros(Demonio demonio) {
        Random random= new Random();
        int numero=random.nextInt(3)+1;
        switch(numero){
            case 1:               
                Humano esbirroHumano= new Humano(Lealtad.Media,"Esbirro humano de demonio",random.nextInt(2)+1);
                demonio.listaEsbirros.add(esbirroHumano);
                break;

            case 2:
                Ghoul esbirroGhoul= new Ghoul(random.nextInt(5)+1,"Esbirro ghoul de demonio",random.nextInt(2)+1);
                demonio.listaEsbirros.add(esbirroGhoul);
                break;
                       
            case 3:
                Demonio esbirroDemonio= new Demonio("No hay pacto entre demonios","Esbirro demonio de demonio",random.nextInt(2)+1,listaEsbirros);
                demonio.listaEsbirros.add(esbirroDemonio);
                                
                break;
                                    
            default:
            
            
        }
        for (Esbirro e :demonio.listaEsbirros){
                    if(e instanceof Demonio){
                        generarEsbirros((Demonio) e);
                    }
                }
    }
    
}
