package Loading;

public class L07 {
    public char simbolo;
    public int valor;
    public int tiempo;

    public L07(){
        this.simbolo =' ';
        this.valor =0;
        this.tiempo=0;
    }
    public L07(char simbolo, int valor, int tiempo){
        this.simbolo=simbolo;
        this.valor=valor;
        this.tiempo=tiempo;
        System.out.println("creando L02");
    }
    public void g3_mostrar(){
        char simbolo[]={'\\', '|', '/', '-', '\\', '|','/','-'};
        int i,j,k;
        k=0;
        for(i=1; i<=20; i++){
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.print("[");
            for(j=1; j<=i; j++){
             
                System.out.print("=");
            }

            System.out.print(simbolo[k]);
            if (k<7) {
                k++;
            }
            else{
                k=0;
            }
            System.out.print("] ");
            System.out.println(i*5+"%");
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
