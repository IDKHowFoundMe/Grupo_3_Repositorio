package seriesNumericas;

import java.util.Scanner;

public class serieFibonacci{

    public static void main(String[] args) {
        int n = g3_leerNumero();
        String fibonacciSeries = g3_crearSerieFibonacci(n);
        System.out.println("Serie de Fibonacci: " + fibonacciSeries);
    }

    public static int g3_leerNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea imprimir: ");
        int n = scanner.nextInt();
        scanner.close();
        return n;
    }

    public static String g3_crearSerieFibonacci(int n) {
        int a = 0, b = 1;
        StringBuilder series = new StringBuilder();

        while (series.length() < n) {
            series.append(a).append(" ");
            int c = a + b;
            a = b;
            b = c;
        }

        return g3_limitarSerie(series.toString(), n);
    }

    public static String g3_limitarSerie(String series, int n) {
        if (series.length() > n) {
            return series.substring(0, n);
        } else {
            return series;
        }
    }
}
