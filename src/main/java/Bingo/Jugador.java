package Bingo;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private ArrayList<Integer> carton;

    public Jugador(String nombre, ArrayList<Integer> carton) {
        this.nombre = nombre;
        this.carton = carton;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Integer> getCarton() {
        return carton;
    }

    @Override
    public String toString() {
        StringBuilder fila1 = new StringBuilder();
        StringBuilder fila2 = new StringBuilder();
        StringBuilder fila3 = new StringBuilder();

        for (Integer numero : this.carton) {
            fila1.append(numero).append(numero).append(numero).append(numero).append(numero);
            fila2.append(numero).append(numero).append(numero).append(numero).append(numero);
            fila3.append(numero).append(numero).append(numero).append(numero).append(numero);
        }

        return "F1: "+fila1+"\nF2: "+fila2+"\nF3: "+fila3;
    }
}
