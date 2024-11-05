package Loading;

import java.util.Scanner;

public class L09 {
    public String nombreapellidos;
    public int tiempo;
    
    public L09(){
        this.nombreapellidos=" ";
        this.tiempo=0;
    }
    public L09(String nombreapellidos, int tiempo, double longitud, double porcentaje, double incremento){
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
            
            for(j=0;j<=i;j++){
                if(j<i)
                    System.err.print(" ");
                    else
                        System.out.print(nombreapellidos.charAt(j));
            }
           
                porcentaje = porcentaje + incremento;
            System.out.println("  "+Math.round(porcentaje*100.0)/100.0 +  " %");
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
