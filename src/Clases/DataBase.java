package Clases;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class DataBase implements Operation, Serializable{
    private static DataBase BaseDatos;
    static Scanner sc= new Scanner(System.in);
    
    //Lista de jugadores (ranking)
    static List<Jugador> ranking = new ArrayList<>();
    
    //Listas de equipamiento
    static List<ArmaLigera> listaArmasLigeras = new ArrayList<>();
    static List<ArmaPesada> listaArmasPesadas = new ArrayList<>();
    static List<Armadura> listaArmaduras = new ArrayList<>();
    
   
    
    
    //Mapas de Usuarios y personajes
    static Map<Jugador,Personaje> mapaPersonajes = new HashMap<>(); //asigna a cada jugador su personaje
    static Map<Jugador,List<String>> mapaCombates  = new HashMap<>(); // asigna a cada jugador su registro de combates
    static Map<String,Jugador> mapaJugadores = new HashMap<>(); //asigna a cada jugador, su informacion
    static Map<String,Administrador> mapaAdmins = new HashMap<>(); //asigna a cada administrador, su informacion
    
    
    
    private DataBase(List<Jugador> ranking, List<ArmaLigera> listaArmasLigeras, List<ArmaPesada> listaArmasPesadas,List<Armadura> listaArmaduras,Map<Jugador,Personaje> personajes,
            Map<Jugador,List<String>> mapaCombates, Map<String,Jugador> mapaJugadores,Map<String,Administrador> mapaAdmins){
        this.ranking=ranking;  
        this.mapaPersonajes=personajes;
        this.mapaCombates=mapaCombates;
        this.mapaJugadores=mapaJugadores;
        this.mapaAdmins=mapaAdmins;
        this.listaArmasLigeras=listaArmasLigeras;
        this.listaArmasPesadas=listaArmasPesadas;
        this.listaArmaduras=listaArmaduras;
        
        
        
    }
    
    public static DataBase getDataBase(){
        if (BaseDatos==null){
            inicializar();                     
            BaseDatos= new DataBase(ranking,listaArmasLigeras,listaArmasPesadas,listaArmaduras,mapaPersonajes,
                                    mapaCombates,mapaJugadores,mapaAdmins);
        }
    
        return BaseDatos;
    }

    public static void registro() {
         String nombre;
         String nick;
         String pass;
         int opcion;

        System.out.println("1.Jugador");
        System.out.println("2.Admin");
        do{
            opcion = sc.nextInt();
        }while(opcion>2 || opcion<1);
        
        System.out.println("Escriba su nombre");
        sc.nextLine();
        do {
            System.out.println("El nombre no puede estar en uso por otro usuario");
            nombre = sc.nextLine();
        } while (mapaJugadores.keySet().contains(nombre) || mapaAdmins.keySet().contains(nombre)); //no se permite repetir nombre

        System.out.println("Escriba su nick");
        nick = sc.nextLine();

        System.out.println("Escriba su contraseña");
        pass = sc.nextLine();
        
        System.out.println("----REGISTRO EXITOSO----");

        switch (opcion) {

            case 1:
                Jugador Player = new Jugador(nombre, nick, pass, String.valueOf(mapaJugadores.size()), false);
                mapaJugadores.put(nombre, Player);
                operationList.get(0).doOperation(0); //doOperation del menu. Se pasa un 0 para indicar que es un jugador
                break;

            case 2:
                Administrador Admin = new Administrador(nombre, nick, pass);
                mapaAdmins.put(nombre, Admin);
                operationList.get(0).doOperation(1); //doOperation del menu. Se pasa un 0 para indicar que es un administrador
                break;

            default:
        }
    }
   
    public static void logIn() {
            
         String nombre;
         String nick;
         String pass;

        System.out.println("Escriba su nombre");
        nombre = sc.nextLine();
        System.out.println("Escriba su nick");
        nick = sc.nextLine();
        System.out.println("Escriba su contraseña");
        pass = sc.nextLine();
        

            if(mapaJugadores.keySet().contains(nombre)){
                    if (mapaJugadores.get(nombre).getNick().equals(nick))
                        if (mapaJugadores.get(nombre).getPass().equals(pass)){
                            System.out.println("----ACCESO EXITOSO----");
                            operationList.get(0).doOperation(0); //llamada a doOperation del menu
                        }
            }if(mapaAdmins.keySet().contains(nombre)){     
                    if (mapaAdmins.get(nombre).getNick().equals(nick))
                        if (mapaAdmins.get(nombre).getPass().equals(pass)){
                            System.out.println("----ACCESO EXITOSO----");
                            operationList.get(0).doOperation(1); //llamada a doOperation del menu
                        }
            } else {
            System.out.println("----CUENTA NO ENCONTARDA----");
            logIn();
        }

    }   

    @Override
    public void doOperation(int n) {
        
    }
    

    static void start(){
        operationList.add(new Menu()); //operationList.get(0) para menu
        operationList.add(new Jugador()); //operationList.get(1) para jugador
        operationList.add(new Administrador()); //operationList.get(2) para administrador
        operationList.add(BaseDatos); //operationList.get(3) para base de datos.
        //perationList.add(new DataBaseS()); //operationList.get(4) para base de datos. 
        
        operationList.get(4).doOperation(1); //deserealizar
        operationList.get(0).doOperation(2); //
    
    }

    private void serializeDB() {
       try {
           
           File datos = new File("C:/Users/MARIO/Documents/NetBeansProjects/PracticaMP_GrupoV/Practica_MP/DataBase/Base de datos"); 
           if(!datos.exists()) 
               datos.createNewFile(); //si no existe el fichero, lo crea. Si existe, simplemente escribe en el
           FileOutputStream os = new FileOutputStream(datos);
           ObjectOutputStream salida = new ObjectOutputStream(os);
           salida.writeObject(BaseDatos);
           salida.close();
           
       } catch (FileNotFoundException ex) {
           System.out.println("Error al crear la base de datos");
       } catch (IOException ex) {
           System.out.println("Error al escribir en la base de datos");
       }
        
    
    
    }
    

    private void deserializeDB()  {
        
        File datos = new File("C:\\Users\\MARIO\\Documents\\NetBeansProjects\\PracticaMP_GrupoV\\Practica_MP\\DataBase\\Base de datos"); //usa el fichero con los datos para leerlo
        if(datos.exists()){
            try {
               FileInputStream is = new FileInputStream(datos);
               ObjectInputStream entrada = new ObjectInputStream(is);
               BaseDatos = (DataBase)entrada.readObject();
               entrada.close();
           } catch (FileNotFoundException ex) {
               System.out.println("No existe la base de datos");
           } catch (IOException ex) {
               System.out.println("No se pudo abrir la base de datos");
           } catch (ClassNotFoundException ex) {

           }
        }
        else
            BaseDatos = getDataBase();
    }
    

    
    
    private static void inicializar(){
        listaArmasLigeras.add(new ArmaLigera("Daga", 2, 1));
        listaArmasLigeras.add(new ArmaLigera("Espada", 2, 1));
        listaArmasLigeras.add(new ArmaLigera("Pistola", 3, 0));

        listaArmasPesadas.add(new ArmaPesada("Mandoble", 3, 3));
        listaArmasPesadas.add(new ArmaPesada("Lanza", 4, 2));
        listaArmasPesadas.add(new ArmaPesada("Hacha", 5, 1));

        listaArmaduras.add(new Armadura("Armadura de hierro", 0, 6));
        listaArmaduras.add(new Armadura("Cota de malla", 1, 5));
        listaArmaduras.add(new Armadura("Sin armadura", 4, 1));

    }
    }


