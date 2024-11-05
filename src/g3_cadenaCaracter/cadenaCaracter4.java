package g3_cadenaCaracter;

import java.util.Scanner;

public class cadenaCaracter4 {

    public String g3_cadenaCaracter4(String frase, char letra) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char l = frase.charAt(i);
            if (l != letra) {
                resultado.append(l);
            }
        }
        return resultado.toString();
    }

    public void g3_imprimircadenaCaracter4() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa una frase: ");
        String frase = sc.nextLine();
        System.out.print("ingresa la letra a eliminar: ");
        char letra = sc.nextLine().charAt(0);
        System.out.println("La frase ingresada es: \"" + frase + "\"");
        String fraseSinLetra = g3_cadenaCaracter4(frase, letra);
        System.out.println("La frase sin la letra '" + letra + "' es: " + fraseSinLetra);
        sc.close();
    }
}