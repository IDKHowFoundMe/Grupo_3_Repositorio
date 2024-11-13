package seriesCaracteres;

import java.util.Scanner;

public class serieAlfabetoCaracter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de letras que desea imprimir: ");
        int n = scanner.nextInt();
        scanner.close();

        g3_imprimirSerieAlfabetoCaracter(n);
    }

    public static char g3_generarLetra(int indice) {
        return (char) ('a' + indice * 2);
    }

    public static char g3_generarCaracter(int indice) {
        return (indice % 2 == 0) ? '+' : '-';
    }

    public static void g3_imprimirSerieAlfabetoCaracter(int n) {
        for (int i = 0; i < n; i++) {
            char letra = g3_generarLetra(i);
            char signo = g3_generarCaracter(i);
            System.out.print(letra + " " + signo + " ");
        }
    }

}

