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
    
    /** Matriz cuadrada de tamaño n x n */
    private int[][] matriz;
    
    /** Tamaño de la matriz (número de filas y columnas) */
    private int tamaño;
    
    /** Scanner para entrada de datos por teclado */
    private Scanner lector;
    
    /**
     * Constructor que inicializa el Scanner.
     */
    public DiagonalOpuesta() {
        this.lector = new Scanner(System.in);
    }
    
    /**
     * Solicita al usuario el tamaño de la matriz cuadrada.
     * 
     * <p>Pide el valor de n y crea una matriz de n x n.</p>
     */
    public void solicitarTamaño() {
        System.out.print("Ingrese el tamaño de la matriz (n x n): ");
        tamaño = lector.nextInt();
        matriz = new int[tamaño][tamaño];
    }
    
    /**
     * Llena la matriz con números aleatorios entre -50 y 50.
     * 
     * <p>Fórmula: generador.nextInt(101) - 50 genera números de -50 a 50.</p>
     */
    public void llenarMatrizAleatoria() {
        Random generador = new Random();
        
        for (int fila = 0; fila < tamaño; fila++) {
            for (int columna = 0; columna < tamaño; columna++) {
                matriz[fila][columna] = generador.nextInt(101) - 50;
            }
        }
    }
    
    /**
     * Calcula y muestra la suma de los elementos de la diagonal opuesta.
     * 
     * <p>La diagonal opuesta (secundaria) cumple que: fila + columna = tamaño - 1.</p>
     */
    public void calcularYMostrarSumaDiagonalOpuesta() {
        int suma = 0;
        
        for (int fila = 0; fila < tamaño; fila++) {
            int columna = tamaño - 1 - fila;
            suma += matriz[fila][columna];
        }
        
        System.out.println("\nLa suma de los elementos de la diagonal opuesta es: " + suma);
    }
    
    /**
     * Cierra el Scanner para liberar recursos.
     */
    public void cerrarScanner() {
        if (lector != null) {
            lector.close();
        }
    }
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * <p>Flujo de ejecución:</p>
     * <ol>
     *   <li>Muestra el encabezado del programa</li>
     *   <li>Solicita el tamaño de la matriz</li>
     *   <li>Llena la matriz con números aleatorios</li>
     *   <li>Calcula y muestra la suma de la diagonal opuesta</li>
     *   <li>Cierra el Scanner</li>
     *   <li>Muestra el pie del programa</li>
     * </ol>
     * 
     * @param argumentos Argumentos de línea de comandos (no utilizados)
     */
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