
import java.util.Scanner;
import java.util.ArrayList;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/**
 *
 * @author IOC
 */
public class AppEAC4 {

    Scanner sc = new Scanner(System.in);
    //declarar scanner global?
    //contantes numero de tiradas por ronda = 10
    //1 ronda = 10 tiradas por jugador
    
    //variables
    //int nnumPlayer;//lo leera el scanner
    //String menuText = " " 
    //int option = 0;
    //constamtes
    final byte MINIMO = 0;
    final int  MAXIMO = 5;
    //va
              int playersNumber;
         int points;
    public  void main(String[] args) {
        //iniciar scanner?
        AppEAC4 bowlingApp = new AppEAC4();
        bowlingApp.start();
        
         ArrayList<Integer> tarea = new ArrayList<>();
          ArrayList<String> point = new ArrayList<>();
          int option ;

       
         do{
             System.out.println("Bienvenido escoje una opcion: ") ;
             option = sc.nextInt();
          
            switch (option) {
            case 1:
                initializePoints(tarea);
                break;
            case 2:
                askForRoundPoints();
                break;
            case 3:
                //mostrarTareas(tareas)
                setRoundPoints();
                break;
            case 4:
                 showMenu();
                System.out.println("Gràcies per utilitzar l'aplicació");
                //sortir = true;
                break;
            case 5:
                pointsOrDash();
                break;
            default:
                System.out.println("opción incorrecta ó");
                break;

        }
        System.out.println();
        }while(option !=4);   

    }
    

    public void start(ArrayList<String>tareas) {
	//showMenu(String menuText);
        
        
        
    }

    public void askForRoundPoints(String[][] playersData, int[][] pointsMatrix) {
        
    }

    public int[][] initializePoints(int playersNumber) {
        
    }

    public String[][] initializePlayers(int playersNumber) {
       
    }

    public void showMenu(int option) {
           System.out.println("\nMENú PRINCIPAL BOWLLING*****");
        System.out.println("1. Opció 1.Afegir Jugadors.");
        System.out.println("2. Opció 2.Mostra puntuacio");
        System.out.println("3. Opcio 3. Eliminar jugador");
            System.out.println("0. Sortir de l'aplicació.\n");
            option = sc.nextInt();
            if(option < MINIMO || option > MAXIMO){
                System.out.println("Escull una opció vàlida");
            }else{
                
            }
    }

    public void showError(String textError) {
        
    }

    public String askForString(String message, String errorMessage){
    
    }
    
    public int askForInteger(String message, String errorMessage) {
       
    }

    public void insertPlayerNames(String[][] playersData, int rowNumber, String name, String lastName, int age) {
        
    }

    public void setRoundPoints(int[][] pointsMatrix, int rowIndex, int rund, int points) {
        
    }

    public void showRounds(String[][] playersData, int[][] pointsMatrix) {
        
    }

    static String pointsOrDash(ArrayList<String> point) {
        return;
    }   
}
