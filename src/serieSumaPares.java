package seriesNumericas;

import java.util.Scanner;

public class serieSumaPares {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea imprimir: ");
        int n = scanner.nextInt();
        scanner.close();

        g3_imprimirSerie(n);
    }

    public static int g3_sumarNumeroAnterior(int terminoActual, int incremento) {
        return terminoActual + incremento;
    }

    public static void g3_imprimirSerie(int n) {
        int termino = 2; 
        int incremento = 4; 

        for (int i = 0; i < n; i++) {
            System.out.print(termino + " ");
            termino = g3_sumarNumeroAnterior(termino, incremento);
            incremento += 2;
        }
    }

}

