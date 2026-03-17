package arreglos;

/**
 * Clase que genera los primeros 100 números pares y los muestra de diferentes formas.
 */
public class CienPrimerosPares {
    
    private int[] numerosPares;
    
    /**
     * Constructor que inicializa el arreglo con los primeros 100 números pares.
     */
    public CienPrimerosPares() {
        this.numerosPares = new int[100];
        generarNumerosPares();
    }
    
    /**
     * Genera los primeros 100 números pares.
     * Los números pares son múltiplos de 2: 2, 4, 6, 8, ...
     */
    private void generarNumerosPares() {
        for (int indice = 0; indice < 100; indice++) {
            numerosPares[indice] = 2 * (indice + 1);
        }
    }
    
    /**
     * Muestra todos los números pares en una sola línea.
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
     * Indica el número de línea al inicio de cada una.
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