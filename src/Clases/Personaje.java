
package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;





public class Personaje extends Entidad implements Operation  {  //pendiente de crear constructor

     
    protected int poder;
    protected int oro;
    protected Arma [] arma= new Arma [2]; //activa
    protected Armadura armadura; //activa
    protected Modificador modificador; //modificador activo en combate. No tiene relevancia fuera de este
    
    
    protected List<ArmaLigera> listaArmasLigeras= new ArrayList<>();
    protected List<ArmaPesada> listaArmasPesadas= new ArrayList<>();
    protected List<Armadura> listaArmaduras= new ArrayList<>();
    protected List<Esbirro> listaEsbirros = new ArrayList<>();   
    protected List<Fortaleza> listaFortalezas = new ArrayList();
    protected List<Debilidad> listaDebilidades = new ArrayList();
    
    
    public Modificador getModificador() {
        return modificador;
    }

    public void setModificador(Modificador modificador) {
        this.modificador = modificador;
    }

    public List<ArmaLigera> getListaArmasLigeras() {
        return listaArmasLigeras;
    }

    public void setListaArmasLigeras(List<ArmaLigera> listaArmasLigeras) {
        this.listaArmasLigeras = listaArmasLigeras;
    }

    public List<ArmaPesada> getListaArmasPesadas() {
        return listaArmasPesadas;
    }

    public void setListaArmasPesadas(List<ArmaPesada> listaArmasPesadas) {
        this.listaArmasPesadas = listaArmasPesadas;
    }

    public List<Fortaleza> getListaFortalezas() {
        return listaFortalezas;
    }

    public void setListaFortalezas(List<Fortaleza> listaFortalezas) {
        this.listaFortalezas = listaFortalezas;
    }


   
    
    Random random=new Random();
    
    

    public List<Armadura> getListaArmaduras() {
        return listaArmaduras;
    }

    public void setListaArmadura(List<Armadura> listaArmaduras) {
        this.listaArmaduras = listaArmaduras;
    }




    public int getOro() {
        return oro;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public Arma getArma(int n) {
        return arma[n];
    }

    public void setArma(Arma arma, int n) {
        this.arma[n] = arma;
    }

    public Armadura getArmadura() {
        return armadura;
    }

    public void setArmadura(Armadura armadura) {
        this.armadura = armadura;
    }

    public List<Esbirro> getListaEsbirros() {
        return listaEsbirros;
    }

    public void setListaEsbirros(List<Esbirro> listaEsbirros) {
        this.listaEsbirros = listaEsbirros;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public List<Fortaleza> getListaFortaleza() {
        return listaFortalezas;
    }

    public void setListaFortaleza(List<Fortaleza> listaFortalezas) {
        this.listaFortalezas = listaFortalezas;
    }

    public List<Debilidad> getListaDebilidad() {
        return listaDebilidades;
    }

    public void setListaDebilidad(List<Debilidad> listaDebilidades) {
        this.listaDebilidades = listaDebilidades;
    }
   
    public void Personaje() {
        //las debilidades y fortalezas depende de la clase
    }

    @Override
    public void doOperation(int n) {
        
    }
    
    public void CrearPersonaje(){}

    public void ElegirEquipo(){}

    public int ConsultarOro()
    {
        return this.oro;
    }

    public void ConsultarRanking(){
    }
    
    public void doEfecto(Modificador modificador){ //para hacer los efectos de los modificadores
    
        if(modificador instanceof Debilidad){}
        
        if(modificador instanceof Fortaleza){}
    
    
    }
    

   
    
}
