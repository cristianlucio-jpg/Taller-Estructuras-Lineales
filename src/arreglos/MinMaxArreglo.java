package arreglos;

import java.util.Random;

/**
 * Ejercicio 4: Encontrar el número menor y mayor en un arreglo de 25 números aleatorios.
 * 
 * <p>Este programa genera 25 números aleatorios entre -50 y 50, los almacena en un arreglo,
 * y encuentra el valor mínimo y máximo del arreglo.</p>
 * 
 * @author Cristian Lucio
 */
public class MinMaxArreglo {
    
    /** Constante que define la cantidad de números a generar */
    private static final int cantidadNumeros = 25;
    
    /** Límite inferior del rango de números aleatorios */
    private static final int limiteInferior = -50;
    
    /** Límite superior del rango de números aleatorios */
    private static final int limiteSuperior = 50;
    
    /** Arreglo que almacena los números aleatorios generados */
    private int[] numeros;
    
    /** Almacena el número menor encontrado */
    private int numeroMenor;
    
    /** Almacena el número mayor encontrado */
    private int numeroMayor;
    
    /**
     * Constructor que inicializa el arreglo y encuentra el menor y mayor.
     */
    public MinMaxArreglo() {
        this.numeros = new int[cantidadNumeros];
        generarNumerosAleatorios();
        encontrarMenorYMayor();
    }
    
    /**
     * Genera 25 números aleatorios entre -50 y 50.
     * 
     * <p>Fórmula: nextInt(rango) + limiteInferior
     * donde rango = limiteSuperior - limiteInferior + 1</p>
     */
    private void generarNumerosAleatorios() {
        Random generador = new Random();
        int rango = limiteSuperior - limiteInferior + 1; // 50 - (-50) + 1 = 101
        
        for (int indice = 0; indice < cantidadNumeros; indice++) {
            numeros[indice] = generador.nextInt(rango) + limiteInferior;
        }
    }
    
    /**
     * Encuentra el número menor y mayor del arreglo.
     * 
     * <p>Recorre el arreglo una sola vez, comparando cada elemento
     * con los valores actuales de menor y mayor.</p>
     */
    private void encontrarMenorYMayor() {
        // Inicializar con el primer elemento
        numeroMenor = numeros[0];
        numeroMayor = numeros[0];
        
        // Recorrer desde el segundo elemento
        for (int indice = 1; indice < cantidadNumeros; indice++) {
            int numeroActual = numeros[indice];
            
            if (numeroActual < numeroMenor) {
                numeroMenor = numeroActual;
            }
            
            if (numeroActual > numeroMayor) {
                numeroMayor = numeroActual;
            }
        }
    }
    
    /**
     * Imprime todos los números del arreglo en formato de cuadrícula.
     * 
     * <p>Muestra los números en 5 filas de 5 columnas para mejor visualización.</p>
     */
    public void imprimirArreglo() {
        System.out.println("\n=== ARREGLO DE 25 NÚMEROS ALEATORIOS (-50 a 50) ===");
        
        for (int fila = 0; fila < 5; fila++) {
            System.out.print("  ");
            for (int columna = 0; columna < 5; columna++) {
                int indice = fila * 5 + columna;
                System.out.printf("%4d", numeros[indice]);
            }
            System.out.println();
        }
    }
    
    /**
     * Imprime el número menor y mayor encontrados.
     */
    public void imprimirResultados() {
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("  Cantidad de números: " + cantidadNumeros);
        System.out.println("  Rango de valores: " + limiteInferior + " a " + limiteSuperior);
        System.out.println("  Número menor: " + numeroMenor);
        System.out.println("  Número mayor: " + numeroMayor);
    }
    
    /**
     * Imprime información adicional sobre la posición del menor y mayor.
     */
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * @param argumentos Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] argumentos) {
        System.out.println("==========================================");
        System.out.println("EJERCICIO 4: NÚMERO MENOR Y MAYOR");
        System.out.println("==========================================");
        
        MinMaxArreglo ejercicio = new MinMaxArreglo();
        
        ejercicio.imprimirArreglo();
        ejercicio.imprimirResultados();
        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
    }
}