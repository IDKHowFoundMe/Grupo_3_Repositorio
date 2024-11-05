package Loading;

public class L01 {
    //propiedades
    public char simbolo;
    public int valor;
    public int tiempo;


    //constructor
    public L01(){
        this.simbolo =' ';
        this.valor =0;
        this.tiempo=0;
        System.out.println("creando L01");

    }
    public L01(char simbolo, int valor, int tiempo){
        this.simbolo=simbolo;
        this.valor=valor;
        this.tiempo=tiempo;
        System.out.println("creando L01");
    }

    //metodos
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
