package Loading;

public class L02 {
    public char caracter;
    public int tiempo;

    public L02(){
        this.caracter =' ';
        this.tiempo=0;
    }
    public L02(char caracter,int tiempo){
        this.caracter=caracter;
        this.tiempo=tiempo;
        System.out.println("creando L02");
    }
    public void g3_mostrar(){
        int i,j;
        for(i=1; i<=20; i++){
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.print("[");
            for(j=1; j<=i; j++){
             
                System.out.print(this.caracter);
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


