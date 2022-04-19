package Clases;

import java.util.Scanner;

public class Menu implements Operation {

    static Scanner sc = new Scanner(System.in);
    int opcion;
    

    @Override
    public void doOperation(int n) {
        switch (n) {               
                case 0:
                    System.out.println("----ESCOJA UNA OPCION----");
                    System.out.println("\n1.Crear personaje");
                    System.out.println("2.Elegir equipo");
                    System.out.println("3.Desafiar");
                    System.out.println("4.Consultar oro");
                    System.out.println("5.Consultar ranking");
                    System.out.println("6.Salir");
                do{    
                    opcion= sc.nextInt();
                }while( opcion>6 || opcion<1);
                
                if(opcion==6){
                    mainMenu();
                }
                else
                    operationList.get(1).doOperation(opcion);
                break;
                
                case 1: 
                    System.out.println("----ESCOJA UNA OPCION----");
                    System.out.println("\n1.Editar personaje");
                    System.out.println("2.Add a personaje");
                    System.out.println("3.Banear usuario");
                    System.out.println("4.Desbanear usuario");
                    System.out.println("5.Salir");
                do{    
                    opcion= sc.nextInt();
                } while(opcion>5 || opcion<1);
                if(opcion==5){
                    mainMenu();
                }
                else
                    operationList.get(2).doOperation(opcion);
                break;
                
                case 2:mainMenu();
                break;
                

                
                default:
        }
    }

    public void mainMenu() {

            System.out.println("----BIENVENIDO----");
            System.out.println("\n1.Log in");
            System.out.println("2.Registarse");
            System.out.println("3.Salir");
            do {
                opcion = sc.nextInt();
            } while(opcion>3 || opcion<1);

            switch (opcion) {
                case 1:
                    DataBase.logIn();
                    break;
                case 2:
                    DataBase.registro();
                    break;
                case 3: exit();

                default:

            }
        
    }
    
    public static int mostrarArmas(){
        System.out.println("Elija el arma del usuario(Escriba el numero)");
        System.out.println("1.Ligera");
        System.out.println("2.Pesada"); 
        int tipoArma;
        
        do{
            tipoArma = sc.nextInt();
            if(tipoArma < 1 || tipoArma > 2){           
                System.out.println("Opcion incorrecta");
            }
        }while(tipoArma < 1 || tipoArma > 2);
        switch (tipoArma) {
            case 1:
                for (int i = 0; i < DataBase.listaArmasLigeras.size(); i++) {
                    System.out.println(i + 1 + " " + DataBase.listaArmasLigeras.get(i));
                }
                break;
            case 2:
                for (int i = 0; i < DataBase.listaArmasPesadas.size(); i++) {
                    System.out.println(i + 1 + " " + DataBase.listaArmasPesadas.get(i));
                }
                break;
            default:
        }
        return tipoArma;
        
    }   
    
                   
                    
                    
            public static void exit(){
               System.out.println("Saliendo...");
               operationList.get(4).doOperation(0);



       }
}