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
import g3_cadenaCaracter.cadenaCaracter1;
import g3_cadenaCaracter.cadenaCaracter2;
import g3_cadenaCaracter.cadenaCaracter3;
import g3_cadenaCaracter.cadenaCaracter4;
import g3_cadenaCaracter.cadenaCaracter5;
import g3_cadenaCaracter.cadenaCaracter6;
import g3_cadenaCaracter.cadenaCaracter7;
import g3_cadenaCaracter.cadenaCaracter8;
import g3_cadenaCaracter.cadenaCaracter9;
import array.array1;
import array.array1;
import array.array2;
import array.array3;
import array.array4;
import array.array5;
import figuras.FIGURAS_MATIAS_MORILLO;

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

        cadenaCaracter1 cadena = new cadenaCaracter1();
        cadena.g3_imprimircadenaCaracter1();

        cadenaCaracter2  cadena2 = new cadenaCaracter2();
        cadena2.g3_imprimircadenaCaracter2();

        cadenaCaracter3 cadena3 = new cadenaCaracter3();
        cadena3.g3_imprimircadenaCaracter3();

        cadenaCaracter4 cadena4 =  new cadenaCaracter4();
        cadena4.g3_imprimircadenaCaracter4();

        cadenaCaracter5 cadena5 = new cadenaCaracter5();
        cadena5.g3_imprimircadenaCaracter5();

        cadenaCaracter6 cadeba6 =  new cadenaCaracter6();
        cadeba6.g3_imprimircadenaCaracter6();

        cadenaCaracter7 cadena7 = new cadenaCaracter7();
        cadena7.g3_imprimircadenaCaracter7();

        new cadenaCaracter8();

        cadenaCaracter9 cadena9 =  new cadenaCaracter9();
        cadena9.g3_imprimircadenaCaracter9();

        array1 g3_array1 = new array1();
        g3_array1.g3_imprimirarray1();

        array2 arreglo = new array2();
        arreglo.g3_imprimirarray2();
        arreglo.g3_array2();

        array3 arreglo2 = new array3();
        arreglo2.g3_imprimirarray3();

        array4 arreglo4 =  new array4();
        arreglo4.g3_imprimirarray4();

        try {
            array5 matrizAleatoria = new array5();
            matrizAleatoria.g3_imprimirarray5();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}
