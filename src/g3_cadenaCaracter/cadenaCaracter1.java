package g3_cadenaCaracter;

import java.util.Scanner;

public class cadenaCaracter1 {
    
    public int g3_cadenaCaracter1(String frase) {
        int contador1 = 0;
        frase = frase.toLowerCase();

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contador1++;
            }
        }

        return contador1;
    }

    public void g3_imprimircadenaCaracter1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa una frase: ");
        String frase = sc.nextLine();

        int cantidadVocales = g3_cadenaCaracter1(frase);
        System.out.println("La cantidad de vocales en la frase es: " + cantidadVocales);

        sc.close();
    }
}
