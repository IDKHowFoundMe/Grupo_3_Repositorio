package recursividad;
import java.util.Scanner;

public class ConteoRegresivo {
    public int g3_llamarConteroRegresivo(int numeroFinal, int numeroInicial){
        int conteo=0;
        if(numeroFinal<=numeroInicial){
            System.out.print(" "+numeroInicial);
            conteo=g3_llamarConteroRegresivo(numeroFinal, numeroInicial-1);
            return conteo;
        }
        System.out.print(" ");
        return numeroFinal;
    }
    public void g3_imprimirConteroRegresivo(Scanner sc){
        int valorInicial=0;
        System.out.println("Ingrese un valor para el conteo regresivo");
        valorInicial= sc.nextInt();
        g3_llamarConteroRegresivo(0, valorInicial);
    }
}
