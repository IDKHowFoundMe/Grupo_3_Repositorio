package Loading;

public class L04 {
    public String simbolo;
    public int valor;
    public int tiempo;

    public L04(){
        this.simbolo=" ";
        this.valor=0;
        this.tiempo=0;
        
    }
    public L04(String simbolo,int valor, int tiempo){
        this.simbolo=simbolo;
        this.tiempo=tiempo;
        this.valor=valor;
        System.out.println("creando L04");
    }
    public void g3_mostrar(){
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        System.out.println(this.simbolo + " " + this.valor + "%");
        if(this.valor<100){
                System.out.print("\033[H\033[2J");  
                System.out.flush();  
                System.out.println(simbolo+" "+valor+"%");
        }else{System.out.println("Carga Completa!");
        System.exit(1);
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
