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
 * @since 2026
 */
public class BuscarEnMatriz {
    
    /** Matriz bidimensional de números enteros */
    private int[][] matriz;
    
    /** Número de filas de la matriz (fijo: 3) */
    private int filas;
    
    /** Número de columnas de la matriz (fijo: 4) */
    private int columnas;
    
    /** Scanner para entrada de datos por teclado */
    private Scanner lector;
    
    /**
     * Constructor que inicializa la matriz con dimensiones fijas 3x4 y el Scanner.
     */
    public BuscarEnMatriz() {
        this.filas = 3;
        this.columnas = 4;
        this.matriz = new int[filas][columnas];
        this.lector = new Scanner(System.in);
    }
    
    /**
     * Llena la matriz con números aleatorios entre 0 y 99.
     * 
     * <p>Utiliza la clase Random para generar números pseudoaleatorios.</p>
     */
    public void llenarMatrizAleatoria() {
        Random generador = new Random();
        
        System.out.println("Generando matriz de " + filas + "x" + columnas + "...");
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                matriz[fila][columna] = generador.nextInt(100);
            }
        }
    }
    
    /**
     * Muestra la matriz generada en formato de tabla.
     * 
     * <p>Los números se muestran alineados con formato %4d.</p>
     */
    public void mostrarMatriz() {
        System.out.println("\n=== MATRIZ GENERADA ===");
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.printf("%4d", matriz[fila][columna]);
            }
            System.out.println();
        }
    }
    
    /**
     * Solicita un número al usuario y busca su primera ocurrencia en la matriz.
     * 
     * <p>Recorre la matriz por filas y columnas. Si encuentra el número,
     * muestra su posición y termina la búsqueda. Si no lo encuentra,
     * muestra un mensaje indicando que no existe.</p>
     */
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
     *   <li>Crea una instancia de BuscarEnMatriz</li>
     *   <li>Llena la matriz con números aleatorios</li>
     *   <li>Muestra la matriz generada</li>
     *   <li>Solicita un número al usuario y lo busca</li>
     *   <li>Cierra el Scanner</li>
     *   <li>Muestra el pie del programa</li>
     * </ol>
     * 
     * @param argumentos Argumentos de línea de comandos (no utilizados)
     */
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