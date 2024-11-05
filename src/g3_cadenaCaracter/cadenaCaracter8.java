package g3_cadenaCaracter;
import java.util.Random;
import java.util.Scanner;

public class cadenaCaracter8 {
    private String palabras [] = {"delira", "Ballena", "Alondra", "España", "Enrique"};
    private String anagramas [] = {"lidera", "llenaba", "Ladrona", "apañes", "quieren"};

    public cadenaCaracter8() {
        inicializar();
    }

    private void inicializar() {
        Random random = new Random();
        int indice = random.nextInt(palabras.length);
        String palabraSeleccionada = palabras[indice];
        String anagramaCorrecto = anagramas[indice];
        g3_imprimircadenaCaracter8(palabraSeleccionada, anagramaCorrecto);
    }

    private void g3_imprimircadenaCaracter8(String palabra, String anagramaCorrecto) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Palabra: " + palabra);
        System.out.print("Ingresa un anagrama de la palabra: ");
        String respuestaUsuario = sc.nextLine();
        System.out.println(respuestaUsuario.equalsIgnoreCase(anagramaCorrecto) ? "¡Correcto!" : "Incorrecto. La respuesta correcta es: " + anagramaCorrecto);
        sc.close();
    }
}