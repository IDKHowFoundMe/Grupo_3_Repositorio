package array;

import java.util.Random;

public class array5 {
    private String nombreCompleto = "mauriciosebastianlopezguerron"; 

    public void g3_imprimirarray5() throws InterruptedException {
        int longitud = nombreCompleto.length();
        char[][] matriz = new char[longitud][longitud];
        Random random = new Random();

        for (int i = 0; i < nombreCompleto.length(); i++) {
            char letra = nombreCompleto.charAt(i);
            int x, y;

            do {
                x = random.nextInt(longitud);
                y = random.nextInt(longitud);
            } while (matriz[y][x] != 0 && matriz[y][x] != letra);

            if (matriz[y][x] == 0) {
                matriz[y][x] = letra;
            } else {
                matriz[y][x] = '*';
            }
        }

        imprimirMatriz(matriz);
    }

    private void imprimirMatriz(char[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz.length; x++) {
                if (matriz[y][x] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(matriz[y][x]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}