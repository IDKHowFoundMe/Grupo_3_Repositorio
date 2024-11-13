package seriesCaracteres;

import java.util.Scanner;

public class serieCaracterEcuacion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de caracteres que desea imprimir: ");
        int n = scanner.nextInt();
        scanner.close();

        g3_imprimirSerieCaracteres(n);
    }

    public static char g3_crearSerieCaracteres(int n, char[] caracteres) {
        return caracteres[n % caracteres.length];
    }

    public static void g3_imprimirSerieCaracteres(int a) {
        char[] caracteres = {'+', '-', '*', '/'};

        for (int i = 0; i < a; i++) {
            System.out.print(g3_crearSerieCaracteres(i, caracteres) + " ");
        }
    }

}

