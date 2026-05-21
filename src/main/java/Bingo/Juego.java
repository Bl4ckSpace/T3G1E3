package Bingo;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    public ArrayList<Jugador> registrarNombresJugadores(int numJugadores) {
        ArrayList<Jugador> jugadores = new ArrayList<>();

        try (Scanner teclado = new Scanner(System.in)) {
            for (int i = 1; i <= numJugadores; i++) {
                System.out.println("Nombre del jugador "+i+": ");
                String nombre = teclado.nextLine();


            }
        }
    }
}
