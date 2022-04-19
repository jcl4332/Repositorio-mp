
package Clases;


import Enumerados.Lealtad;
import Interfaces.FabricaEsbirro;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class ConsOp {
 
    static Scanner sc= new Scanner(System.in);
     
    public static void modArmasLigerasActivas(Personaje personaje){
        for(int i=1; i<3; i++){
            System.out.println("Escriba el nuevo nombre del arma ligera "+i );
            personaje.getArma(i).setNombre(comprobarNoVacio());
            System.out.println("Escriba el nuevo poder del arma ligera "+i);
            personaje.getArma(i).setPoder(comprobarMayor(0));
            System.out.println("Escriba la nueva defensa del arma ligera "+i);
            personaje.getArma(i).setDefensa(comprobarMayor(-1));
        }
    }
    
    
    public static void modListaArmasLigeras(Personaje personaje){
        int opcion;
        do{
            for(int i=0;i<personaje.listaArmasLigeras.size();i++){
                System.out.println((i+1)+personaje.listaArmasLigeras.get(i).getNombre());
            }
            System.out.println("Indique el arma a modificar");
            opcion=comprobarEntre(1, personaje.listaArmasLigeras.size());
            System.out.println("Escriba el nombre del arma ligeras");
            personaje.listaArmasLigeras.get(opcion-1).setNombre(comprobarNoVacio());
            System.out.println("Escriba el valor de poder del arma ligera");
            personaje.listaArmasLigeras.get(opcion-1).setPoder(comprobarMayor(0));
            System.out.println("Escriba el valor de defensa del arma ligera");
            personaje.listaArmasLigeras.get(opcion-1).setDefensa(comprobarMayor(-1));

            System.out.println("Desea salir?");
            System.out.println("1.Si");
            System.out.println("2.No");
        }while(comprobarEntre(1,2)==2);
    
    }
     
     
     public static void addListaArmasLigeras(Personaje personaje){
         do{
            ArmaLigera nuevaAL= new ArmaLigera();
            System.out.println("Escriba el nombre del arma");
            nuevaAL.setNombre(comprobarNoVacio());
            System.out.println("Escriba el poder del arma");
            nuevaAL.setPoder(comprobarMayor(0));
            System.out.println("Escriba la defensa");
            nuevaAL.setDefensa(comprobarMayor(-1));
            personaje.listaArmasLigeras.add(nuevaAL);
            System.out.println("Desea salir?");
            System.out.println("1.Si");
            System.out.println("2.No");
        }while(comprobarEntre(1,2)==2); 
    }
    
    
    public static void modArmaPesadaActiva(Personaje personaje){
        System.out.println("Escriba el nombre nuevo del arma pesada");
        personaje.getArma(1).setNombre(comprobarNoVacio());
        System.out.println("Escriba el nuevo poder del arma ligera");
        personaje.getArma(1).setPoder(comprobarMayor(0));
        System.out.println("Escriba la nueva defensa del arma ligera");
        personaje.getArma(1).setDefensa(comprobarMayor(-1));
        personaje.setArma(null,2);
    }
    
    public static void modListaArmasPesadas(Personaje personaje){
        int opcion;
        do{
            for(int i=0;i<personaje.listaArmasPesadas.size();i++){
                System.out.println((i+1)+personaje.listaArmasPesadas.get(i).getNombre());
            }
            System.out.println("Indique el arma a modificar");
            opcion=comprobarEntre(1, personaje.listaArmasPesadas.size());
            System.out.println("Escriba el nombre del arma pesada");
            personaje.listaArmasPesadas.get(opcion-1).setNombre(comprobarNoVacio());
            System.out.println("Escriba el valor de poder del arma pesada");
            personaje.listaArmasPesadas.get(opcion-1).setPoder(comprobarMayor(0));
            System.out.println("Escriba el valor de defensa del arma pesada");
            personaje.listaArmasPesadas.get(opcion-1).setDefensa(comprobarMayor(-1));

            System.out.println("Desea salir?");
            System.out.println("1.Si");
            System.out.println("2.No");
        }while(comprobarEntre(1,2)==2);
    
    }
       
    public static void addListaArmasPesadas(Personaje personaje){
        do{
            ArmaPesada nuevaAP= new ArmaPesada();
            System.out.println("Escriba el nombre del arma");
            nuevaAP.setNombre(comprobarNoVacio());
            System.out.println("Escriba el poder del arma");
            nuevaAP.setPoder(comprobarMayor(0));
            System.out.println("Escriba la defensa");
            nuevaAP.setDefensa(comprobarMayor(-1));
            personaje.listaArmasPesadas.add(nuevaAP);
            System.out.println("Desea salir?");
            System.out.println("1.Si");
            System.out.println("2.No");
        }while(comprobarEntre(1,2)==2); 
    
    }
    
    
 
     public static void modArmaduraActiva(Personaje personaje){
        System.out.println("Escriba el nuevo nombre de la armadura");
        personaje.getArmadura().setNombre(comprobarNoVacio());
        System.out.println("Escriba el nuevo poder de la armadura");
        personaje.getArmadura().setPoder(comprobarMayor(-1));
        System.out.println("Escriba la nueva defensa de la armadura");
        personaje.getArmadura().setDefensa(comprobarMayor(0));
    }
     
     public static void modListaArmaduras(Personaje personaje){
        int opcion;
         do{
            for(int i=0;i<personaje.listaArmaduras.size();i++){
                System.out.println((i+1)+personaje.listaArmaduras.get(i).getNombre());
            }
            System.out.println("Indique la debilidad a modificar");
            opcion=comprobarEntre(1, personaje.listaArmaduras.size());
            System.out.println("Escriba el nuevo nombre de la debilidad");
            personaje.listaArmaduras.get(opcion-1).setNombre(comprobarNoVacio());
            System.out.println("Escriba el nuevo poder de la armadura");
            personaje.listaArmaduras.get(opcion-1).setPoder(comprobarMayor(-1));
            System.out.println("Escriba el valor de defensa de la armadura");
            personaje.listaArmaduras.get(opcion-1).setDefensa(comprobarMayor(0));
            
            System.out.println("Desea salir?");
            System.out.println("1.Si");
            System.out.println("2.No");
        }while(comprobarEntre(1,2)==2);
    
    
    }
    
    public static void addListaArmaduras(Personaje personaje){
        do{
            Armadura armadura= new Armadura();
            System.out.println("Escriba el nombre de la armadura");
            armadura.setNombre(comprobarNoVacio());
            System.out.println("Escriba el valor de poder de la armadura");
            armadura.setPoder(comprobarMayor(-1));
            System.out.println("Escriba el valor de defensa de la armadura");
            armadura.setDefensa(comprobarMayor(0));
            personaje.listaArmaduras.add(armadura);
            System.out.println("Desea salir?");
            System.out.println("1.Si");
            System.out.println("2.No");
        }while(comprobarEntre(1,2)==2);
        
    
    }
         
     public static void modEsbirros(Personaje personaje){
        int opcion;
        do{
            for(int i=0;i<personaje.listaEsbirros.size();i++){
                System.out.println((i+1)+personaje.listaEsbirros.get(i).getNombre());
            }
            System.out.println("Indique el esbirro a modificar");
            opcion=comprobarEntre(1, personaje.listaEsbirros.size());
            System.out.println("Escriba el nuevo nombre del esbirro");
            personaje.listaEsbirros.get(opcion-1).setNombre(comprobarNoVacio());
            System.out.println("Escriba la nueva salud del esbirro");
            personaje.listaEsbirros.get(opcion-1).setSalud(comprobarMayor(0));
            
            if(personaje.listaEsbirros.get(opcion-1) instanceof Humano){
                Humano esbirroHumano= (Humano) personaje.listaEsbirros.get(opcion-1); 
                System.out.println("Escriba el nuevo valor de lealtad del humano");                             
                esbirroHumano.setLealtad(comprobarLealtad());
                personaje.listaEsbirros.remove(opcion-1);
                personaje.listaEsbirros.add(opcion-1, esbirroHumano);

            }
            else if(personaje.listaEsbirros.get(opcion-1) instanceof Ghoul){
                Ghoul esbirroGhoul= (Ghoul) personaje.listaEsbirros.get(opcion-1);   
                System.out.println("Escriba el nuevo valor de dependencia del ghoul");                            
                esbirroGhoul.setDependencia(comprobarEntre(1,5));
                personaje.listaEsbirros.remove(opcion-1);
                personaje.listaEsbirros.add(opcion-1, esbirroGhoul);
            }
            else if(personaje.listaEsbirros.get(opcion-1) instanceof Demonio){
                Demonio esbirroDemonio= (Demonio) personaje.listaEsbirros.get(opcion-1);
                System.out.println("Escriba el nuevo pacto del demonio");                              
                esbirroDemonio.setPacto(comprobarNoVacio());
                personaje.listaEsbirros.remove(opcion-1);
                personaje.listaEsbirros.add(opcion-1, esbirroDemonio);
            }
            
            
            System.out.println("Desea salir?");
            System.out.println("1.Si");
            System.out.println("2.No");
        }while(comprobarEntre(1,2)==2);
    
    }
    
    public static void addEsbirros(Personaje personaje){
         int salir=0;
        do{
            Esbirro nuevoEsbirro=tipoEsbirro(personaje);
            
            System.out.println("Escriba el nombre del esbirro");
            nuevoEsbirro.setNombre(comprobarNoVacio());
            System.out.println("Escriba el valor salud del esbirro");
            nuevoEsbirro.setSalud(comprobarMayor(1));
            System.out.println("Escriba el valor de defensa de la armadura");
            personaje.listaEsbirros.add(nuevoEsbirro);
            
            System.out.println("Desea salir?");
            System.out.println("1.No");
            System.out.println("2.Si");
            salir=comprobarEntre(1,2);
        }while(salir!=2);
        if(salir==1)
            addEsbirros(personaje);
    }
    
    public static Esbirro tipoEsbirro(Personaje personaje){
            System.out.println("Que tipo de esbirro quiere añadir?");
            System.out.println("1.Humano");
            System.out.println("2.Ghoul");
            System.out.println("3.Demonio");
            
            switch(comprobarEntre(1,3)){
                case 1:
                    if(personaje instanceof Vampiro)
                        System.out.println("Los vampiros no pueden tener esbirros humanos");
                    else{
                       FabricaHumano FH= new FabricaHumano();
                       Humano esbirroHumano=FH.crearEsbirro();
                       System.out.println("Escriba el valor de voluntad del humano (Escriba Alta, Media o Baja");
                       esbirroHumano.setLealtad(comprobarLealtad());
                       return esbirroHumano;  
                    }
                
                case 2:
                       FabricaGhoul FG= new FabricaGhoul();
                       Ghoul esbirroGhoul=FG.crearEsbirro();
                       System.out.println("Escriba el valor de dependencia del ghoul. Escriba 1-5");
                       esbirroGhoul.setDependencia(comprobarEntre(1,5));
                       return esbirroGhoul;
                    
                case 3:
                       boolean continuar=true;
                       FabricaDemonio FD= new FabricaDemonio();
                       Demonio esbirroDemonio=FD.crearEsbirro();
                       System.out.println("Escriba el pacto del demonio");
                       esbirroDemonio.setPacto(comprobarNoVacio());
                       do{
                        System.out.println("Quiere generar esbirros para los demonios? (Generará un nuevo esbirro para cada demonio, cada vez que seleccione Si)");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        if(comprobarEntre(1,2)==1)
                            esbirroDemonio.generarEsbirros(esbirroDemonio);
                        else{
                            esbirroDemonio.setListaEsbirros(null);
                            continuar=false;
                        }
                       }while(continuar);
                       return esbirroDemonio;
                    
                default: return null;
            }
        
    }
    
   
    
    public static void modDebilidad(Personaje personaje){
        int opcion;
        do{
            for(int i=0;i<personaje.listaDebilidades.size();i++){
                System.out.println((i+1)+personaje.listaDebilidades.get(i).getNombre());
            }
            System.out.println("Indique la debilidad a modificar");
            opcion=comprobarEntre(1, personaje.listaDebilidades.size());
            System.out.println("Escriba el nuevo nombre de la debilidad");
            personaje.listaDebilidades.get(opcion-1).setNombre(comprobarNoVacio());
            System.out.println("Escriba el nuevo grado de efecto de la debilidad");
            personaje.listaDebilidades.get(opcion-1).setEfecto(comprobarEntre(1,5));
            
            System.out.println("Desea salir?");
            System.out.println("1.Si");
            System.out.println("2.No");
        }while(comprobarEntre(1,2)==2);
    
    }
    
    public static void addDebilidad(Personaje personaje){
        Debilidad nuevaDeb= new Debilidad();
        System.out.println("Escriba el nombre de la debilidad");
        nuevaDeb.setNombre(sc.nextLine());
        System.out.println("Escriba el grado de efecto de la debilidad (1-5)");
        nuevaDeb.setEfecto(comprobarEntre(1,5));
        personaje.listaDebilidades.add(nuevaDeb);
    
    }
    
    public static void modFortaleza(Personaje personaje){
        int opcion;
        do{
            for(int i=0;i<personaje.listaFortalezas.size();i++){
                System.out.println((i+1)+personaje.listaFortalezas.get(i).getNombre());
            }
            System.out.println("Indique la fortaleza a modificar");
            opcion=comprobarEntre(1, personaje.listaFortalezas.size());
            System.out.println("Escriba el nuevo nombre de la fortaleza");
            personaje.listaFortalezas.get(opcion-1).setNombre(comprobarNoVacio());
            System.out.println("Escriba el nuevo grado de efecto de la fortaleza");
            personaje.listaFortalezas.get(opcion-1).setEfecto(comprobarEntre(1,5));
            
            System.out.println("Desea salir?");
            System.out.println("1.Si");
            System.out.println("2.No");
        }while(comprobarEntre(1,2)==2);
    
    }
    
    public static void addFortalza(Personaje personaje){
        Fortaleza nuevaFort= new Fortaleza();
        System.out.println("Escriba el nombre de la fortaleza");
        nuevaFort.setNombre(sc.nextLine());
        System.out.println("Escriba el grado de efecto de la fortaleza (1-5)");
        nuevaFort.setEfecto(comprobarEntre(1,5));
        personaje.listaFortalezas.add(nuevaFort);
    
    }
    
   
    
    public static int tipoOperacion(){
        System.out.println("1.Moficar informacion");
        System.out.println("2.Add informacion");
        return comprobarEntre(1,2);
    }

   public static int lugarOperacion(){ //para las armas y armaduras
        System.out.println("1.Moficar activa");
        System.out.println("2.Modificar lista");
        return comprobarEntre(1,2);
    }
   
   
   public static void tipoArma(int lugarOperacion, Personaje personaje){
       int tipoArma;
       System.out.println("Que tipo de armas quiere modificar o añadir?");
       System.out.println("1.Armas ligeras");
       System.out.println("2.Armas pesadas");
       tipoArma=comprobarEntre(1,2);
        switch(lugarOperacion){   // 1-->modificacion de arma activa  2--> modificacion de lista de armas  3--> añadir a la lista de armas            
            case 1:
                if(tipoArma==1) // 1--> arma ligera  2--> arma pesada
                    modArmasLigerasActivas(personaje);
                else if (tipoArma==2)
                    modArmaPesadaActiva(personaje);
            break;
            
            case 2:
                if(tipoArma==1)
                    modListaArmasLigeras(personaje);
                else if (tipoArma==2)
                    modListaArmasPesadas(personaje);
            break;
            
            case 3:
                if(tipoArma==1)
                    addListaArmasLigeras(personaje);
                else if (tipoArma==2)
                    addListaArmasPesadas(personaje);
            break;
            
            default:        
        } 
   }
   

   
   public static String comprobarLealtad(){
       String opcion;
       opcion=sc.nextLine();
       for(Lealtad l: Lealtad.values()){
           if(opcion==l.toString())
            return opcion;
       }
       System.out.println("Valor no valido, intente de nuevo");
       comprobarLealtad();
       return "";
   }
   
   
   public static String comprobarNoVacio(){
       String opcion;
       do {
           opcion = sc.nextLine();
           if (opcion=="") {
               System.out.println("Valor no valido");
           }
       } while (opcion=="");
   return opcion;
   }
   
   
   public static int comprobarEntre(int min, int max){
       int opcion;
       do {
           opcion = sc.nextInt();
           if (opcion < min || opcion > max) {
               System.out.println("Valor no valido");
           }
       } while (opcion < min || opcion > max);
   return opcion;
   }
   
    public static int comprobarMayor(int min){
       int opcion;
       do {
           opcion = sc.nextInt();
           if (opcion < min) {
               System.out.println("Valor no valido");
           }
       } while (opcion<min);
   return opcion;
   }
    
    public static int comprobarMenor(int max){
       int opcion;
       do {
           opcion = sc.nextInt();
           if (opcion > max) {
               System.out.println("Valor no valido");
           }
       } while (opcion > max);
   return opcion;
   }
   
   
   
   public static int menuModificacion(){
       int opcion;
       System.out.println("Que desea modificar?");
       System.out.println("1. Nombre Perosnaje");
       System.out.println("2. Armas");
       System.out.println("3. Armadura");
       System.out.println("4. Salud");
       System.out.println("5. Poder");
       System.out.println("6. Esbirros");
       System.out.println("7. Debilidades");
       System.out.println("8. Fortalezas");
       System.out.println("9. Oro");
       return comprobarEntre(1,9);
   }
   
   
   
   public static int menuAdd(){
       int opcion;
       System.out.println("Que desea añadir?");
       System.out.println("1. Armas");
       System.out.println("2. Armadura");
       System.out.println("3. Esbirros");
       System.out.println("4. Debilidades");
       System.out.println("5. Fortalezas");
       return comprobarEntre(1,5);
   }
}

