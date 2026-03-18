package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 12: Inicializar una matriz de tamaño n x n con números aleatorios
 * entre -50 y 50 y calcular la suma de los elementos de la diagonal opuesta.
 * 
 * @author Cristian Lucio
 * @version 1.0
 * @since 2026
 */
public class DiagonalOpuesta {
    
    private int[][] matriz;
    private int tamaño;
    private Scanner lector;
    
    public DiagonalOpuesta() {
        this.lector = new Scanner(System.in);
    }
    
    public void solicitarTamaño() {
        System.out.print("Ingrese el tamaño de la matriz (n x n): ");
        tamaño = lector.nextInt();
        matriz = new int[tamaño][tamaño];
    }
    
    public void llenarMatrizAleatoria() {
        Random generador = new Random();
        
        for (int fila = 0; fila < tamaño; fila++) {
            for (int columna = 0; columna < tamaño; columna++) {
                matriz[fila][columna] = generador.nextInt(101) - 50;
            }
        }
    }
    
    public void calcularYMostrarSumaDiagonalOpuesta() {
        int suma = 0;
        
        for (int fila = 0; fila < tamaño; fila++) {
            int columna = tamaño - 1 - fila;
            suma += matriz[fila][columna];
        }
        
        System.out.println("\nLa suma de los elementos de la diagonal opuesta es: " + suma);
    }
    
    public void cerrarScanner() {
        if (lector != null) {
            lector.close();
        }
    }
    
    public static void main(String[] argumentos) {
        System.out.println("==========================================");
        System.out.println("EJERCICIO 12: DIAGONAL OPUESTA");
        System.out.println("==========================================");
        
        DiagonalOpuesta ejercicio = new DiagonalOpuesta();
        
        ejercicio.solicitarTamaño();
        ejercicio.llenarMatrizAleatoria();
        ejercicio.calcularYMostrarSumaDiagonalOpuesta();
        ejercicio.cerrarScanner();
        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
    }
}