package arreglos;

/**
 * Clase que genera y muestra los primeros 10 números primos.
 * Aplicando el principio KISS: mantener el código simple y directo.
 */
public class DiezPrimos {
    
    private int[] primerosDiezPrimos = new int[10];
    
    /**
     * Genera los primeros 10 números primos
     */
    public void generarPrimerosDiezPrimos() {
        int cantidadEncontrados = 0;
        int numeroEvaluar = 2; // El primer número primo es 2
        
        while (cantidadEncontrados < 10) {
            if (esNumeroPrimo(numeroEvaluar)) {
                primerosDiezPrimos[cantidadEncontrados] = numeroEvaluar;
                cantidadEncontrados++;
            }
            numeroEvaluar++;
        }
    }
    
    /**
     * Verifica si un número es primo
     * @param numero el número a verificar
     * @return verdadero si es primo, falso si no lo es
     */
    private boolean esNumeroPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        
        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    /**
     * Muestra los primeros 10 números primos
     */
    public void mostrarPrimerosDiezPrimos() {
        System.out.println("Los primeros 10 números primos son:");
        
        for (int indice = 0; indice < 10; indice++) {
            System.out.print(primerosDiezPrimos[indice]);
            
            // Agregar coma si no es el último elemento
            if (indice < 9) {
                System.out.print(", ");
            }
        }
        
        System.out.println();
    }

    
    /**
     * Método principal que ejecuta el programa
     */
    public static void main(String[] argumentos) {
        DiezPrimos programa = new DiezPrimos();
        
        programa.generarPrimerosDiezPrimos();
        programa.mostrarPrimerosDiezPrimos();
 
    }
}
