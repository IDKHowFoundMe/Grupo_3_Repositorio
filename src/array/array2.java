package array;

import java.util.Scanner;

public class array2 {
    private int tamaño;
    private char caracter;

    public void g3_imprimirarray2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño: ");
        this.tamaño = sc.nextInt();
        System.out.print("Ingrese caracter: ");
        this.caracter = sc.next().charAt(0);
        sc.close();
    }

    public void g3_array2() {
        char[][] matriz = new char[tamaño][tamaño * 3];

        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño * 3; j++) {
                matriz[i][j] = ' ';
            }
        }

        dibujarM(matriz, tamaño, 0);
        dibujarL(matriz, tamaño, tamaño + 1);

        imprimirMatriz(matriz);
    }

    private void dibujarM(char[][] matriz, int tamaño, int offset) {
        for (int i = 0; i < tamaño; i++) {
            matriz[i][offset] = caracter;
            matriz[i][offset + tamaño - 1] = caracter;
            if (i <= tamaño / 2) {
                matriz[i][offset + i] = caracter;
                matriz[i][offset + tamaño - 1 - i] = caracter;
            }
        }
    }

    private void dibujarL(char[][] matriz, int tamaño, int offset) {
        for (int i = 0; i < tamaño; i++) {
            matriz[i][offset] = caracter;
            if (i == tamaño - 1) {
                for (int j = 0; j < tamaño; j++) {
                    matriz[i][offset + j] = caracter;
                }
            }
        }
    }

    private void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < tamaño; i++) {
            for (int j = 0; j < tamaño * 3; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}
