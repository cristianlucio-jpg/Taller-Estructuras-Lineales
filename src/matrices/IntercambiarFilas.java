package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 15: Inicializar una matriz de m x n con números aleatorios,
 * intercambiar la primera fila con la segunda y mostrar la matriz resultante.
 * 
 * <p>Este programa solicita al usuario las dimensiones de la matriz,
 * la llena con números aleatorios entre 0 y 99, intercambia la fila 0 con la fila 1,
 * y muestra la matriz después del intercambio.</p>
 * 
 * @author Cristian Lucio
 * @version 1.0
 * @since 2024
 */
public class IntercambiarFilas {
    
    /** Matriz bidimensional de números enteros */
    private int[][] matriz;
    
    /** Número de filas de la matriz */
    private int filas;
    
    /** Número de columnas de la matriz */
    private int columnas;
    
    /** Scanner para entrada de datos por teclado */
    private Scanner lector;
    
    /**
     * Constructor que inicializa el Scanner.
     */
    public IntercambiarFilas() {
        this.lector = new Scanner(System.in);
    }
    
    /**
     * Solicita al usuario las dimensiones de la matriz.
     * 
     * <p>Pide el número de filas y columnas, y crea la matriz con esas dimensiones.</p>
     */
    public void solicitarDimensiones() {
        System.out.print("Ingrese el número de filas: ");
        filas = lector.nextInt();
        
        System.out.print("Ingrese el número de columnas: ");
        columnas = lector.nextInt();
        
        matriz = new int[filas][columnas];
    }
    
    /**
     * Llena la matriz con números aleatorios entre 0 y 99.
     * 
     * <p>Utiliza la clase Random para generar números pseudoaleatorios.</p>
     */
    public void llenarMatrizAleatoria() {
        Random generador = new Random();
        
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                matriz[fila][columna] = generador.nextInt(100); // 0 a 99
            }
        }
    }
    
    /**
     * Intercambia la primera fila (índice 0) con la segunda fila (índice 1).
     * 
     * <p>Recorre cada columna intercambiando los valores usando una variable temporal.</p>
     */
    public void intercambiarPrimerasFilas() {
        for (int columna = 0; columna < columnas; columna++) {
            int temporal = matriz[0][columna];
            matriz[0][columna] = matriz[1][columna];
            matriz[1][columna] = temporal;
        }
    }
    
    /**
     * Muestra la matriz en formato de tabla.
     * 
     * <p>Imprime la matriz después de realizar el intercambio de filas.</p>
     */
    public void mostrarMatriz() {
        System.out.println("\n=== MATRIZ DESPUÉS DEL INTERCAMBIO ===");
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.printf("%4d", matriz[fila][columna]);
            }
            System.out.println();
        }
    }
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * <p>Flujo de ejecución:</p>
     * <ol>
     *   <li>Muestra el encabezado del programa</li>
     *   <li>Solicita las dimensiones de la matriz</li>
     *   <li>Llena la matriz con números aleatorios</li>
     *   <li>Intercambia la primera fila con la segunda</li>
     *   <li>Muestra la matriz resultante</li>
     *   <li>Muestra el pie del programa</li>
     * </ol>
     * 
     * @param argumentos Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] argumentos) {
        System.out.println("==========================================");
        System.out.println("EJERCICIO 15: INTERCAMBIAR FILAS");
        System.out.println("==========================================");
        
        IntercambiarFilas ejercicio = new IntercambiarFilas();
        
        ejercicio.solicitarDimensiones();
        ejercicio.llenarMatrizAleatoria();
        ejercicio.intercambiarPrimerasFilas();
        ejercicio.mostrarMatriz();
        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
    }
}