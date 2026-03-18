package matrices;

/**
 * Ejercicio 14: Inicializar una matriz de m x n con valores predeterminados,
 * calcular su transpuesta y mostrar ambas matrices.
 * 
 * <p>La transpuesta de una matriz se obtiene intercambiando filas por columnas.
 * Si la matriz original tiene dimensiones m x n, su transpuesta tendrá dimensiones n x m.</p>
 * 
 * @author Cristian Lucio
 * @version 1.0
 * @since 2026
 */
public class MatrizTranspuesta {
    
    /** Matriz original de 3 filas x 4 columnas con valores predeterminados */
    private int[][] matrizOriginal;
    
    /** Matriz transpuesta resultante de 4 filas x 3 columnas */
    private int[][] matrizTranspuesta;
    
    /** Número de filas de la matriz original (fijo: 3) */
    private int filas;
    
    /** Número de columnas de la matriz original (fijo: 4) */
    private int columnas;
    
    /**
     * Constructor que inicializa las matrices con dimensiones fijas 3x4 y 4x3.
     */
    public MatrizTranspuesta() {
        this.filas = 3;
        this.columnas = 4;
        this.matrizOriginal = new int[filas][columnas];
        this.matrizTranspuesta = new int[columnas][filas];
    }
    
    /**
     * Inicializa la matriz original con valores predeterminados del 1 al 12.
     * 
     * <p>Los valores se asignan en orden secuencial por filas:
     * <br>Fila 0: 1, 2, 3, 4
     * <br>Fila 1: 5, 6, 7, 8
     * <br>Fila 2: 9, 10, 11, 12</p>
     */
    public void inicializarMatriz() {
        // Valores predeterminados como pide el ejercicio
        matrizOriginal[0][0] = 1;  matrizOriginal[0][1] = 2;  matrizOriginal[0][2] = 3;  matrizOriginal[0][3] = 4;
        matrizOriginal[1][0] = 5;  matrizOriginal[1][1] = 6;  matrizOriginal[1][2] = 7;  matrizOriginal[1][3] = 8;
        matrizOriginal[2][0] = 9;  matrizOriginal[2][1] = 10; matrizOriginal[2][2] = 11; matrizOriginal[2][3] = 12;
    }
    
    /**
     * Calcula la matriz transpuesta intercambiando filas por columnas.
     * 
     * <p>El elemento [fila][columna] de la matriz original pasa a ser
     * el elemento [columna][fila] en la matriz transpuesta.</p>
     */
    public void calcularTranspuesta() {
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                matrizTranspuesta[columna][fila] = matrizOriginal[fila][columna];
            }
        }
    }
    
    /**
     * Muestra la matriz original en formato de tabla.
     * 
     * <p>Indica las dimensiones (3x4) y muestra los valores alineados.</p>
     */
    public void mostrarMatrizOriginal() {
        System.out.println("\n=== MATRIZ ORIGINAL (" + filas + "x" + columnas + ") ===");
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.printf("%4d", matrizOriginal[fila][columna]);
            }
            System.out.println();
        }
    }
    
    /**
     * Muestra la matriz transpuesta en formato de tabla.
     * 
     * <p>Indica las dimensiones (4x3) y muestra los valores alineados.</p>
     */
    public void mostrarMatrizTranspuesta() {
        System.out.println("\n=== MATRIZ TRANSPUESTA (" + columnas + "x" + filas + ") ===");
        for (int fila = 0; fila < columnas; fila++) {
            for (int columna = 0; columna < filas; columna++) {
                System.out.printf("%4d", matrizTranspuesta[fila][columna]);
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
     *   <li>Inicializa la matriz con valores predeterminados</li>
     *   <li>Calcula la matriz transpuesta</li>
     *   <li>Muestra la matriz original</li>
     *   <li>Muestra la matriz transpuesta</li>
     *   <li>Muestra el pie del programa</li>
     * </ol>
     * 
     * @param argumentos Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] argumentos) {
        System.out.println("==========================================");
        System.out.println("EJERCICIO 14: MATRIZ TRANSPUESTA");
        System.out.println("==========================================");
        
        MatrizTranspuesta ejercicio = new MatrizTranspuesta();
        
        ejercicio.inicializarMatriz();
        ejercicio.calcularTranspuesta();
        ejercicio.mostrarMatrizOriginal();
        ejercicio.mostrarMatrizTranspuesta();
        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
    }
}