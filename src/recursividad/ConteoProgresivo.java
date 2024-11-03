package recursividad;

import java.util.Scanner;

public class ConteoProgresivo {
    public int g3_llamarConteoProgresivo(int numeroInicial,int limite){
        int conteo=0;
        if(numeroInicial<=limite){
            System.out.print(" "+numeroInicial);
            conteo=g3_llamarConteoProgresivo(numeroInicial+1, limite);
            return conteo;
        }
        System.out.print(" ");
        return limite;
    }
    public void g3_imprimirConteoProgresivo(Scanner sc){
        int limiteConteo=0;
        System.out.println("Ingrese un limite para el conteo progresivo");
        limiteConteo = sc.nextInt();
        g3_llamarConteoProgresivo(0, limiteConteo);
        
    }
}
