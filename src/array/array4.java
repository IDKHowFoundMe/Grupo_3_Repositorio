package array;

public class array4 {
    private String nombreCompleto = "mauriciolopez"; 

    public void g3_imprimirarray4() {
        int longitud = nombreCompleto.length();
        char[][] matriz = new char[longitud][longitud];

        for (int i = 0; i < longitud; i++) {
            matriz[i][i] = nombreCompleto.charAt(i); 
            matriz[i][longitud - i - 1] = nombreCompleto.charAt(i);
        }

        for (int y = 0; y < longitud; y++) {
            for (int x = 0; x < longitud; x++) {
                if (matriz[y][x] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(matriz[y][x]);
                }
            }
            System.out.println();
        }
    }
}
