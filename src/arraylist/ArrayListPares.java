package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio 7: Inicializar un ArrayList con los 20 primeros números pares.
 * 
 * <p>Este programa realiza las siguientes operaciones:</p>
 * <ul>
 *   <li>Inicializa un ArrayList con los primeros 20 números pares (2, 4, 6, ..., 40)</li>
 *   <li>Imprime el ArrayList original</li>
 *   <li>Inserta un número ingresado por el usuario en la posición correcta (orden ascendente)</li>
 *   <li>Imprime el ArrayList después de la inserción</li>
 *   <li>Elimina un número ingresado por el usuario</li>
 *   <li>Imprime el ArrayList después de la eliminación</li>
 * </ul>
 * 
 * <p>Principios aplicados:</p>
 * <ul>
 *   <li><b>KISS:</b> Código simple con métodos específicos para cada operación.</li>
 *   <li><b>DRY:</b> La lógica de impresión está encapsulada en un método reutilizable.</li>
 *   <li><b>YAGNI:</b> Solo implementa la funcionalidad requerida, sin mensajes extras.</li>
 *   <li><b>Single Responsibility:</b> Cada método tiene una única responsabilidad.</li>
 *   <li><b>Encapsulamiento:</b> El ArrayList es privado.</li>
 * </ul>
 * 
 * @author Cristian Lucio
 * @version 1.0
 * @since 2026
 */
public class ArrayListPares {
    
    /** ArrayList que almacena los números pares */
    private ArrayList<Integer> numerosPares;
    
    /** Cantidad de números pares a generar (primeros 20) */
    private static final int cantidadNumeros = 20;
    
    /**
     * Constructor que inicializa el ArrayList y lo llena con los primeros 20 números pares.
     * 
     * <p>Los números pares se generan usando la fórmula: 2 * (indice + 1)
     * <br>Esto produce la secuencia: 2, 4, 6, 8, ..., 40</p>
     */
    public ArrayListPares() {
        this.numerosPares = new ArrayList<>();
        inicializarPares();
    }
    
    /**
     * Inicializa el ArrayList con los primeros 20 números pares en orden ascendente.
     * 
     * <p>Ejemplo de generación:</p>
     * <ul>
     *   <li>índice 0 → 2 * (0 + 1) = 2</li>
     *   <li>índice 1 → 2 * (1 + 1) = 4</li>
     *   <li>índice 19 → 2 * (19 + 1) = 40</li>
     * </ul>
     */
    private void inicializarPares() {
        for (int indice = 0; indice < cantidadNumeros; indice++) {
            numerosPares.add(2 * (indice + 1));
        }
    }
    
    /**
     * Imprime el ArrayList con formato de lista entre corchetes.
     * 
     * @param mensaje Título o descripción a mostrar antes de la lista
     */
    public void imprimirArrayList(String mensaje) {
        System.out.println("\n" + mensaje);
        System.out.print("[");
        for (int indice = 0; indice < numerosPares.size(); indice++) {
            System.out.print(numerosPares.get(indice));
            if (indice < numerosPares.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    /**
     * Inserta un número en el ArrayList manteniendo el orden ascendente.
     * 
     * <p>Recorre el ArrayList hasta encontrar la posición donde el número a insertar
     * es menor o igual al elemento actual, y lo inserta en esa posición.</p>
     * 
     * @param numero Número a insertar en el ArrayList
     */
    public void insertarNumero(int numero) {
        int posicionInsercion = 0;
        while (posicionInsercion < numerosPares.size() && 
               numerosPares.get(posicionInsercion) < numero) {
            posicionInsercion++;
        }
        numerosPares.add(posicionInsercion, numero);
    }
    
    /**
     * Elimina la primera ocurrencia de un número en el ArrayList.
     * 
     * <p>Busca el número en el ArrayList y si lo encuentra, lo elimina.
     * Si el número no existe, no realiza ninguna acción.</p>
     * 
     * @param numero Número a eliminar del ArrayList
     */
    public void eliminarNumero(int numero) {
        for (int indice = 0; indice < numerosPares.size(); indice++) {
            if (numerosPares.get(indice) == numero) {
                numerosPares.remove(indice);
                break;
            }
        }
    }
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * <p>Flujo de ejecución:</p>
     * <ol>
     *   <li>Muestra el encabezado del programa</li>
     *   <li>Inicializa el ArrayList con los primeros 20 números pares</li>
     *   <li>Imprime el ArrayList original</li>
     *   <li>Solicita un número para insertar y lo inserta</li>
     *   <li>Imprime el ArrayList después de la inserción</li>
     *   <li>Solicita un número para eliminar y lo elimina</li>
     *   <li>Imprime el ArrayList después de la eliminación</li>
     *   <li>Muestra el pie del programa</li>
     * </ol>
     * 
     * @param argumentos Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] argumentos) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("==========================================");
        System.out.println("EJERCICIO 7: ARRAYLIST CON NÚMEROS PARES");
        System.out.println("==========================================");
        
        ArrayListPares ejercicio = new ArrayListPares();
        
        // 1. Imprimir ArrayList original
        ejercicio.imprimirArrayList("=== ARRAYLIST ORIGINAL (20 primeros pares) ===");
        
        // 2. Insertar un número
        System.out.print("\nIngrese un número para insertar: ");
        int numeroInsertar = lector.nextInt();
        ejercicio.insertarNumero(numeroInsertar);
        ejercicio.imprimirArrayList("=== ARRAYLIST DESPUÉS DE INSERTAR ===");
        
        // 3. Eliminar un número
        System.out.print("\nIngrese un número para eliminar: ");
        int numeroEliminar = lector.nextInt();
        ejercicio.eliminarNumero(numeroEliminar);
        ejercicio.imprimirArrayList("=== ARRAYLIST DESPUÉS DE ELIMINAR ===");
        
        lector.close();
        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
    }
}