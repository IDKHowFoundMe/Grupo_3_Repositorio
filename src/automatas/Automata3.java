package automatas;
import java.util.Scanner;

public class Automata3 {
        public int g3_cambiarCaracter3(char c){
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
        public int g3_llamarAutomata3(String automata1){
            int estadoInicial=0;
            int columna=0;
            char caracter=' ';
            int e= -1;
            int mt[][]={
                        {1,1,1,},
                        {1,1,1,},
                        
                    }; 
            for(int i=0; i<automata1.length(); i++){
                caracter=automata1.charAt(i);
                columna= g3_cambiarCaracter3(caracter);
                if(columna==-1|| mt[estadoInicial][columna]==e){
                    return -1;
                }
                estadoInicial=mt[estadoInicial][columna];
            }
            if(estadoInicial==0  || estadoInicial==2 || estadoInicial==1){
            return 2;
            }
            return -1;
        }
    
        public void g3_imprimirAutomata3(Scanner sc){
            System.out.println("Ingrese una palabra con a b c");
            String automata1 =sc.next();
            int resultado = g3_llamarAutomata3(automata1);
            if(resultado==2){
                System.out.println("La palabra si es correcta");
            }else{
                System.out.println("La palabra es incorecta");
            }
        }
    }

