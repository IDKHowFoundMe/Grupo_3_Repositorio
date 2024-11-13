package seriesCaracteres;

import java.util.Scanner;

public class serieAlfabeto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de letras que desea imprimir: ");
        int n = scanner.nextInt();
        scanner.close();

        g3_imprimirSerieLetras(n);
    }
   
    public static char g3_generarLetra(int indice) {
        return (char) ('a' + indice);
    }

    public static void g3_imprimirSerieLetras(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(g3_generarLetra(i) + " ");
        }
    }

}

