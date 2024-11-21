package com.devsenior.cdiaz;

import java.util.Scanner;

public class Reto {

    public static void execute(){
        var scanner = new Scanner(System.in);

        var exit = false;
        do {
        System.out.println("""
                ########################################
                  Aplicacion del viaje interplanetario        
                ########################################
                1. Listar planetas
                0. Salir
                """);
            System.out.print("Ingrese su opcion: ");
            var option = scanner.nextInt();

            switch (option) {
                case 0:
                    exit = true;
                    break;
                case 1:
                    getAllPlanets();
                    break;
            
                default:
                    System.err.println("Opcion no válida.");
                    System.out.println("Presione enter para continuar");
                    break;
            }

        } while (!exit);

        scanner.close();
    }

    private static void getAllPlanets() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPlanets'");
    }
}
