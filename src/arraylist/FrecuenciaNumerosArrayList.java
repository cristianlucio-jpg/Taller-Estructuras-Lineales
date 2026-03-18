package arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 * Ejercicio 8: Generar un ArrayList con 100 números aleatorios entre 1 y 20,
 * contar la frecuencia de cada número y mostrar el número con mayor frecuencia.
 * 
 * @author Cristian Lucio
 */
public class FrecuenciaNumerosArrayList {
    
    /** Cantidad de números a generar */
    private static final int cantidadNumeros = 100;
    
    /** Límite inferior del rango de números aleatorios */
    private static final int limiteInferior = 1;
    
    /** Límite superior del rango de números aleatorios */
    private static final int limiteSuperior = 20;
    
    /** ArrayList que almacena los números generados */
    private ArrayList<Integer> numeros;
    
    /** Arreglo que almacena la frecuencia de cada número (índice 0 = número 1) */
    private int[] frecuencias;
    
    /** Número que aparece con mayor frecuencia */
    private int numeroMasFrecuente;
    
    /** Cantidad de veces que aparece el número más frecuente */
    private int frecuenciaMaxima;
    
    /**
     * Constructor que inicializa el ArrayList y el arreglo de frecuencias.
     */
    public FrecuenciaNumerosArrayList() {
        this.numeros = new ArrayList<>();
        this.frecuencias = new int[limiteSuperior];
        this.numeroMasFrecuente = 0;
        this.frecuenciaMaxima = 0;
    }
    
    /**
     * Genera 100 números aleatorios entre 1 y 20 y los almacena en el ArrayList.
     */
    public void generarNumerosAleatorios() {
        Random generador = new Random();
        
        for (int indice = 0; indice < cantidadNumeros; indice++) {
            int numeroGenerado = generador.nextInt(limiteSuperior) + limiteInferior;
            numeros.add(numeroGenerado);
        }
    }
    
    /**
     * Cuenta la frecuencia de cada número en el ArrayList.
     * 
     * <p>Recorre el ArrayList y por cada número incrementa la posición correspondiente
     * en el arreglo de frecuencias (número 1 → posición 0, número 2 → posición 1, etc.).</p>
     */
    public void contarFrecuencias() {
        for (int indice = 0; indice < limiteSuperior; indice++) {
            frecuencias[indice] = 0;
        }
        
        for (int numero : numeros) {
            frecuencias[numero - 1]++;
        }
    }
    
    /**
     * Encuentra el número con mayor frecuencia en el ArrayList.
     * 
     * <p>Recorre el arreglo de frecuencias y encuentra el valor máximo,
     * guardando también el número correspondiente.</p>
     */
    public void encontrarNumeroMasFrecuente() {
        frecuenciaMaxima = 0;
        numeroMasFrecuente = 0;
        
        for (int indice = 0; indice < limiteSuperior; indice++) {
            if (frecuencias[indice] > frecuenciaMaxima) {
                frecuenciaMaxima = frecuencias[indice];
                numeroMasFrecuente = indice + 1;
            }
        }
    }
    
    /**
     * Muestra la tabla de frecuencias de cada número.
     * 
     * <p>Formato de tabla con número y cantidad de apariciones.</p>
     */
    public void mostrarTablaFrecuencias() {
        System.out.println("\n=== TABLA DE FRECUENCIAS ===");
        System.out.println("Número | Frecuencia");
        System.out.println("-------|-----------");
        
        for (int indice = 0; indice < limiteSuperior; indice++) {
            int numero = indice + 1;
            System.out.printf("   %2d  |     %2d%n", numero, frecuencias[indice]);
        }
    }
    
    /**
     * Muestra el resultado del número más frecuente.
     */
    public void mostrarResultado() {
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Número más frecuente: " + numeroMasFrecuente);
        System.out.println("Frecuencia: " + frecuenciaMaxima + " veces");
    }
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * @param argumentos Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] argumentos) {
        System.out.println("==========================================");
        System.out.println("EJERCICIO 8: FRECUENCIA DE NÚMEROS EN ARRAYLIST");
        System.out.println("==========================================");
        
        FrecuenciaNumerosArrayList ejercicio = new FrecuenciaNumerosArrayList();
        
        ejercicio.generarNumerosAleatorios();
        ejercicio.contarFrecuencias();
        ejercicio.mostrarTablaFrecuencias();
        ejercicio.encontrarNumeroMasFrecuente();
        ejercicio.mostrarResultado();
        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
    }
}