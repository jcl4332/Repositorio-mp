
package Clases;

import java.util.Scanner;


public class Administrador extends Usuario{
    Scanner sc= new Scanner(System.in);
    
    public Administrador(String nombre, String nick, String pass) {
        this.nombre=nombre;
        this.nick=nick;
        this.pass=pass;
    }

    public Administrador() {
    }
    
    @Override
    public void doOperation(int n) {
        int opcion = 2;
        
        System.out.println("Escriba el nombre del usuario a modificar");
        nombre = sc.nextLine();
        do
        {
            if (DataBase.mapaJugadores.keySet().contains(nombre)) {
                Jugador Player = DataBase.mapaJugadores.get(nombre);

                switch(n){
                        case 1:EditarPersonaje(Player);
                        break;
                        case 2:Banear(Player);
                        break;
                        case 3:Desbanear(Player);
                        break;
                        default:
                    }
            }
            else {
                System.out.println("No se ha encontrado el usuario.");
                System.out.println("1.Reintentar");
                System.out.println("2.Salir");
                do{
                    opcion = sc.nextInt();
                    if(opcion!= 1 || opcion!= 2)
                        System.out.println("Opcion invalida");
                }while(opcion!= 1 || opcion!= 2);
            }
        }while(opcion == 1);
    }

    private void EditarPersonaje(Jugador Player) {
        int opcion;
        int tipoOperacion;
        
        tipoOperacion = ConsOp.tipoOperacion();

        switch (tipoOperacion) {
            case 1:     
                opcion= ConsOp.menuModificacion();

                switch (opcion) {
                    case 1:
                        Player.getPersonaje().setNombre(ConsOp.comprobarNoVacio()); 
                        break;

                    case 2:           
                        ConsOp.tipoArma(ConsOp.lugarOperacion(),Player.getPersonaje());                                          

                    case 3:
                        if(ConsOp.lugarOperacion()==1)
                            ConsOp.modArmaduraActiva(Player.getPersonaje());
                        else if(ConsOp.lugarOperacion()==2)
                            ConsOp.modListaArmaduras(Player.getPersonaje());
                        break;

                    case 4:
                        Player.getPersonaje().setSalud(ConsOp.comprobarMayor(0)); 
                        break;

                    case 5:
                        Player.getPersonaje().setPoder(ConsOp.comprobarMayor(0)); 
                        break;

                    case 6:
                        ConsOp.modEsbirros(Player.getPersonaje());
                        break;

                    case 7:
                        ConsOp.modDebilidad(Player.getPersonaje());
                        break;

                    case 8:
                        ConsOp.modFortaleza(Player.getPersonaje());
                        break;

                    case 9:
                        Player.getPersonaje().setOro(ConsOp.comprobarMayor(0)); 
                        break;

                    default:
                        break;

                }
            case 2:
                opcion = ConsOp.menuAdd();
                switch (opcion) {
                    case 1:
                        ConsOp.tipoArma(3, Player.getPersonaje());
                        break;
                    case 2:
                        ConsOp.addListaArmaduras(Player.getPersonaje());
                        break;
                    case 3:
                        ConsOp.addEsbirros(Player.getPersonaje());
                        break;
                    case 4:
                        ConsOp.addDebilidad(Player.getPersonaje());
                        break;
                    case 5:
                        ConsOp.addFortalza(Player.getPersonaje());
                        break;

                    default:

                }
            break;

            default:

        }
        DataBase.mapaPersonajes.put(Player,Player.getPersonaje());
    }

    private void Banear(Jugador Player) {
        
        if(Player.isBaneado())
            System.out.println("El jugador ya esta baneado");
        else
            Player.setBaneado(true);
        
    }

    private void Desbanear(Jugador Player){
        if(!Player.isBaneado())
            System.out.println("El jugador no estaba baneado");
        else
            Player.setBaneado(false);
    } 
}
