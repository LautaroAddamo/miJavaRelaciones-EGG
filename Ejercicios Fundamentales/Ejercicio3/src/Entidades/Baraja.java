
package Entidades;

import java.util.ArrayList;


public class Baraja {
    
    private ArrayList<Carta> cartas;
    private int cartasDisponibles;
    private int posicionBaraja;

    public Baraja(ArrayList<Carta> miBaraja, int cartasDisponibles, int posicionBaraja) {
        this.cartas = miBaraja;
        this.cartasDisponibles = cartasDisponibles;
        this.posicionBaraja = posicionBaraja;
    }

    public Baraja() {
    }

    public ArrayList<Carta> getCartas   () {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> miBaraja) {
        this.cartas = miBaraja;
    }

    public int getCartasDisponibles() {
        return cartasDisponibles;
    }

    public void setCartasDisponibles(int cartasDisponibles) {
        this.cartasDisponibles = cartasDisponibles;
    }

    public int getPosicionBaraja() {
        return posicionBaraja;
    }

    public void setPosicionBaraja(int posicionBaraja) {
        this.posicionBaraja = posicionBaraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "miBaraja=" + cartas + ", cartasDisponibles=" + cartasDisponibles + ", posicionBaraja=" + posicionBaraja + '}';
    }

    
    
    
}
