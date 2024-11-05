package array;

import java.util.Scanner;

public class array1 {
    private String[] palabras;
    private int[] porcentajes;

    public void g3_imprimirarray1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa tu nombre completo: ");
        String nombreCompleto = sc.nextLine();
        palabras = nombreCompleto.split(" ");
        porcentajes = new int[palabras.length];

        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Ingrese el porcentaje de carga para " + palabras[i] + ": ");
            porcentajes[i] = sc.nextInt();
        }

        mostrarCargas();
        sc.close();
    }

    private void mostrarCargas() {
        for (int i = 0; i < palabras.length; i++) {
            mostrarBarra(palabras[i], porcentajes[i]);
        }
    }

    private void mostrarBarra(String palabra, int porcentaje) {
        int longitudNombre = palabra.length();
        int cantidadMostrar = (int) (longitudNombre * (porcentaje / 100.0));
        String nombreParcial = palabra.substring(0, cantidadMostrar);

        int progreso = 0;

        while (progreso <= porcentaje) {
            String barra = crearBarra(progreso);
            System.out.printf("\r%s %s %d%%", barra, nombreParcial, progreso);
            progreso++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    private String crearBarra(int porcentaje) {
        int longitudBarra = 30;
        int cantidadLleno = (int) (longitudBarra * (porcentaje / 100.0));
        StringBuilder barra = new StringBuilder();

        for (int j = 0; j < cantidadLleno; j++) {
            barra.append("=");
        }
        for (int j = cantidadLleno; j < longitudBarra; j++) {
            barra.append(" ");
        }

        return "[" + barra + "]";
    }
}