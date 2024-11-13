package seriesNumericas;

import java.util.Scanner;

public class serieImparYCero{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de numeros que desea imprimir: ");
        int n = scanner.nextInt();
        scanner.close();
        
        g3_imprimirSerieImparYCero(n);
    }

    public static void g3_imprimirSerieImparYCero(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(g3_crearSerieImparYCero(i) + " ");
        }
    }

    public static int g3_crearSerieImparYCero(int a) {
        if (a % 2 == 0) {
            return (a / 2) * 2 + 1;  
        } else {
            return 0;  
        }
    }
}
