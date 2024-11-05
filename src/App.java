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
import java.util.Random;
import java.util.Scanner;
import Loading.L01;
import Loading.L02;
import Loading.L03;
import Loading.L04;
import Loading.L05;
import Loading.L06;
import Loading.L07;
import Loading.L08;
import Loading.L09;
import Loading.L010;
import Loading.L011;
import Loading.L012;
import Loading.L013;


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
        int op=0;
        int i=0;
        Scanner scanner = new Scanner(System.in);
        @SuppressWarnings("resource")
        Scanner teclado=new Scanner(System.in);
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
         System.out.println("Menú Delay");
        System.out.println("Ingrese una opción: ");
        do {

            System.out.println("1 - AppL01");
            System.out.println("2 - AppL02");
            System.out.println("3 - AppL03");
            System.out.println("4 - AppL04");
            System.out.println("5 - AppL05");
            System.out.println("6 - AppL06");
            System.out.println("7 - AppL07");
            System.out.println("8 - AppL08");
            System.out.println("9 - AppL09");
            System.out.println("10 - AppL010");
            System.out.println("11 - AppL011");
            System.out.println("12 - AppL012");
            System.out.println("13 - AppL013");
    
            op=Integer.parseInt(teclado.next());
        }while (op>13);               
       
        switch(op){
            case 1: 
                L01 l01=new L01();
                l01.tiempo=100;
                //int i=0;
                while(i<=100){
                    l01.simbolo='\\';
                    l01.valor=i;
                    l01.g3_mostrar();
                    l01.g3_esperar();
                    i++;
                    l01.simbolo='|';
                    l01.valor=i;
                    l01.g3_mostrar();
                    l01.g3_esperar();
                    i++;
                    l01.simbolo='/';
                    l01.valor=i;
                    l01.g3_mostrar();
                    l01.g3_esperar();
                    i++;
                    l01.simbolo='-';
                    l01.valor=i;
                    l01.g3_mostrar();
                    l01.g3_esperar();
                    i++;
                    l01.simbolo='\\';
                    l01.valor=i;
                    l01.g3_mostrar();
                    l01.g3_esperar();
                    i++;
                    l01.simbolo='|';
                    l01.valor=i;
                    l01.g3_mostrar();
                    l01.g3_esperar();
                    i++;
                    l01.simbolo='/';
                    l01.valor=i;
                    l01.g3_mostrar();
                    l01.g3_esperar();
                    i++;
                    l01.simbolo='-';
                    l01.valor=i;
                    l01.g3_mostrar();
                    l01.g3_esperar();
                    i++;
                }
                System.exit(1);

            case 2: 
                L02 l02=new L02();
                //Scanner scanner = new Scanner(System.in);
                System.out.print("Ingresa un carácter: ");
                char caracter = scanner.next().charAt(0);     
                scanner.close();
        
                l02.caracter=caracter;
                l02.tiempo=1000;
                l02.g3_mostrar();
                System.exit(1);


            case 3: 
                L03 l03=new L03();
                //Scanner scanner = new Scanner(System.in);
                System.out.print("Ingresa un carácter: ");
                char caracter3 = scanner.next().charAt(0);     
                scanner.close();
                l03.caracter=caracter3;
                l03.tiempo=1000;
                l03.g3_mostrar();
                l03.g3_esperar();
                System.exit(1);

            case 4:
                L04 l04=new L04();
                l04.tiempo=100;
                //int i=0;
                while(i<=100){
                    l04.simbolo="0oo";
                    l04.valor=i;
                    l04.g3_mostrar();
                    l04.g3_esperar();
                    i++;
                    l04.simbolo="o0o";
                    l04.valor=i;
                    l04.g3_mostrar();
                    l04.g3_esperar();
                    i++;
                    l04.simbolo="oo0";
                    l04.valor=i;
                    l04.g3_mostrar();
                    l04.g3_esperar();
                    i++;
                    l04.simbolo="o0o";
                    l04.valor=i;
                    l04.g3_mostrar();
                    l04.g3_esperar();
                    i++;
                }    
                System.exit(1);

            case 5:
                L05 l05=new L05();
                l05.tiempo=1000;
                l05.g3_mostrar();
                l05.g3_esperar();
                System.exit(1);

            case 6:
                L06 l06=new L06();
                l06.tiempo=1000;
                l06.g3_mostrar();  
                System.exit(1);  

            case 7:
                L07 l07=new L07();
                l07.tiempo=1000;
                l07.g3_mostrar();
                l07.g3_esperar(); 
                System.exit(1);   

            case 8:
                L08 l08=new L08();
                l08.tiempo=1000;
                l08.g3_pedirnombres();
                l08.g3_mostrar();
                System.exit(1);
             
            case 9:
                L09 l09=new L09();
                l09.tiempo=1000;
                l09.g3_pedirnombres();
                l09.g3_mostrar();
                System.exit(1);

            case 10:
                L010 l010=new L010();
                l010.tiempo=1000;
                System.out.println("Hola L10");
                Random r = new Random();
                int kb = r.nextInt(100)+10; //Genera número randómico entre 10 y 100
                System.out.println("Número generado" +" "+ kb);
                l010.g3_esperar();
                l010.g3_mostrar();
                l010.g3_esperar();
                System.exit(1);
            
            case 11:
                L011 l011=new L011();
                l011.tiempo=1000;
                l011.g3_mostrar();
                l011.g3_esperar();   
                System.exit(1); 

            case 12: 
                L012 l012=new L012();
                l012.numerobarras=10;
                l012.alturamaxima=8;
                l012.tiempo=1000;
                l012.g3_mostrar();
                System.exit(1);

            case 13:
                L013 l013=new L013();
                l013.tiempo=100;
                l013.g3_mostrar();
                System.exit(1);

            }//fin switch

    }
}
