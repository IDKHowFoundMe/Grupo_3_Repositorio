package g3_cadenaCaracter;
import java.util.Scanner;
public class cadenaCaracter9 {
    private String g3_cadenaCaracter9(String frase) {
        StringBuilder resultado = new StringBuilder();
        
        for (int i = 0; i < frase.length(); i++) {
            char letra = frase.charAt(i);
            if (i % 2 == 0) { 
                resultado.append(Character.toUpperCase(letra));
            } else { 
                resultado.append(Character.toLowerCase(letra));
            }
        }
        
        return resultado.toString();
    }

    public void g3_imprimircadenaCaracter9() {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Ingresa una frase: ");
        String frase = sc.nextLine();
        String fraseConvertida = g3_cadenaCaracter9(frase);
        System.out.println("Frase convertida: " + fraseConvertida);
        sc.close();
    }
}
