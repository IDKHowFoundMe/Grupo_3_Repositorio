package automatas;
import java.util.Scanner;

public class Validador2 {
    public int g3_cambiarCaracterClave(char c) {
        if (c>= 65 && c<=90){
            return 0;}
        if(c>=97 && c<=122){
            return 1;}
        if(c>=48 && c<=57){
            return 2;}
        if((c>=33 && c<=47) || (c>= 58 && c<= 64) || (c>= 91 && c<=96) || (c>=123 && c<= 126)){ 
            return 3;
        }
            return -1;
        }


        public int g3_validarContraseña(String contraseña) {
            int estado= 0;
            int columna=0;
            int e=-1;
            int[][] mt = {
                {1, 2, 3, 4, e},
                {1, 5, 5, 5, e},
                {5, 2, 5, 5, e},
                {5, 5, 3, 5, e},
                {5, 5, 5, 4, e},
                {5, 5, 5, 5, e},
            };
    
            for (int i=0; i<contraseña.length(); i++) {
                columna= g3_cambiarCaracterClave(contraseña.charAt(i));
                if (columna ==4|| mt[estado][columna]==e) {
                    return -1;
                }
                estado= mt[estado][columna];
            }
            if(estado!=5){
                return -1;
            }
            return 1;
            
        }
    
        public void g3_imprimirContraseña(Scanner sc) {
            System.out.println("Ingrese una contraseña");
            String contraseña= sc.next();
            int resultado= g3_validarContraseña(contraseña);
            if (resultado==1) {
                System.out.println("Su contraseña si es valida");
            }else{
                System.out.println("Su contraseña no es valida");
            }
        }
    
    }


