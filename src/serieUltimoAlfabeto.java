package seriesCaracteres;

import java.util.Scanner;

public class serieUltimoAlfabeto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de letras que desea imprimir: ");
        int n = scanner.nextInt();
        scanner.close();

        g3_imprimirSerieLetras(n);
    }

    public static String g3_generarLetraRepetida(int indice) {
        char letra = (char) ('a' + indice);  
        int repeticiones = indice + 1;       

        StringBuilder resultado = new StringBuilder();
        for (int j = 0; j < repeticiones; j++) {
            resultado.append(letra);
        }
        return resultado.toString();
    }

    public static void g3_imprimirSerieLetras(int n) {
        for (int i = 0; i < n; i++) {
            String letraRepetida = g3_generarLetraRepetida(i);
            System.out.print(letraRepetida + " ");
        }
    }

}

