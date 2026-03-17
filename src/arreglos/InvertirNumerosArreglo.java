package arreglos;

import java.util.Random;

/**
 * Ejercicio 5: Invertir cada número de un arreglo de 20 números aleatorios.
 * 
 * <p>Este programa genera 20 números aleatorios entre 1 y 999, los almacena en un arreglo,
 * invierte cada número (ej: 123 -> 321) y guarda los resultados en otro arreglo.
 * Finalmente, muestra ambos arreglos.</p>
 * 
 * <p>Principios aplicados:</p>
 * <ul>
 *   <li><b>KISS:</b> Código simple con métodos específicos para cada tarea.</li>
 *   <li><b>DRY:</b> La lógica de inversión está encapsulada en un método.</li>
 *   <li><b>YAGNI:</b> Solo implementa la funcionalidad requerida.</li>
 *   <li><b>Single Responsibility:</b> Cada método tiene una única responsabilidad.</li>
 *   <li><b>Encapsulamiento:</b> Los arreglos son privados.</li>
 * </ul>
 * 
 * @author Cristian Lucio
 * @version 1.0
 * @since 2024
 */
public class InvertirNumerosArreglo {
    
    /** Cantidad de números a generar en el arreglo */
    private static final int cantidadNumeros = 20;
    
    /** Límite superior para números aleatorios (números de hasta 3 dígitos) */
    private static final int limiteSuperior = 1000;
    
    /** Arreglo que almacena los números originales generados */
    private int[] numerosOriginales;
    
    /** Arreglo que almacena los números después de ser invertidos */
    private int[] numerosInvertidos;
    
    /**
     * Constructor que inicializa los arreglos y procesa los números.
     * 
     * <p>Al crear una instancia de esta clase, automáticamente:
     * <ol>
     *   <li>Inicializa los arreglos con el tamaño establecido</li>
     *   <li>Genera los números aleatorios</li>
     *   <li>Calcula los números invertidos</li>
     * </ol>
     * </p>
     */
    public InvertirNumerosArreglo() {
        this.numerosOriginales = new int[cantidadNumeros];
        this.numerosInvertidos = new int[cantidadNumeros];
        generarNumerosAleatorios();
        invertirTodosLosNumeros();
    }
    
    /**
     * Genera 20 números aleatorios entre 1 y 999.
     * 
     * <p>Utiliza la clase Random de Java para generar números pseudoaleatorios.
     * La fórmula utilizada es: nextInt(999) + 1, que genera números del 1 al 999.</p>
     * 
     * <p>Se evita el 0 para tener números de al menos 1 dígito y hasta 3 dígitos.</p>
     */
    private void generarNumerosAleatorios() {
        Random generador = new Random();
        
        for (int indice = 0; indice < cantidadNumeros; indice++) {
            numerosOriginales[indice] = generador.nextInt(999) + 1;
        }
    }
    
    /**
     * Invierte cada número del arreglo original.
     * 
     * <p>Recorre el arreglo de números originales y por cada número
     * llama al método {@link #invertirNumero(int)} para obtener su versión invertida,
     * almacenando el resultado en la misma posición del arreglo de números invertidos.</p>
     */
    private void invertirTodosLosNumeros() {
        for (int indice = 0; indice < cantidadNumeros; indice++) {
            numerosInvertidos[indice] = invertirNumero(numerosOriginales[indice]);
        }
    }
    
    /**
     * Invierte un número específico.
     * 
     * <p>El algoritmo funciona de la siguiente manera:</p>
     * <ol>
     *   <li>Extrae el último dígito usando el operador módulo (%)</li>
     *   <li>Lo agrega al número invertido multiplicando por 10</li>
     *   <li>Elimina el último dígito del número original dividiendo por 10</li>
     *   <li>Repite hasta que el número sea 0</li>
     * </ol>
     * 
     * <p>Ejemplos:</p>
     * <ul>
     *   <li><b>123</b> → 321</li>
     *   <li><b>4567</b> → 7654</li>
     *   <li><b>120</b> → 21 (el cero a la derecha se pierde)</li>
     *   <li><b>5</b> → 5</li>
     * </ul>
     * 
     * @param numero Número entero a invertir
     * @return Número invertido (como entero)
     */
    private int invertirNumero(int numero) {
        int numeroInvertido = 0;
        int numeroTemporal = numero;
        
        while (numeroTemporal > 0) {
            int digito = numeroTemporal % 10;        // Extrae el último dígito
            numeroInvertido = numeroInvertido * 10 + digito; // Lo agrega al resultado
            numeroTemporal = numeroTemporal / 10;    // Elimina el último dígito
        }
        
        return numeroInvertido;
    }
    
    /**
     * Imprime ambos arreglos en la consola.
     * 
     * <p>Muestra primero el arreglo de números originales y luego
     * el arreglo de números invertidos, con un encabezado descriptivo
     * para cada uno. Los números se muestran separados por espacios.</p>
     * 
     * <p>Formato de salida:</p>
     * <pre>
     * === ARREGLO ORIGINAL ===
     * 123 456 789 321 654 987 ...
     * 
     * === ARREGLO INVERTIDO ===
     * 321 654 987 123 456 789 ...
     * </pre>
     */
    public void imprimirArreglos() {
        System.out.println("\n=== ARREGLO ORIGINAL ===");
        for (int numero : numerosOriginales) {
            System.out.print(numero + " ");
        }
        
        System.out.println("\n\n=== ARREGLO INVERTIDO ===");
        for (int numero : numerosInvertidos) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
    /**
     * Obtiene una copia del arreglo de números originales.
     * 
     * <p>Este método retorna una copia del arreglo interno para mantener
     * el principio de encapsulamiento. Las modificaciones al arreglo
     * retornado no afectarán el estado interno del objeto.</p>
     * 
     * @return Copia del arreglo de números originales
     */
    public int[] getNumerosOriginales() {
        return numerosOriginales.clone();
    }
    
    /**
     * Obtiene una copia del arreglo de números invertidos.
     * 
     * <p>Este método retorna una copia del arreglo interno para mantener
     * el principio de encapsulamiento. Las modificaciones al arreglo
     * retornado no afectarán el estado interno del objeto.</p>
     * 
     * @return Copia del arreglo de números invertidos
     */
    public int[] getNumerosInvertidos() {
        return numerosInvertidos.clone();
    }
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * <p>Flujo de ejecución:</p>
     * <ol>
     *   <li>Muestra el encabezado del programa</li>
     *   <li>Crea una instancia de {@link InvertirNumerosArreglo}</li>
     *   <li>Imprime ambos arreglos (original e invertido)</li>
     *   <li>Muestra el mensaje de finalización</li>
     * </ol>
     * 
     * @param argumentos Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] argumentos) {
        System.out.println("==========================================");
        System.out.println("EJERCICIO 5: INVERTIR NÚMEROS");
        System.out.println("==========================================");
        
        InvertirNumerosArreglo ejercicio = new InvertirNumerosArreglo();
        ejercicio.imprimirArreglos();
        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
    }
}