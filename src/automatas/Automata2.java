package automatas;

import java.util.Scanner;

public class Automata2 {
    public int g3_cambiarCaracter2(char c){
        switch (c) {
            case 'a': 
                return 0;
            case 'b':
                return 1;
            case 'c':
                return 2;
            default:
                return -1;
        }
    }
    public int g3_llamarAutomata2(String automata1){
        int estadoInicial=0;
        int columna=0;
        char caracter=' ';
        int e= -1;
        int mt[][]={
                    {1,e,e,},
                    {e,2,e,},
                    {e,2,3,},
                    {4, e,e},
                    {e,e,e},
                }; 
        for(int i=0; i<automata1.length(); i++){
            caracter=automata1.charAt(i);
            columna= g3_cambiarCaracter2(caracter);
            if(columna==-1|| mt[estadoInicial][columna]==e){
                return -1;
            }
            estadoInicial=mt[estadoInicial][columna];
        }
        if(estadoInicial != 3){
        return -1;
        }
        return 2;
    }

    public void g3_imprimirAutomata2(Scanner sc){
        System.out.println("Ingrese una palabra con a b c a");
        String automata1 =sc.next();
        int resultado = g3_llamarAutomata2(automata1);
        if(resultado==2){
            System.out.println("La palabra si es correcta");
        }else{
            System.out.println("La palabra es incorecta");
        }
    }
}

