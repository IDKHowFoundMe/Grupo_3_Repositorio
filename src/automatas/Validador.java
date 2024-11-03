package automatas;
import java.util.Scanner;

public class Validador {
    public int g3_cambiardeCharacter(char c){
        switch (c) {
            case 'f':
                return 0;
            case 'o':
                return 1;
            case'r':
                return 2;
            case 'i':
                return 3;
            case 'e':
                return 4;
            case 'l':
                return 5;
            case's':
                return 6;
            case 'h':
                return 7;
            case '(':
                return 8;
            default:
                return -1;
        }
    }

    public int g3_validarPalabra(String entrada) {
        int estado= 0;
        int columna=0;
        int mt[][]= {
            {1, -1, -1, 4, -1, -1, -1, -1, -1},
            {-1, 2, -1, -1, -1, -1, -1, -1, 9},
            {-1, -1, 3, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, -1, -1, 9},
            {5, -1, -1, -1, -1, -1, -1, -1, -1},
            {-1, -1, -1, -1, 6, -1, -1, -1, 9},
            {-1, -1, -1, -1, -1, 7, -1, -1, -1},
            {-1, -1, -1, -1, -1, -1, 8, -1, 9},
            {-1, -1, -1, -1, -1, -1, -1, -1, 9},
        };
        for (int i = 0; i<entrada.length(); i++) {
            columna=g3_cambiardeCharacter(entrada.charAt(i));
            if (columna==-1 || mt[estado][columna] ==-1) {
                return -1;
            }
            estado = mt[estado][columna];
        }
        if (estado== 9){
            return 1;
        }
        return -1;
    }

    public void g3_validarEntrada(Scanner sc) {
        System.out.println("Ingrese en inicio de un comando bucle ejemplo if(");
        String entrada = sc.next();
        int resultado = g3_validarPalabra(entrada);
        if (resultado ==1) {
            System.out.println("Bucle validado.");
        } else {
            System.out.println("Bucle no validado");
        };
    };
}


