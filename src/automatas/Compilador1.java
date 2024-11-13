package automatas;

import java.util.Scanner;
public class Compilador1 {
    public int g3_cambiarCaracterC4(char c){
        if(Character.isLetter(c)){
            return 0;
        };
        if(Character.isDigit(c)){
            return 1;
        };
        if(c=='_'){
            return 2;
        };
        if(c==';'){
            return 3;
        }
        return -1;
    }

    public int g3_construirCompilador1(String declaracion){
    int estado=0;
    char caracter=' ';
    int columna=0;
    int e=-1;
    int mt[][]={
        {1,e,e,e},
        {1,1,2,3},
    };

    for(int i=0; i<declaracion.length(); i++){
        caracter=declaracion.charAt(i);
        columna=g3_cambiarCaracterC4(caracter);
        if(columna==-1 || mt[estado][columna] ==-1){
            return -1;
        }
        estado=mt[estado][columna];
        if(estado==e){
            return -1;
        }
    }
        if(estado==3){
            return 1;
        }
        return -1;
}

    public void g3_imprimirCompilador1(Scanner sc){
        String declaracionIngresada;
        int resutladoVariable=0;
        System.out.println("Ingrese una variable");
        declaracionIngresada=sc.next();
        resutladoVariable=g3_construirCompilador1(declaracionIngresada);
        if(resutladoVariable==1){
            System.out.println("Su variable esta bien decalrada");
        }else{
            System.out.println("Su varaible no esta bien declarada");
        }
    }
}
