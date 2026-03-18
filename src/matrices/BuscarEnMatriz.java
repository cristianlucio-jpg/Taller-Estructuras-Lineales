package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 11: Inicializar una matriz de m filas por n columnas con números aleatorios,
 * buscar un número ingresado por el usuario y mostrar su primera ocurrencia.
 * 
 * <p>Este programa utiliza dimensiones fijas (3x4) para no solicitar múltiples datos.</p>
 * 
 * @author Cristian Lucio
 * @version 1.0
 * @since 2024
 */
public class BuscarEnMatriz {
    
    private int[][] matriz;
    private int filas;
    private int columnas;
    private Scanner lector;
    
    public BuscarEnMatriz() {
        this.filas = 3;
        this.columnas = 4;
        this.matriz = new int[filas][columnas];
        this.lector = new Scanner(System.in);
    }
    
    public void llenarMatrizAleatoria() {
        Random generador = new Random();
        
        System.out.println("Generando matriz de " + filas + "x" + columnas + "...");
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                matriz[fila][columna] = generador.nextInt(100);
            }
        }
    }
    
    public void mostrarMatriz() {
        System.out.println("\n=== MATRIZ GENERADA ===");
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.printf("%4d", matriz[fila][columna]);
            }
            System.out.println();
        }
    }
    
    public void buscarNumero() {
        System.out.print("\nIngrese el número a buscar: ");
        int numeroBuscado = lector.nextInt();
        
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                if (matriz[fila][columna] == numeroBuscado) {
                    System.out.println("Número encontrado en posición: [" + fila + "][" + columna + "]");
                    return;
                }
            }
        }
        
        System.out.println("El número no se encuentra en la matriz.");
    }
    
    public void cerrarScanner() {
        if (lector != null) {
            lector.close();
        }
    }
    
    public static void main(String[] argumentos) {
        System.out.println("==========================================");
        System.out.println("EJERCICIO 11: BUSCAR NÚMERO EN MATRIZ");
        System.out.println("==========================================");
        
        BuscarEnMatriz ejercicio = new BuscarEnMatriz();
        
        ejercicio.llenarMatrizAleatoria();
        ejercicio.mostrarMatriz();
        ejercicio.buscarNumero();
        ejercicio.cerrarScanner();
        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
    }
}