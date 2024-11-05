package g3_cadenaCaracter;
import java.util.Scanner;

public class cadenaCaracter7 {

    public String g3_cadenaCaracter7(String frase) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (c != 'J' && c != 'j') {
                resultado.append(Character.toUpperCase(c));
            }
        }
        return resultado.toString();
    }

    public void g3_imprimircadenaCaracter7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa una frase: ");
        String frase = scanner.nextLine();
        System.out.println("La frase ingresada es: \"" + frase + "\"");
        String fraseConvertida = g3_cadenaCaracter7(frase);
        System.out.println("La frase en mayúsculas y sin 'J' es: " + fraseConvertida);
        scanner.close();
    }
}