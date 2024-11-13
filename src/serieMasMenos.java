package seriesCaracteres;

import java.util.Scanner;

public class serieMasMenos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de caracteres que desea imprimir: ");
        int n = scanner.nextInt();
        scanner.close();

        g3_imprimirSerieMasMenos(n);
    }

    public static String g3_generarSigno(int i) {
        return (i % 2 == 0) ? "+" : "-";
    }

    public static void g3_imprimirSerieMasMenos(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(g3_generarSigno(i) + " ");
        }
    }

}

