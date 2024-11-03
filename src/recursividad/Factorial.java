package recursividad;
import java.util.Scanner;
public class Factorial {
    public int g3_llamarFactorial(int datoIngresado){
        int datoFactorial;
        if(datoIngresado != 1){
            datoFactorial=datoIngresado*g3_llamarFactorial(datoIngresado-1);
            return datoFactorial;
        }
            return 1;
        }
    public void g3_imprimirFactorial(Scanner sc){
        int numero=0;
        int resultado=0;
        System.out.println("Ingrese un numero para la factorial");
        numero=sc.nextInt();
        resultado= g3_llamarFactorial(numero);
        System.out.println("El resultado factorial es "+resultado);
    }
    }


