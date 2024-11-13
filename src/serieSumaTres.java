package seriesNumericas;

import java.util.Scanner;

public class serieSumaTres {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea imprimir: ");
        int n = scanner.nextInt();
        scanner.close();

        g3_imprimirSerie(n);
    }

    public static int g3_sumarNumeros(int terminoActual) {
        return terminoActual + 3; 
    }

    public static void g3_imprimirSerie(int n) {
        int termino = 1; 
        for (int i = 0; i < n; i++) {
            System.out.print(termino + " ");
            termino = g3_sumarNumeros(termino);
        }
    }

    
}

