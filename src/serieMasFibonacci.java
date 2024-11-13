package seriesCaracteres;

import java.util.Scanner;

public class serieMasFibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Imprimir la cantidad de caracteres que desea imprimir: ");
        int n = scanner.nextInt();
        scanner.close();

        g3_imprimirSerie(n);
    }
    
    public static String g3_crearSerieMasFibonacci(int cantidad) {
        StringBuilder signos = new StringBuilder();
        for (int j = 0; j < cantidad; j++) {
            signos.append("+");
        }
        return signos.toString();
    }

    public static void g3_imprimirSerie(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(g3_crearSerieMasFibonacci(i));
        }
    }

   
}

