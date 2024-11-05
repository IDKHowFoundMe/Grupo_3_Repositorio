package figuras;

public class FIGURAS_MATIAS_MORILLO {

    public void imprimirCuadrado(int tamano) {

        System.out.println("Figura 1:");

        System.out.println("Nivel: "+tamano);
        
        for (int f = 0; f < tamano; f++) {
            
            for (int c = 0; c < tamano; c++) {
                
                if (f == 0 || f == tamano - 1 || c == 0 || c == tamano - 1) {
                    System.out.print("* ");
                } else {  
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Figura 2:");

        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {

            for (int c = 0; c < tamano; c++) {
                
                if (f == 0 || f == tamano - 1 || c == 0 || c == tamano - 1) {
                    
                    if ((f + c) % 2 == 0) {
                        System.out.print("* ");
                    } else {
                        System.out.print("+ ");
                    }
                } else {  
                    System.out.print("  "); 
                }
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Figura 3:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {

            for (int c = 0; c <= f; c++) {
                System.out.print("* ");
            }
            System.out.println();  
        }
        System.out.println();

        System.out.println("Figura 4:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {

            for (int esp = 0; esp < tamano - f - 1; esp++) {
                System.out.print("  ");
            }

            for (int c = 0; c <= f; c++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
        System.out.println();

        System.out.println("Figura 5:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {
            
            for (int esp = 0; esp < f; esp++) {
                System.out.print("  ");
            }
            
            for (int c = 0; c < (tamano - f) * 2 - 1; c++) {
                System.out.print("* ");
            }
            System.out.println(); 
        }
        System.out.println();

        System.out.println("Figura 6:");
        
        System.out.println("Nivel: "+tamano);
        for (int f = 0; f < tamano; f++) {
            
            for (int esp = 0; esp < tamano - f - 1; esp++) {
                System.out.print("  ");
            }
            
            for (int c = 0; c < (f * 2) + 1; c++) {
                System.out.print("* ");
            }
            System.out.println();  
        }
        System.out.println();

        System.out.println("Figura 7:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {
            
            for (int esp = 0; esp < f * 3; esp++) {
                System.out.print(" ");
            }
            
            System.out.println("|___");
        }
        System.out.println();

        System.out.println("Figura 8:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {
            
            for (int esp = 0; esp < (tamano - f - 1) * 3; esp++) {
                System.out.print(" ");
            }
            
            System.out.println("___|");
        }
        System.out.println();

        System.out.println("Figura 9:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {
            
            for (int esp = 0; esp < (tamano - f - 1) * 3; esp++) {
                System.out.print(" ");
            }
            
            System.out.print("___|");

            System.out.print("   ");
            
            for (int esp = 0; esp < f * 6; esp++) {
                System.out.print(" ");
            }
            
            System.out.println("|___");
        }
        System.out.println();

        System.out.println("Figura 10:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {
            
            for (int esp = 0; esp < f * 5; esp++) {
                System.out.print(" ");
            }
            
            if (f % 2 == 0) {
                System.out.println("|_+_");
            } else {
                System.out.println("|_-_");
            }
        }
        System.out.println();

        System.out.println("Figura 11:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {
            
            for (int esp = 0; esp < f * tamano/1.5; esp++) {
                System.out.print(" ");
            }

            System.out.print("|");

            for (int g = 0; g <= f; g++) {
                System.out.print("_");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Figura 12:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = tamano; f > 0; f--) { 

            for (int c = 1; c <= f; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Figura 13:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 1; f <= tamano; f++) {

            for (int c = 1; c <= f; c++) {
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Figura 14:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {
            
            for (int esp = 0; esp < tamano - f; esp++) {
                System.out.print(" ");
            }
            
            int num = 1;

            for (int c = 0; c <= f; c++) {
                System.out.print(num + " ");
                num = num * (f - c) / (c + 1);
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("Figura 15:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {

            int num = 1;
            
            for (int c = 0; c <= f; c++) {
                System.out.print(num + " ");
                num = num * (f - c) / (c + 1);
            }
            System.out.println(); 
        }
        System.out.println();

        System.out.println("Figura 16:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {
            if (f == 0 || f == 4) {
                
                System.out.println("    +                      +");
            } else if (f == 1 || f == 3) {
                
                System.out.println("           -           -");
            } else if (f == 2) {
                
                System.out.println("                 +");
            }
        }
        System.out.println();

        System.out.println("Figura 17:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {
            if (f == 0 || f == 4) {
                
                System.out.println("    1                      1");
            } else if (f == 1 || f == 3) {
                
                System.out.println("           0           0");
            } else if (f == 2) {
                
                System.out.println("                 1");
            }
        }
        System.out.println();

        System.out.println("Figura 18:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 1; f <= tamano; f++) {
            int[] fila = new int[f];

            fila[0] = 1;

            System.out.print("1 ");

            for (int c = 1; c < f - 1; c++) {
                fila[c] = fila[c - 1] * (f - c) / c;
                System.out.print(fila[c] + " ");
            }

            if (f > 1) {
                System.out.print("2"); 
            }

            System.out.println();
        }
        System.out.println();

        System.out.println("Figura 19:");
        
        System.out.println("Nivel: "+tamano);

        for (int f = 0; f < tamano; f++) {

            System.out.print("* "); 
            
            int num = 1;
            
            for (int c = 1; c < f; c++) {
                num = num * (f - c + 1) / c;  
                System.out.print(num + " ");
            }
            
            if (f > 0) {
                System.out.print("*"); 
            }
            
            System.out.println(); 
        }
    }
}