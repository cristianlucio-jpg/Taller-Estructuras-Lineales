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
 * @since 2024
 */
public class PartidosFutbol {
    
    private ArrayList<String[]> partidos;
    
    public PartidosFutbol() {
        this.partidos = new ArrayList<>();
        inicializarPartidos();
    }
    
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
    
    private String formatearPartido(String[] partido) {
        return partido[0] + " " + partido[2] + " - " + partido[3] + " " + partido[1];
    }
    
    private int golesLocal(String[] partido) {
        return Integer.parseInt(partido[2]);
    }
    
    private int golesVisitante(String[] partido) {
        return Integer.parseInt(partido[3]);
    }
    
    private boolean esEmpate(String[] partido) {
        return golesLocal(partido) == golesVisitante(partido);
    }
    
    private boolean ganoVisitante(String[] partido) {
        return golesVisitante(partido) > golesLocal(partido);
    }
    
    private boolean ganoLocal(String[] partido) {
        return golesLocal(partido) > golesVisitante(partido);
    }
    
    private boolean ganoBarcelona(String[] partido) {
        String local = partido[0];
        String visitante = partido[1];
        int golesL = golesLocal(partido);
        int golesV = golesVisitante(partido);
        
        if (local.equals("Barcelona") && golesL > golesV) return true;
        if (visitante.equals("Barcelona") && golesV > golesL) return true;
        return false;
    }
    
    public void mostrarPartidosGanadosVisitante() {
        System.out.println("\n=== PARTIDOS DONDE EL VISITANTE FUE GANADOR ===");
        for (String[] partido : partidos) {
            if (ganoVisitante(partido)) {
                System.out.println(formatearPartido(partido));
            }
        }
    }
    
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
