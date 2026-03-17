package arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 * Ejercicio 6: Leer números enteros aleatorios entre -10 y 10 y guardarlos en un ArrayList
 * hasta que se genere el número 10. Muestra los números leídos, su suma y su media.
 * 
 * <p>Este programa genera números aleatorios entre -10 y 10, los almacena en un ArrayList
 * hasta que aparece el número 10 (que no se incluye en la lista). Luego muestra:
 * <ul>
 *   <li>Los números generados</li>
 *   <li>La suma de todos los números</li>
 *   <li>La media aritmética con 2 decimales</li>
 * </ul>
 * </p>
 * 
 * <p>Principios aplicados:</p>
 * <ul>
 *   <li><b>KISS:</b> Código simple con un bucle do-while para la generación.</li>
 *   <li><b>DRY:</b> La lógica de generación está encapsulada en un método.</li>
 *   <li><b>YAGNI:</b> Solo implementa la funcionalidad requerida.</li>
 *   <li><b>Single Responsibility:</b> Cada método tiene una única responsabilidad.</li>
 *   <li><b>Encapsulamiento:</b> El ArrayList es privado.</li>
 * </ul>
 * 
 * @author Cristian Lucio
 * @version 1.0
 * @since 2024
 */
public class ArrayListNumeros {
    
    /** Límite inferior del rango de números aleatorios */
    private static final int limiteInferior = -10;
    
    /** Límite superior del rango de números aleatorios */
    private static final int limiteSuperior = 10;
    
    /** Número que detiene la generación (no se incluye en la lista) */
    private static final int numeroDetencion = 10;
    
    /** ArrayList que almacena los números generados */
    private ArrayList<Integer> numeros;
    
    /** Suma de todos los números generados */
    private int suma;
    
    /** Media de los números generados */
    private double media;
    
    /**
     * Constructor que inicializa el ArrayList y las variables.
     * 
     * <p>Crea un ArrayList vacío y establece suma y media en cero.</p>
     */
    public ArrayListNumeros() {
        this.numeros = new ArrayList<>();
        this.suma = 0;
        this.media = 0.0;
    }
    
    /**
     * Genera números aleatorios hasta que aparece el número 10.
     * 
     * <p>El proceso funciona de la siguiente manera:</p>
     * <ol>
     *   <li>Genera un número aleatorio entre -10 y 10</li>
     *   <li>Si el número NO es 10, lo agrega al ArrayList</li>
     *   <li>Si el número ES 10, termina el bucle sin agregarlo</li>
     * </ol>
     * 
     * <p>Fórmula utilizada: nextInt(rango) + limiteInferior
     * donde rango = limiteSuperior - limiteInferior + 1 = 21</p>
     */
    public void generarNumerosHastaDiez() {
        Random generador = new Random();
        int rango = limiteSuperior - limiteInferior + 1; // 10 - (-10) + 1 = 21
        int numeroGenerado;
        
        do {
            numeroGenerado = generador.nextInt(rango) + limiteInferior; // -10 a 10
            
            if (numeroGenerado != numeroDetencion) {
                numeros.add(numeroGenerado);
            }
        } while (numeroGenerado != numeroDetencion);
    }
    
    /**
     * Calcula la suma de todos los números en el ArrayList.
     * 
     * <p>Recorre el ArrayList usando un bucle for-each y acumula
     * cada valor en la variable {@link #suma}.</p>
     */
    public void calcularSuma() {
        suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }
    }
    
    /**
     * Calcula la media de los números en el ArrayList.
     * 
     * <p>La media se calcula como suma / cantidad de elementos.
     * Si el ArrayList está vacío, la media es 0.0.</p>
     * 
     * <p>Se usa casting a double para obtener decimales.</p>
     */
    public void calcularMedia() {
        if (numeros.isEmpty()) {
            media = 0.0;
        } else {
            media = (double) suma / numeros.size();
        }
    }
    
    /**
     * Muestra todos los números generados.
     * 
     * <p>Los números se muestran en una sola línea separados por espacios.</p>
     */
    public void mostrarNumeros() {
        System.out.println("\n=== NÚMEROS GENERADOS ===");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }
    
    /**
     * Muestra la suma y la media de los números generados.
     * 
     * <p>La suma se muestra como entero.
     * La media se muestra con 2 decimales usando formato printf.</p>
     */
    public void mostrarSumaYMedia() {
        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Suma: " + suma);
        System.out.printf("Media: %.2f%n", media);
    }
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * <p>Flujo de ejecución:</p>
     * <ol>
     *   <li>Muestra el encabezado del programa</li>
     *   <li>Crea una instancia de {@link ArrayListNumeros}</li>
     *   <li>Genera números hasta obtener un 10</li>
     *   <li>Calcula la suma y la media</li>
     *   <li>Muestra los números generados</li>
     *   <li>Muestra la suma y la media</li>
     *   <li>Muestra el pie del programa</li>
     * </ol>
     * 
     * @param argumentos Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] argumentos) {
        System.out.println("==========================================");
        System.out.println("EJERCICIO 6: ARRAYLIST CON NÚMEROS ALEATORIOS");
        System.out.println("==========================================");
        
        ArrayListNumeros ejercicio = new ArrayListNumeros();
        
        ejercicio.generarNumerosHastaDiez();
        ejercicio.calcularSuma();
        ejercicio.calcularMedia();
        ejercicio.mostrarNumeros();
        ejercicio.mostrarSumaYMedia();
        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
    }
}