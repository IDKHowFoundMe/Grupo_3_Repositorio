package g3_cadenaCaracter;
import java.util.Scanner;

public class cadenaCaracter2{
    public int g3_cadenaCaracter2(String frase) {
        int contador2 = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (Character.isLetter(c)) {
                contador2++;
            }
        }
        return contador2;
    }

    public void g3_imprimircadenaCaracter2() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa una frase: ");
        String frase = sc.nextLine();

        int cantidadLetras = g3_cadenaCaracter2(frase);
        System.out.println("La cantidad de letras en la frase es: " + cantidadLetras);

        sc.close();
    }
}