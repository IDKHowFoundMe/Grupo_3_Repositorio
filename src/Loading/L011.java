package Loading;

import java.util.Random;

public class L011 {
    public int tiempo;
    public int aleatorio;
    
    public L011(){
        this.tiempo=0;
        this.aleatorio=0;
    }
    public L011(int tiempo, int aleatorio){
        this.tiempo=tiempo;
        this.aleatorio=aleatorio;
    }
    public void g3_mostrar(){
        int i,j,k;
        this.g3_esperar();
        System.out.print("\033[H\033[2J");  
        System.out.flush();
        for(i=0;i<50;i++){
            Random r = new Random(System.currentTimeMillis());
            this.aleatorio = r.nextInt(10);
            for(k=1;k<=10-this.aleatorio;k++)
                System.out.print(" ");
            for(j=1;j<=this.aleatorio;j++)
                System.out.print("\033[34m-");
            System.out.print("|");
            for(j=1;j<=this.aleatorio;j++)
                System.out.print("\033[34m-");
            System.out.println("");
            this.g3_esperar();
        }
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
