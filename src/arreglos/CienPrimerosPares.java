package arreglos;

/**
 * Clase que genera los primeros 100 números pares y los muestra de diferentes formas.
 * 
 * Esta clase permite generar automáticamente los números pares del 2 al 200
 * y visualizarlos de dos maneras distintas: en una sola línea o en 10 líneas
 * con numeración.
 */
public class CienPrimerosPares {
    
    private int[] numerosPares;
    
    /**
     * Constructor que inicializa el arreglo con los primeros 100 números pares.
     * 
     * Crea un arreglo de 100 posiciones y llama al método generarNumerosPares()
     * para llenarlo con los valores correspondientes.
     */
    public CienPrimerosPares() {
        this.numerosPares = new int[100];
        generarNumerosPares();
    }
    
    /**
     * Genera los primeros 100 números pares.
     * 
     * Los números pares son múltiplos de 2. Este método calcula cada número
     * usando la fórmula: 2 * (índice + 1), donde el índice va desde 0 hasta 99,
     * generando así los valores: 2, 4, 6, ..., 200.
     */
    private void generarNumerosPares() {
        for (int indice = 0; indice < 100; indice++) {
            numerosPares[indice] = 2 * (indice + 1);
        }
    }
    
    /**
     * Muestra todos los números pares en una sola línea.
     * 
     * Imprime los 100 números pares separados por comas en una única línea
     * de salida. El formato es: "2, 4, 6, 8, ..., 200"
     */
    public void mostrarEnUnaLinea() {
        System.out.println("\n=== PRIMEROS 100 NÚMEROS PARES (UNA LÍNEA) ===");
        
        for (int indice = 0; indice < 100; indice++) {
            System.out.print(numerosPares[indice]);
            if (indice < 99) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    /**
     * Muestra los números pares en 10 líneas, cada una con 10 números.
     * 
     * Organiza los 100 números pares en 10 filas de 10 números cada una.
     * Cada línea comienza con el texto "Línea X:" donde X es el número de línea
     * del 1 al 10, seguido de los 10 números pares correspondientes.
     */
    public void mostrarEnDiezLineas() {
        System.out.println("\n=== PRIMEROS 100 NÚMEROS PARES (DIEZ LÍNEAS) ===");
        
        int contador = 0;
        for (int linea = 1; linea <= 10; linea++) {
            System.out.print("Línea " + linea + ": ");
            
            for (int posicion = 0; posicion < 10; posicion++) {
                System.out.print(numerosPares[contador]);
                if (posicion < 9) {
                    System.out.print(", ");
                }
                contador++;
            }
            System.out.println();
        }
    }
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * Crea una instancia de la clase CienPrimerosPares y llama a los métodos
     * de visualización para mostrar los resultados en los formatos solicitados.
     * 
     * @param argumentos argumentos de línea de comandos (no se utilizan en este programa)
     */
    public static void main(String[] argumentos) {
        System.out.println("==========================================");
        System.out.println("PRIMEROS 100 NÚMEROS PARES");
        System.out.println("==========================================");
        
        CienPrimerosPares pares = new CienPrimerosPares();
        
        pares.mostrarEnUnaLinea();
        pares.mostrarEnDiezLineas();

        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
    }
}