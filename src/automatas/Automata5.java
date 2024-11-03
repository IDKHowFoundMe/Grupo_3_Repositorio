package automatas;
import java.util.Scanner;

public class Automata5 {
    public int g3_llamarAutomata5(float numero) {
        if (numero%1==0) {
            return 1;
        }
        return -1;
    }

    public void g3_imprimirAutomata4(Scanner sc) {
        System.out.println("Ingrese un número entero o decimal(use coma)");
        float numero = sc.nextFloat();
        int resultado = g3_llamarAutomata5(numero);
        if (resultado==1) {
            System.out.println("El número es entero");
        } else {
            System.out.println("El número es decimal");
        }
    }
}

