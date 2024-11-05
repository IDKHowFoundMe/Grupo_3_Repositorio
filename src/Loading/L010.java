package Loading;

import java.util.Random;

public class L010 {
    public int randomnumber;
    public char barra;
    public int tiempo;

    public L010(){
        this.randomnumber=0;
        this.barra=' ';
        this.tiempo=0;
    }
    public L010(int randomnumber, char barra, int tiempo){
        this.randomnumber=randomnumber;
        this.barra=barra;
        this.tiempo=tiempo;
    }
    public void g3_mostrar(){
        int i;
        int j;
        System.out.println("Hola L10");
        Random r = new Random();
        int kb = r.nextInt(100)+10; 
        for(i=1;i<=kb;i++){
            System.out.print("\033[H\033[2J");  
            System.out.flush();  
            System.out.println("Downloading ArchivoArsi.tar" +" "+ kb + " Kb");
            this.g3_esperar();
            for(j=1;j<=i;j++){
                System.out.print("\033[34m─");
                this.g3_esperar(); //Carácter utilizado alt+196
            }
            System.out.print("     " + i + " / " + kb + " Kb");
            this.g3_esperar();
        }
        System.out.print(" Descarga completa!");

    }
    public void g3_esperar(){
        try
        {
            Thread.sleep(this.tiempo);
        }
        catch(InterruptedException ex)
         {
             Thread.currentThread().interrupt();
         }
    }
}
