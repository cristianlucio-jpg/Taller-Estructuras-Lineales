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
 * @since 2024
 */
public class MatrizTranspuesta {
    
    private int[][] matrizOriginal;
    private int[][] matrizTranspuesta;
    private int filas;
    private int columnas;
    
    public MatrizTranspuesta() {
        this.filas = 3;
        this.columnas = 4;
        this.matrizOriginal = new int[filas][columnas];
        this.matrizTranspuesta = new int[columnas][filas];
    }
    
    public void inicializarMatriz() {
        // Valores predeterminados como pide el ejercicio
        matrizOriginal[0][0] = 1;  matrizOriginal[0][1] = 2;  matrizOriginal[0][2] = 3;  matrizOriginal[0][3] = 4;
        matrizOriginal[1][0] = 5;  matrizOriginal[1][1] = 6;  matrizOriginal[1][2] = 7;  matrizOriginal[1][3] = 8;
        matrizOriginal[2][0] = 9;  matrizOriginal[2][1] = 10; matrizOriginal[2][2] = 11; matrizOriginal[2][3] = 12;
    }
    
    public void calcularTranspuesta() {
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                matrizTranspuesta[columna][fila] = matrizOriginal[fila][columna];
            }
        }
    }
    
    public void mostrarMatrizOriginal() {
        System.out.println("\n=== MATRIZ ORIGINAL (" + filas + "x" + columnas + ") ===");
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.printf("%4d", matrizOriginal[fila][columna]);
            }
            System.out.println();
        }
    }
    
    public void mostrarMatrizTranspuesta() {
        System.out.println("\n=== MATRIZ TRANSPUESTA (" + columnas + "x" + filas + ") ===");
        for (int fila = 0; fila < columnas; fila++) {
            for (int columna = 0; columna < filas; columna++) {
                System.out.printf("%4d", matrizTranspuesta[fila][columna]);
            }
            System.out.println();
        }
    }
    
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