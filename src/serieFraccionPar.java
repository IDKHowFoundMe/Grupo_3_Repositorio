package seriesNumericas;

import java.util.Scanner;

public class serieFraccionPar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea imprimir: ");
        int n = scanner.nextInt();
        scanner.close();

        g3_imprimirSerieFraccionPar(n);
    }

    public static String g3_crearSerieFraccionPar(int numerador, int denominador) {
        return numerador + "/" + denominador;
    }

    public static void g3_imprimirSerieFraccionPar(int n) {
        int a = 0, b = 1;
        int denominador = 2;

        for (int i = 0; i < n; i++) {
            System.out.print(g3_crearSerieFraccionPar(a, denominador) + " ");
            
            int temp = b;
            b += a;
            a = temp;

            denominador += 2;
        }
    }
}
