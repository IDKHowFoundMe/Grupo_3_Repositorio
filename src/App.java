import recursividad.Factorial;
import recursividad.Suma;
import recursividad.Multiplicacion;
import recursividad.Potencia;
import recursividad.ConteoProgresivo;
import recursividad.ConteoRegresivo;
import java.util.Scanner;
import automatas.Automata1;
import automatas.Automata2;
import automatas.Automata3;
import automatas.Automata4;
import automatas.Automata5;
import automatas.Compilador1;
import automatas.Validador;
import automatas.Validador2;
public class Grupo3 {
    public Grupo3() {
        System.out.println("Grupo 3");
        System.out.println("Los integrantes:");
        System.out.println("Lopez Sebastian");
        System.out.println("Montenegro Letizia");
        System.out.println("Morales Alejandro");
        System.out.println("Moreno Emilia");
        System.out.println("Morillo Matias");
    }
}
public class App {
    public static Scanner sc= new Scanner (System.in);
    public static void main(String[] args) throws Exception {
        new Grupo3();
        Factorial oF = new Factorial();
        oF.g3_imprimirFactorial(sc);
        Suma oS = new Suma();
        oS.g3_imprimirSuma(sc);
        Multiplicacion oM= new Multiplicacion();
        oM.g3_imprimirMultiplicacion(sc);
        Potencia oP = new Potencia();
        oP.g3_imprimirPotencia(sc);
        ConteoProgresivo oCP= new ConteoProgresivo();
        oCP.g3_imprimirConteoProgresivo(sc);
        System.out.println("");
        ConteoRegresivo oCR= new ConteoRegresivo();
        oCR.g3_imprimirConteroRegresivo(sc);
        Automata1 oA1= new Automata1();
        oA1.g3_imprimirAutomata1(sc);
        Automata2 oA2= new Automata2();
        oA2.g3_imprimirAutomata2(sc);
        Automata3 oA3= new Automata3();
        oA3.g3_imprimirAutomata3(sc);
        Automata4 oA4= new Automata4();
        oA4.g3_imprimirAutomata4(sc);
        Automata5 oA5= new Automata5();
        oA5.g3_imprimirAutomata4(sc);
        Compilador1 oC1= new Compilador1();
        oC1.g3_imprimirCompilador1(sc);
        Validador oV= new Validador();
        oV.g3_validarEntrada(sc);
        Validador2 oV2= new Validador2();
        oV2.g3_imprimirContraseña(sc);

        System.out.print("Ingresa el tamaño del cuadrado: ");
        int tamano = scanner.nextInt();
        
        FIGURAS_MATIAS_MORILLO cuadrado = new FIGURAS_MATIAS_MORILLO();
        cuadrado.imprimirCuadrado(tamano);
        
        scanner.close();
        
    }
}
