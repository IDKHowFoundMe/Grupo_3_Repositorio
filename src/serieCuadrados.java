package seriesNumericas;

import java.util.Scanner;

public class serieCuadrados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea imprimir: ");
        int n = scanner.nextInt();
        scanner.close();

        g3_imprimirSerieCuadrados(n);
    }

    public static int g3_generarCuadrado(int numero) {
        return numero * numero;
    }

    public static void g3_imprimirSerieCuadrados(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(g3_generarCuadrado(i) + " ");
        }
    }

}
