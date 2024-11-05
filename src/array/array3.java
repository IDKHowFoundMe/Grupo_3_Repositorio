package array;

public class array3 {
    private String nombre = "mauricio"; 

    public void g3_imprimirarray3() {
        int altura = nombre.length() * 2;

        for (int y = altura; y >= 0; y--) {
            System.out.printf("%2d |", y);

            boolean letra = false;
            for (int x = 0; x < nombre.length(); x++) {
                if (y == 2 * x) {
                    System.out.print(" ".repeat(x * 2) + nombre.charAt(x));
                    letra = true;
                    break;
                }
            }

            if (!letra) {
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.print(" 0 |");
        for (int i = 0; i < nombre.length(); i++) {
            System.out.print("__");
        }
        System.out.println();
    }
}
