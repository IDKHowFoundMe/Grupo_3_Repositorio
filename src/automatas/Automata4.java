package automatas;

import java.util.Scanner;

public class Automata4 {
    public int g3_cambiarCaracter4(char c){
            switch (c) {
                case '1': 
                    return 0;
                case '0':
                    return 1;
                default:
                    return -1;
            }
        }
        public int g3_llamarAutomata4(String automata1){
            int estadoInicial=0;
            int columna=0;
            char caracter=' ';
            int e= -1;
            int mt[][]={
                        {1,2,},
                        {1,e,},
                        {3,2},
                        {3,e},
                        
                    }; 
            for(int i=0; i<automata1.length(); i++){
                caracter=automata1.charAt(i);
                columna= g3_cambiarCaracter4(caracter);
                if(columna==-1|| mt[estadoInicial][columna]==e){
                    return -1;
                }
                estadoInicial=mt[estadoInicial][columna];
            }
            if(estadoInicial==1 || estadoInicial==3){
            return 2;
            }
            return -1;
        }
    
        public void g3_imprimirAutomata4(Scanner sc){
            System.out.println("Ingrese un numero de 0 y 1");
            String automata1 =sc.next();
            int resultado = g3_llamarAutomata4(automata1);
            if(resultado==2){
                System.out.println("El numero es correcto");
            }else{
                System.out.println("El numero es incorrecto");
            }
        }
    }
