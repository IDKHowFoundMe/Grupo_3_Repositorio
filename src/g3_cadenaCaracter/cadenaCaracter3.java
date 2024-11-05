package g3_cadenaCaracter;

import java.util.Scanner;

public class cadenaCaracter3 {

    public String g3_cadenaCaracter3(String frase, char vocal) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < frase.length(); i++) {
            char a = frase.charAt(i);
            if (a != vocal) {
                resultado.append(a);
            }
        }
        return resultado.toString();
    }

    public void g3_imprimircadenaCaracter3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("ingresa una frase: ");
        String frase = sc.nextLine();
        System.out.print("ingresa la vocal a eliminar: ");
        char vocal = sc.nextLine().charAt(0);
        System.out.println("La frase ingresada es: \"" + frase + "\"");
        String fraseSinVocal = g3_cadenaCaracter3(frase, vocal);
        System.out.println("La frase sin la vocal '" + vocal + "' es: " + fraseSinVocal);
        sc.close();
    }
}