package Loading;

import java.util.Scanner;

public class L08 {
    public String nombreapellidos;
    public int tiempo;
    
    public L08(){
        this.nombreapellidos=" ";
        this.tiempo=0;
    }
    public L08(String nombreapellidos, int tiempo, double longitud, double porcentaje, double incremento){
        this.nombreapellidos=nombreapellidos;
        this.tiempo=tiempo;
    }
    public void g3_pedirnombres(){
        @SuppressWarnings("resource")
        Scanner texto=new Scanner(System.in);
        texto.useDelimiter("\n");
        System.out.print("Ingrese su nombre y apellidos: ");
        this.nombreapellidos=texto.next();
        System.out.println("Su nombre completo es: " +this.nombreapellidos);
        
    }
    public void g3_mostrar(){
        int i,j;
        double longitud,porcentaje, incremento;
        longitud=this.nombreapellidos.length()-1; 
        System.out.println("La longitud de la cadena es: " +longitud);
        incremento = (double)(100/longitud);
        System.out.println("El porcentaje de incremento por cada letra es: " +incremento);
        this.g3_esperar();
        porcentaje=0;
        for(i=0;i<longitud;i++){
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            System.out.print("[");
            for(j=0;j<=i;j++){
                System.out.print(this.nombreapellidos.charAt(j));
                }
                porcentaje = porcentaje + incremento;
            System.out.print("] "+Math.round(porcentaje*100.0)/100.0 + "%");
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
