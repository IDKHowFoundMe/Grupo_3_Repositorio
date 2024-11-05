package g3_cadenaCaracter;
import java.util.Scanner;

public class cadenaCaracter6 {

    public String g3_cadenaCaracter6(String frase) {
        StringBuilder resultado = new StringBuilder();
        for (int i = frase.length() - 1; i >= 0; i--) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    resultado.append(Character.toLowerCase(c)); 
                } else {
                    resultado.append(Character.toUpperCase(c)); 
                }
            } else {
                resultado.append(c); 
            }
        }
        return resultado.toString();
    }


    public void g3_imprimircadenaCaracter6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa una frase: ");
        String frase = sc.nextLine();
        System.out.println("La frase ingresada es: \"" + frase + "\"");
        String fraseInvertida = g3_cadenaCaracter6(frase);
        System.out.println("La frase invertida con consonantes en mayúsculas es: " + fraseInvertida);
        sc.close();
    }
}