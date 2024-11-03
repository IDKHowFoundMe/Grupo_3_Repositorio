package recursividad;

import java.util.Scanner;

public class Potencia {
    public int g3_llamarPotencia(int exponente, int base){
        int potencia=0;
        if(exponente!=1 && exponente!=0){
            potencia= base*g3_llamarPotencia(exponente-1, base);
            return potencia;
        }
        if(exponente==1){
            return base;
        }
        return 0;
    }
    public void g3_imprimirPotencia(Scanner sc){
        int exponente=0;
        int base=0;
        int potencia=0;
        System.out.println("Ingrese dos numeros para la potencia");
        System.out.println("Ingrese el exponente");
        exponente =sc.nextInt();
        System.out.println("Ingrese la base de la potencia");
        base= sc.nextInt();
        potencia=g3_llamarPotencia(exponente, base);
        System.out.println("El resultado de la potencia es "+potencia);
    }
    }
