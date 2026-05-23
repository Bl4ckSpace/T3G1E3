package Bingo;

import java.util.ArrayList;

public class Carton {
    private ArrayList<ArrayList<Integer>> carton;

    public Carton(ArrayList<ArrayList<Integer>> carton) {
        this.carton = carton;
    }

    public ArrayList<ArrayList<Integer>> getCarton() {
        return carton;
    }

    @Override
    public String toString() {
        StringBuilder cadenaCarton = new StringBuilder();
        int numFila = 1;
        for (ArrayList<Integer> fila : this.carton) {
            cadenaCarton.append("Fila ").append(numFila).append(": ");
            for (Integer numero : fila) {
                cadenaCarton.append(numero).append(" | ");
            }
        cadenaCarton.append("\n");
        numFila++;
        }
        return cadenaCarton.toString();
    }
}
