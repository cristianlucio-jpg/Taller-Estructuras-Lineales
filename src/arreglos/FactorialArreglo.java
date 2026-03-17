package arreglos;

import java.util.Random;
import java.util.Scanner;

/**
 * Ejercicio 3: Factorial de números aleatorios.
 * 
 * <p>Este programa genera una cantidad determinada de números aleatorios,
 * calcula el factorial de cada uno y muestra ambos arreglos.</p>
 * 
 * @author Cristian Lucio
 */
public class FactorialArreglo {
    
    /** Arreglo que almacena los números originales generados aleatoriamente */
    private int[] numerosOriginales;
    
    /** Arreglo que almacena los factoriales calculados */
    private long[] arregloFactoriales;
    
    /**
     * Constructor que inicializa los arreglos con la cantidad especificada.
     * 
     * @param cantidadNumeros Número de elementos a generar
     */
    public FactorialArreglo(int cantidadNumeros) {
        numerosOriginales = new int[cantidadNumeros];
        arregloFactoriales = new long[cantidadNumeros];
    }
    
    /**
     * Genera números aleatorios entre 0 y 20.
     * Utiliza la clase Random para la generación aleatoria.
     */
    public void generarNumerosAleatorios() {
        Random generadorRandom = new Random();
        
        for (int indice = 0; indice < numerosOriginales.length; indice++) {
            // Genera números entre 0 y 20 (inclusive)
            numerosOriginales[indice] = generadorRandom.nextInt(21);
        }
    }
    
    /**
     * Calcula el factorial de cada número en el arreglo original.
     * Los resultados se almacenan en el arreglo de factoriales.
     */
    public void calcularFactoriales() {
        for (int indice = 0; indice < numerosOriginales.length; indice++) {
            int numeroActual = numerosOriginales[indice];
            arregloFactoriales[indice] = calcularFactorial(numeroActual);
        }
    }
    
    /**
     * Calcula el factorial de un número específico.
     * 
     * @param numero Número para calcular el factorial
     * @return Factorial del número ingresado
     */
    private long calcularFactorial(int numero) {
        long factorialResultado = 1;
        
        for (int contador = 2; contador <= numero; contador++) {
            factorialResultado *= contador;
        }
        
        return factorialResultado;
    }
    
    /**
     * Imprime ambos arreglos en la consola.
     * Primero muestra los números originales y luego los factoriales.
     */
    public void imprimirResultados() {
        System.out.println("\n=== NÚMEROS ORIGINALES GENERADOS ===");
        for (int numeroActual : numerosOriginales) {
            System.out.print(numeroActual + " ");
        }
        
        System.out.println("\n\n=== FACTORIALES CALCULADOS ===");
        for (long factorialActual : arregloFactoriales) {
            System.out.print(factorialActual + " ");
        }
        System.out.println();
    }
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * @param argumentos Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] argumentos) {
        Scanner lectorTeclado = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("EJERCICIO 3: FACTORIAL DE NÚMEROS ALEATORIOS");
        System.out.println("==========================================");
        
        System.out.print("Ingrese la cantidad de números a generar: ");
        int cantidadNumeros = lectorTeclado.nextInt();
        
        FactorialArreglo objetoEjercicio = new FactorialArreglo(cantidadNumeros);
        
        objetoEjercicio.generarNumerosAleatorios();
        objetoEjercicio.calcularFactoriales();
        objetoEjercicio.imprimirResultados();
        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
        
        lectorTeclado.close();
    }
}