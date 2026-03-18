package matrices;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 13: Inicializar una matriz de n x n con números aleatorios,
 * determinar si es simétrica y mostrar los números de las esquinas.
 * 
 * @author Cristian Lucio
 * @version 1.0
 * @since 2024
 */
public class MatrizSimetrica {
    
    private int[][] matriz;
    private int tamaño;
    private Scanner lector;
    
    public MatrizSimetrica() {
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
                matriz[fila][columna] = generador.nextInt(100);
            }
        }
    }
    
    public void verificarSimetriaYMostrarEsquinas() {
        boolean simetrica = true;
        
        for (int fila = 0; fila < tamaño; fila++) {
            for (int columna = 0; columna < tamaño; columna++) {
                if (matriz[fila][columna] != matriz[columna][fila]) {
                    simetrica = false;
                    break;
                }
            }
        }
        
        System.out.println("\n=== RESULTADO ===");
        if (simetrica) {
            System.out.println("La matriz ES SIMÉTRICA.");
        } else {
            System.out.println("La matriz NO ES SIMÉTRICA.");
        }
        
        System.out.println("\n=== NÚMEROS DE LAS ESQUINAS ===");
        System.out.println("Superior izquierda: " + matriz[0][0]);
        System.out.println("Superior derecha: " + matriz[0][tamaño - 1]);
        System.out.println("Inferior izquierda: " + matriz[tamaño - 1][0]);
        System.out.println("Inferior derecha: " + matriz[tamaño - 1][tamaño - 1]);
    }
    
    public void cerrarScanner() {
        if (lector != null) {
            lector.close();
        }
    }
    
    public static void main(String[] argumentos) {
        System.out.println("==========================================");
        System.out.println("EJERCICIO 13: MATRIZ SIMÉTRICA");
        System.out.println("==========================================");
        
        MatrizSimetrica ejercicio = new MatrizSimetrica();
        
        ejercicio.solicitarTamaño();
        ejercicio.llenarMatrizAleatoria();
        ejercicio.verificarSimetriaYMostrarEsquinas();
        ejercicio.cerrarScanner();
        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
    }
}