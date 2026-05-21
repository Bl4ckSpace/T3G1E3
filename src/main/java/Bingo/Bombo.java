package Bingo;

import java.util.ArrayList;

public class Bombo {
    private ArrayList<Integer> bombo;

    public Bombo(ArrayList<Integer> bombo) {
        this.bombo = bombo;
    }

    public ArrayList<Integer> getBombo() {
        return bombo;
    }

    @Override
    public String toString() {
        for (int i = 1; i<=99; i++) {
            this.bombo.add(i);
        }
        return this.bombo.toString();
    }
}
