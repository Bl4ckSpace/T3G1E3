package Bingo;

public class Jugador {
    private String nombre;
    private Carton carton;

    public Jugador(String nombre, Carton carton) {
        this.nombre = nombre;
        this.carton = carton;
    }

    public String getNombre() {
        return nombre;
    }

    public Carton getCarton() {
        return carton;
    }

    @Override
    public String toString() {
        return this.nombre+this.carton;
    }
}
