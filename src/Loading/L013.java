package Loading;

public class L013 {
    public String simbolo;
    public int tiempo;

    public L013() {
        this.simbolo = " ";
        this.tiempo = 0;
    }

    public L013(String simbolo, int tiempo) {
        this.simbolo = simbolo;
        this.tiempo = tiempo;
    }

    public void g3_mostrar() {
        int i, j;

        
        for (i=1; i<=20; i++) {
            System.out.print("\033[H\033[2J"); 
            System.out.flush();

            for (j=1; j<i; j++) {
                System.out.print(" "); 
            }

            
            System.out.println("   \\|||/   ");
            for (j=1; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println("   (> <)   ");
            for (j=1; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println("ooO-(_)-Ooo");

            this.g3_esperar();
        }

        for (i=20; i>=1; i--) {
            System.out.print("\033[H\033[2J");  
            System.out.flush();

            for (j=1; j<i; j++) {
                System.out.print(" "); 
            }

            System.out.println("     \\|||/");
            for (j=1; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println("   (> <)   ");
            for (j=1; j<i; j++) {
                System.out.print(" ");
            }
            System.out.println("ooO-(_)-Ooo");

            this.g3_esperar();
        }
    }

    public void g3_esperar() {
        try {
            Thread.sleep(this.tiempo);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}

