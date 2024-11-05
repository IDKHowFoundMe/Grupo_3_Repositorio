package Loading;

public class L06 {
    public String simbolo;
    public int tiempo;

    public L06(){
        this.simbolo=" ";
        this.tiempo=0;
    }
    public L06(String simbolo, int tiempo){
        this.simbolo=simbolo;
        this.tiempo=tiempo;
    }
    public void g3_mostrar(){
        int i,j;
        for(i=1; i<=20; i++){
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.print("[");
            for(j=1; j<=i; j++){
                
                
                if (j==i) {
                    System.out.print(this.simbolo="<=>");
                }
                else{
                    System.out.print(" ");
                }
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
