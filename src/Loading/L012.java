package Loading;
import java.util.Random;

public class L012 {
    public int numerobarras;
    public int alturamaxima;
    public int tiempo;

    public L012(){
        this.numerobarras=0;
        this.alturamaxima=0;
        this.tiempo=0;
    }
    public L012(int numerobarras, int alturamaxima, int tiempo){
        this.numerobarras=numerobarras;
        this.alturamaxima=alturamaxima;
        this.tiempo=tiempo;
    }
    public void g3_mostrar(){
        Random random = new Random();
        int[] altura = new int[this.numerobarras]; // Array para almacenar las alturas de las barras

        for (int i = 0; i < this.numerobarras; i++) {
            altura[i] = random.nextInt(this.alturamaxima + 1); 
        }
        for (int nivel= this.alturamaxima; nivel >= 0; nivel--) {
            for (int j = 0; j < this.numerobarras; j++) {
                if (altura[j] > nivel) {
                    System.out.print("= "); 
                } else {
                    System.out.print("  "); 
                }
            }
            this.g3_esperar();
            System.out.println(); // Nueva línea para el siguiente nivel
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
