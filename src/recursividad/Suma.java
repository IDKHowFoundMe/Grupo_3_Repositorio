package recursividad;
import java.util.Scanner;

public class Suma {
    public int g3_llamarSuma(int numero1, int numero2){
        int suma=0;
        if(numero2 !=0){
            suma = 1+ g3_llamarSuma (numero1, numero2-1);
            return suma;
        }
        return numero1;
    }

    public void g3_imprimirSuma(Scanner sc){
        int numero1=0;
        int numero2=0;
        int resultadoSuma=0;
        System.out.println("Ingrese dos numero para la suma");
        System.out.println("Ingrese el primer termino");
        numero1=sc.nextInt();
        System.out.println("Ingrese el segundo numero ");
        numero2=sc.nextInt();
        resultadoSuma=g3_llamarSuma(numero1, numero2);
        System.out.println("El resultado de la suma es "+resultadoSuma);
    }
}
