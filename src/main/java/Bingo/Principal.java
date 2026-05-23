package Bingo;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Juego juego = new Juego();
        Bombo bombo = juego.prepararBombo();
        ArrayList<Jugador> jugadores = juego.registrarNombresJugadores(3);
        juego.jugar(bombo, jugadores);
    }
}
