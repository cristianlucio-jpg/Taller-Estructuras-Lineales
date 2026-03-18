package arraylist;

import java.util.ArrayList;

/**
 * Ejercicio 10: Gestión de partidos de fútbol.
 * 
 * <p>Este programa realiza las siguientes operaciones:</p>
 * <ul>
 *   <li>Muestra los partidos donde el visitante fue ganador</li>
 *   <li>Cuenta cuántas veces ganó el Barcelona</li>
 *   <li>Elimina los partidos que no terminaron en empate</li>
 *   <li>Cuenta cuántos partidos ganó el equipo local</li>
 * </ul>
 * 
 * @author Cristian Lucio
 * @version 1.0
 * @since 2026
 */
public class PartidosFutbol {
    
    /** ArrayList que almacena los partidos como arreglos de String [local, visitante, golesLocal, golesVisitante] */
    private ArrayList<String[]> partidos;
    
    /**
     * Constructor que inicializa el ArrayList y carga los partidos predeterminados.
     */
    public PartidosFutbol() {
        this.partidos = new ArrayList<>();
        inicializarPartidos();
    }
    
    /**
     * Inicializa la lista con 10 partidos de fútbol predeterminados.
     * 
     * <p>Cada partido se almacena como un arreglo de String con 4 elementos:
     * [equipoLocal, equipoVisitante, golesLocal, golesVisitante]</p>
     */
    private void inicializarPartidos() {
        partidos.add(new String[]{"Barcelona", "Real Madrid", "3", "1"});
        partidos.add(new String[]{"Atletico Madrid", "Barcelona", "2", "2"});
        partidos.add(new String[]{"Sevilla", "Valencia", "1", "2"});
        partidos.add(new String[]{"Barcelona", "Athletic Bilbao", "4", "0"});
        partidos.add(new String[]{"Real Sociedad", "Barcelona", "1", "3"});
        partidos.add(new String[]{"Villarreal", "Betis", "1", "1"});
        partidos.add(new String[]{"Barcelona", "Espanyol", "2", "1"});
        partidos.add(new String[]{"Getafe", "Barcelona", "1", "1"});
        partidos.add(new String[]{"Valencia", "Sevilla", "2", "0"});
        partidos.add(new String[]{"Barcelona", "Granada", "5", "2"});
    }
    
    /**
     * Formatea un partido para mostrarlo como String legible.
     * 
     * @param partido Arreglo con los datos del partido
     * @return String con formato "Local goles - goles Visitante"
     */
    private String formatearPartido(String[] partido) {
        return partido[0] + " " + partido[2] + " - " + partido[3] + " " + partido[1];
    }
    
    /**
     * Obtiene los goles del equipo local.
     * 
     * @param partido Arreglo con los datos del partido
     * @return Número de goles del equipo local
     */
    private int golesLocal(String[] partido) {
        return Integer.parseInt(partido[2]);
    }
    
    /**
     * Obtiene los goles del equipo visitante.
     * 
     * @param partido Arreglo con los datos del partido
     * @return Número de goles del equipo visitante
     */
    private int golesVisitante(String[] partido) {
        return Integer.parseInt(partido[3]);
    }
    
    /**
     * Determina si el partido terminó en empate.
     * 
     * @param partido Arreglo con los datos del partido
     * @return true si hay empate, false en caso contrario
     */
    private boolean esEmpate(String[] partido) {
        return golesLocal(partido) == golesVisitante(partido);
    }
    
    /**
     * Determina si el equipo visitante fue el ganador.
     * 
     * @param partido Arreglo con los datos del partido
     * @return true si ganó el visitante, false en caso contrario
     */
    private boolean ganoVisitante(String[] partido) {
        return golesVisitante(partido) > golesLocal(partido);
    }
    
    /**
     * Determina si el equipo local fue el ganador.
     * 
     * @param partido Arreglo con los datos del partido
     * @return true si ganó el local, false en caso contrario
     */
    private boolean ganoLocal(String[] partido) {
        return golesLocal(partido) > golesVisitante(partido);
    }
    
    /**
     * Determina si el Barcelona ganó el partido.
     * 
     * @param partido Arreglo con los datos del partido
     * @return true si el Barcelona ganó, false en caso contrario
     */
    private boolean ganoBarcelona(String[] partido) {
        String local = partido[0];
        String visitante = partido[1];
        int golesL = golesLocal(partido);
        int golesV = golesVisitante(partido);
        
        if (local.equals("Barcelona") && golesL > golesV) return true;
        if (visitante.equals("Barcelona") && golesV > golesL) return true;
        return false;
    }
    
    /**
     * Muestra todos los partidos donde el equipo visitante fue el ganador.
     */
    public void mostrarPartidosGanadosVisitante() {
        System.out.println("\n=== PARTIDOS DONDE EL VISITANTE FUE GANADOR ===");
        for (String[] partido : partidos) {
            if (ganoVisitante(partido)) {
                System.out.println(formatearPartido(partido));
            }
        }
    }
    
    /**
     * Cuenta y muestra cuántas veces ganó el Barcelona.
     */
    public void contarVictoriasBarcelona() {
        System.out.println("\n=== VICTORIAS DEL BARCELONA ===");
        int contador = 0;
        for (String[] partido : partidos) {
            if (ganoBarcelona(partido)) {
                contador++;
            }
        }
        System.out.println(contador);
    }
    
    /**
     * Elimina todos los partidos que no terminaron en empate
     * y muestra la lista resultante.
     */
    public void eliminarPartidosNoEmpates() {
        ArrayList<String[]> partidosAEliminar = new ArrayList<>();
        for (String[] partido : partidos) {
            if (!esEmpate(partido)) {
                partidosAEliminar.add(partido);
            }
        }
        partidos.removeAll(partidosAEliminar);
        
        System.out.println("\n=== PARTIDOS DESPUÉS DE ELIMINAR NO EMPATES ===");
        for (String[] partido : partidos) {
            System.out.println(formatearPartido(partido));
        }
    }
    
    /**
     * Cuenta y muestra cuántos partidos ganó el equipo local.
     */
    public void contarVictoriasLocal() {
        System.out.println("\n=== PARTIDOS GANADOS POR EL EQUIPO LOCAL ===");
        int contador = 0;
        for (String[] partido : partidos) {
            if (ganoLocal(partido)) {
                contador++;
            }
        }
        System.out.println(contador);
    }
    
    /**
     * Método principal que ejecuta el programa.
     * 
     * @param argumentos Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] argumentos) {
        System.out.println("==========================================");
        System.out.println("EJERCICIO 10: PARTIDOS DE FÚTBOL");
        System.out.println("==========================================");
        
        PartidosFutbol ejercicio = new PartidosFutbol();
        
        ejercicio.mostrarPartidosGanadosVisitante();
        ejercicio.contarVictoriasBarcelona();
        ejercicio.contarVictoriasLocal();
        ejercicio.eliminarPartidosNoEmpates();
        
        System.out.println("\n==========================================");
        System.out.println("FIN DEL PROGRAMA");
        System.out.println("==========================================");
    }
}