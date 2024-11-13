package seriesNumericas;

import java.util.Scanner;

public class serieNumerosPrimos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea imprimir: ");
        int n = scanner.nextInt();
        scanner.close();

        g3_imprimirSeriePrimos(n);
    }

    public static boolean g3_validarPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void g3_imprimirSeriePrimos(int n) {
        int contador = 0; 
        int a = 2;  

        while (contador < n) {
            if (g3_validarPrimo(a)) {
                System.out.print(a + " ");
                contador++;
            }
            a++;
        }
    }

   
}







