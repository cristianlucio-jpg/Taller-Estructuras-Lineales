package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Ejercicio 9: Generar un ArrayList con 20 números aleatorios entre 1 y 100,
 * ordenarlos de menor a mayor y de mayor a menor, y separarlos en listas de pares e impares.
 * 
 * <p>Este programa realiza las siguientes operaciones:</p>
 * <ul>
 *   <li>Genera 20 números aleatorios entre 1 y 100 y los almacena en un ArrayList</li>
 *   <li>Muestra la lista original</li>
 *   <li>Ordena la lista de menor a mayor y la muestra</li>
   <li>Ordena la lista de mayor a menor y la muestra</li>
 *   <li>Separa los números en dos nuevas listas: pares e impares</li>
 *   <li>Muestra las listas de pares e impares</li>
 * </ul>
 * 
 * <p>Principios aplicados:</p>
 * <ul>
 *   <li><b>KISS:</b> Código simple con métodos específicos para cada operación.</li>
 *   <li><b>DRY:</b> La lógica de impresión está encapsulada en un método reutilizable.</li>
 *   <li><b>YAGNI:</b> Solo implementa la funcionalidad requerida.</li>
 *   <li><b>Single Responsibility:</b> Cada método tiene una única responsabilidad.</li>
 *   <li><b>Encapsulamiento:</b> Los ArrayLists son privados.</li>
 * </ul>
 * 
 * @author Cristian Lucio
 * @version 1.0
 * @since 2026
 */
public class OrdenarYSepararArrayList {
    
    /** Cantidad de números a generar */
    private static final int cantidadNumeros = 20;
    
    /** Límite inferior del rango de números aleatorios */
    private static final int limiteInferior = 1;
    
    /** Límite superior del rango de números aleatorios */
    private static final int limiteSuperior = 100;
    
    /** ArrayList que almacena los números originales */
    private ArrayList<Integer> numerosOriginales;
    
    /** ArrayList que almacena los números pares */
    private ArrayList<Integer> numerosPares;
    
    /** ArrayList que almacena los números impares */
    private ArrayList<Integer> numerosImpares;
    
    /**
     * Constructor que inicializa los ArrayLists.
     */
    public OrdenarYSepararArrayList() {
        this.numerosOriginales = new ArrayList<>();
        this.numerosPares = new ArrayList<>();
        this.numerosImpares = new ArrayList<>();
    }
    
    /**
     * Genera 20 números aleatorios entre 1 y 100 y los almacena en el ArrayList original.
     * 
     * <p>Fórmula: nextInt(limiteSuperior) + limiteInferior
     * <br>Como limiteInferior = 1 y limiteSuperior = 100, genera números del 1 al 100.</p>
     */
    public void generarNumerosAleatorios() {
        Random generador = new Random();
        
        for (int indice = 0; indice < cantidadNumeros; indice++) {
            int numeroGenerado = generador.nextInt(limiteSuperior) + limiteInferior; // 1 a 100
            numerosOriginales.add(numeroGenerado);
        }
    }
    
    /**
     * Ordena el ArrayList de menor a mayor utilizando Collections.sort().
     */
    public void ordenarMenorAMayor() {
        Collections.sort(numerosOriginales);
    }
    
    /**
     * Ordena el ArrayList de mayor a menor utilizando Collections.sort() y reverseOrder().
     */
    public void ordenarMayorAMenor() {
        Collections.sort(numerosOriginales, Collections.reverseOrder());
    }
    
    /**
     * Separa los números en listas de pares e impares.
     * 
     * <p>Recorre el ArrayList original y clasifica cada número según su paridad:
     * <ul>
     *   <li>Si número % 2 == 0 → se agrega a la lista de pares</li>
     *   <li>Si número % 2 != 0 → se agrega a la lista de impares</li>
     * </ul>
     * </p>
     */
    public void separarParesEImpares() {
        numerosPares.clear();
        numerosImpares.clear();
        
        for (int numero : numerosOriginales) {
            if (numero % 2 == 0) {
                numerosPares.add(numero);
            } else {
                numerosImpares.add(numero);
            }
        }
    }
    
    /**
     * Imprime un ArrayList con un mensaje descriptivo.
     * 
     * @param mensaje Título o descripción a mostrar antes de la lista
     * @param lista ArrayList a imprimir
     */
    public void imprimirLista(String mensaje, ArrayList<Integer> lista) {
        System.out.println("\n" + mensaje);
        if (lista.isEmpty()) {
            System.out.println("  (lista vacía)");
        } else {
            System.out.print("  ");
            for (int indice = 0; indice < lista.size(); indice++) {
                System.out.print(lista.get(indice));
                if (indice < lista.size() - 1) {
                    System.out.print(", ");
                }
                if ((indice + 1) % 10 == 0) {
                    System.out.print("\n  ");
                }
            }
            System.out.println();
            System.out.println("  Cantidad de elementos: " + lista.size());
        }
    }
    
    /**
     * Muestra todas las listas generadas en el orden solicitado.
     */
    public void mostrarTodasLasListas() {
        imprimirLista("=== LISTA ORIGINAL (sin ordenar) ===", numerosOriginales);
        
        ordenarMenorAMayor();
        imprimirLista("=== LISTA ORDENADA DE MENOR A MAYOR ===", numerosOriginales);
        
        ordenarMayorAMenor();
        imprimirLista("=== LISTA ORDENADA DE MAYOR A MENOR ===", numerosOriginales);
        
        separarParesEImpares();
        imprimirLista("=== NÚMEROS PARES ===", numerosPares);
        imprimirLista("=== NÚMEROS IMPARES ===", numerosImpares);
    }
    
    /**
     * Obtiene una copia del ArrayList de números originales.
     * 
     * @return Copia del ArrayList original
     */
    public ArrayList<Integer> getNumerosOriginales() {
        return new ArrayList<>(numerosOriginales);
    }
    
    /**
     * Obtiene una copia del ArrayList de números pares.
     * 
     * @return Copia del ArrayList de pares
     */
    public ArrayList<Integer> getNumerosPares() {
        return new ArrayList<>(numerosPares);
    }
    
    /**
     * Obtiene una copia del ArrayList de números impares.
     * 
     * @return Copia del ArrayList de impares
     */
    public ArrayList<Integer> getNumerosImpares() {
        return new ArrayList<>(numerosImpares);
    }
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * <p>Flujo de ejecución:</p>
     * <ol>
     *   <li>Muestra el encabezado del programa</li>
     *   <li>Genera 20 números aleatorios entre 1 y 100</li>
     *   <li>Muestra todas las listas (original, ordenada ascendente, ordenada descendente, pares e impares)</li>
     *   <li>Muestra el pie del programa</li>
     * </ol>
     * 
     * @param argumentos Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] argumentos) {
        System.out.println("==========================================");
        System.out.println("EJERCICIO 9: ORDENAR Y SEPARAR ARRAYLIST");
        System.out.println("==========================================");
        System.out.println("Generando 20 números aleatorios entre 1 y 100...");
        
        OrdenarYSepararArrayList ejercicio = new OrdenarYSepararArrayList();
        
        ejercicio.generarNumerosAleatorios();
        ejercicio.mostrarTodasLasListas();
        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
    }
}
