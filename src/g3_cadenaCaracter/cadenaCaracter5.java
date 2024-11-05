package g3_cadenaCaracter;

import java.util.Scanner;

public class cadenaCaracter5 {

    public String g3_cadenaCaracter5(String frase) {
        StringBuilder resultado = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                resultado.append(Character.toUpperCase(c));
            } else if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                resultado.append(c);
            } else {
                resultado.append(c);
            }
        }
        return resultado.toString();
    }

    public void g3_imprimircadenaCaracter5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa una frase: ");
        String frase = sc.nextLine();
        System.out.println("La frase ingresada es: \"" + frase + "\"");
        String fraseInvertida = g3_cadenaCaracter5(frase);
        System.out.println("La frase invertida con vocales en mayúsculas es: " + fraseInvertida);
        sc.close();
    }
}