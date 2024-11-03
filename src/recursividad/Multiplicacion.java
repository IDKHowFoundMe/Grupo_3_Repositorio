package recursividad;
import java.util.Scanner;

public class Multiplicacion {
    public int g3_llamarMultiplicacion(int numero1, int numero2){
        int multiplicacion=0;
        if(numero1!=0){
            multiplicacion= numero2+g3_llamarMultiplicacion(numero1-1, numero2);
            return multiplicacion;
        }
        return 0;
    }
    public void g3_imprimirMultiplicacion(Scanner sc){
        int numero1=0;
        int numero2=0;
        int producto=0;
        System.out.println("Ingrese dos numero para la multiplicacion");
        System.out.println("Ingrese el primer termino");
        numero1=sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        numero2=sc.nextInt();
        producto=g3_llamarMultiplicacion(numero1, numero2);
        System.out.println("El resultado es "+producto);
    }
    }

