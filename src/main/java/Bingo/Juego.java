package Bingo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Juego {
    private ArrayList<ArrayList<Integer>> prepararCarton() {
        ArrayList<ArrayList<Integer>> carton = new ArrayList<>();

        for (int nFila = 1; nFila <= 3; nFila++) {
            ArrayList<Integer> fila = new ArrayList<>();
            for (int i = 1; i <= 5; i++) {
                fila.add((int) (Math.random() * 99) + 1);
            }
            carton.add(fila);
        }
        return carton;
    }

    private boolean nombreYaExiste(ArrayList<Jugador> jugadores, String nombre) {
        for (Jugador jugador : jugadores) {
            if (jugador.getNombre().equalsIgnoreCase(nombre)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Jugador> registrarNombresJugadores(int numJugadores) {
        ArrayList<Jugador> jugadores = new ArrayList<>();

        try (Scanner teclado = new Scanner(System.in)) {
            for (int i = 1; i <= numJugadores; i++) {
                System.out.print("Nombre del jugador "+i+": ");
                String nombre = teclado.nextLine();

                while (nombre.isBlank() || nombreYaExiste(jugadores, nombre)) {
                    System.out.print("Por favor, escribe un nombre válido para el jugador: "+i+": ");
                    nombre = teclado.nextLine();
                }
                jugadores.add(new Jugador(nombre, new Carton(prepararCarton())));
            }
        }
        return jugadores;
    }

    public Bombo prepararBombo() {
        ArrayList<Integer> bombo = new ArrayList<>();

        for (int i = 1; i<= 99; i++) {
            bombo.add(i);
        }
        return new Bombo(bombo);
    }

    public void jugar(Bombo bombo, ArrayList<Jugador> jugadores) {
        ArrayList<Jugador> ganadores = new ArrayList<>();
        boolean primeraLinea = true;
        boolean cartonCompleto = false;

        while (!bombo.getBombo().isEmpty() && !cartonCompleto) {
            Collections.shuffle(bombo.getBombo());
            int nBolaSacada = bombo.getBombo().removeFirst();
            System.out.println("\nNúmero "+nBolaSacada);

            for (Jugador jugador : jugadores) {
                for (ArrayList<Integer> fila : jugador.getCarton().getCarton()) {
                    fila.removeIf(numero -> numero == nBolaSacada);
                }
                boolean filaEliminada = jugador.getCarton().getCarton().removeIf(ArrayList::isEmpty);

                if (filaEliminada && primeraLinea) {
                    System.out.println("\n>> Línea del jugador " + jugador.getNombre());
                    primeraLinea = false;
}
                if (jugador.getCarton().getCarton().isEmpty()) {
                    ganadores.add(jugador);
                    cartonCompleto = true;
                }
            }
        }
        System.out.println("\n>>>> Bingo del jugador / jugadores: ");
        for (int i = 0; i < ganadores.size(); i++) {
            System.out.println((i+1)+". "+ganadores.get(i).getNombre());
        }
    }
}
