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
    
    private static final int cantidadNumeros = 100;
    private static final int limiteInferior = 1;
    private static final int limiteSuperior = 20;
    
    private ArrayList<Integer> numeros;
    private int[] frecuencias;
    private int numeroMasFrecuente;
    private int frecuenciaMaxima;
    
    public FrecuenciaNumerosArrayList() {
        this.numeros = new ArrayList<>();
        this.frecuencias = new int[limiteSuperior];
        this.numeroMasFrecuente = 0;
        this.frecuenciaMaxima = 0;
    }
    
    public void generarNumerosAleatorios() {
        Random generador = new Random();
        
        for (int indice = 0; indice < cantidadNumeros; indice++) {
            int numeroGenerado = generador.nextInt(limiteSuperior) + limiteInferior;
            numeros.add(numeroGenerado);
        }
    }
    
    public void contarFrecuencias() {
        for (int indice = 0; indice < limiteSuperior; indice++) {
            frecuencias[indice] = 0;
        }
        
        for (int numero : numeros) {
            frecuencias[numero - 1]++;
        }
    }
    
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
    
    public void mostrarTablaFrecuencias() {
        System.out.println("\n=== TABLA DE FRECUENCIAS ===");
        System.out.println("Número | Frecuencia");
        System.out.println("-------|-----------");
        
        for (int indice = 0; indice < limiteSuperior; indice++) {
            int numero = indice + 1;
            System.out.printf("   %2d  |     %2d%n", numero, frecuencias[indice]);
        }
    }
    
    public void mostrarResultado() {
        System.out.println("\n=== RESULTADO ===");
        System.out.println("Número más frecuente: " + numeroMasFrecuente);
        System.out.println("Frecuencia: " + frecuenciaMaxima + " veces");
    }
    
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