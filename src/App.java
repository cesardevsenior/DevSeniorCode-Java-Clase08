import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Aqui es donde está el problema
        System.out.println("Prueba de rama");
        var scanner = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("--------------------");
        System.out.println("1.Pizza");
        System.out.println("2.Hamburguesa");
        System.out.println("3.Salchipapas");
        System.out.println("0 Salir de la aplicación");
        System.out.println("Ingresa una opción");
        var opcion= scanner.nextInt();
        switch (opcion) {
            case 1:
                pizza();
                break;
            case 2:
               
                hamburguesa();
                break;
            case 3:
                salchipapas();
                break;
            case 0:
                System.out.println("Gracias por usar nuestra aplicación,!Hasta luego¡"); 
                break;
            default:
                System.err.println("Opción invalida");
                break;
        }
       
        
        
        scanner.close();
    
    }

    private static void pizza() {
        System.out.println("La pizza vale 20.000 pesos");
        
    }

    private static void hamburguesa() {
        System.out.println("No tenemos hamburguesas :( se agotaron");
    }

    //Esto es una funcion en java
    public static void salchipapas(){
        System.out.println("Las salchipapas cuestan 25.000 pesos");
    }
}
