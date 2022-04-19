
package Clases;

import java.util.Scanner;


public class Jugador extends Usuario{

    private String numReg;
    private boolean baneado;
    private Personaje personaje;
    
    public Jugador(String nombre, String nick, String pass, String numReg, boolean baneado) 
    {
        this.nombre=nombre;
        this.nick=nick;
        this.pass=pass;
        this.numReg=numReg;
        this.baneado=baneado;
    }

    public Personaje getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personaje personaje) {
        this.personaje = personaje;
    }

    public Jugador() 
    {
        
    }
    public String getnumReg() {
        return numReg;
    }

    public void setnumReg(String numRegistro) {
        this.numReg = numRegistro;
    }

    public boolean isBaneado() {
        return baneado;
    }

    public void setBaneado(boolean baneado) {
        this.baneado = baneado;
    }
    

    @Override
    public void doOperation(int n) {
        switch(n){
                case 1:CrearPersonaje();
                break;
                case 2:ElegirEquipo();
                break;
                case 3:Desafiar();
                break;
                case 4:ConsultarOro();
                break;
                case 5:ConsultarRanking();
                break;
                default:
    }
}

    public void CrearPersonaje() 
    {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int opcionArma;
               
        System.out.println("Ecriba el nombre de tu personaje");
        do {
            nombre = sc.nextLine();
            if (nombre == "") {
                System.out.println("El nombre no puede estar vacio");
            }
        } while (nombre == "");
        
        Menu.mostrarArmas(); 
        do{
            opcionArma = sc.nextInt();
            if(opcionArma < 1 || opcionArma > 3){
                System.out.println("Opcion incorrecta");
            }
        }while(opcionArma < 1 || opcionArma > 3);
        
 
        
        
        
        //mostrar lista de armadura y recoger numero de armadura
        
        //mostrar lista de esbirros y recoger numero de esbirros
        
        switch(opcionClase)
        {
            case 1: Vampiro vampiro = new Vampiro(nombre, arma, armadura, esbirros);
                    this.personaje = vampiro;
                    break;
            case 2: Licantropo licantropo = new Licantropo(nombre, arma, armadura, esbirros);
                    this.personaje = licantropo;
                    break;
            case 3: Cazador cazador = new Cazador(nombre, arma, armadura, esbirros);
                    this.personaje = cazador;
                    break;
        }
    
    
    System.out.println("Que tipo de personaje es?(Escriba el numero)");
        System.out.println("1.Vampiro");
        System.out.println("2.Licantropo");
        System.out.println("3.Cazador");
        int opcionClase;
        do
        {
            opcionClase = sc.nextInt();
            if(opcionClase < 1 || opcionClase > 3)
            {
                System.out.println("Opcion incorrecta");
            }
        }while(opcionClase < 1 || opcionClase > 3);
    
    }

    void ElegirEquipo() 
    {
       
    }

    void Desafiar() 
    {   
        System.out.println("Escriba el nombre del jugador al que quiera desafiar:");
        Scanner sc = new Scanner(System.in);
        nombre = sc.nextLine();
        
        //String codigoJugador = BaseDatos.
        if(true/*codigoJugador == null*/)
        {
            int oroApostado;
            Jugador jugador;
            System.out.println("Cuanto oro quieres apostar");
            oroApostado = sc.nextInt();
            if(oroApostado <= 0)
            {
                System.out.println("Cantidad invalida");
            }
            else if(this.ConsultarOro() < oroApostado)
            {
                System.out.println("No tienes el suficiente oro para apostar");
            }
            else
            {
                //falta mucha mierda
            }
        }
        else
        {
            System.out.println("No existe dicho jugador");
        }
        
    }

    int ConsultarOro() 
    {
        return this.personaje.ConsultarOro();
    }

    void ConsultarRanking() 
    {
        //hacer que la base de datos nos de la lista de jugadores
    }

    /*Object getPersonaje() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    */
  
}



