
package Entidades;

import java.util.ArrayList;


public class Juego {
    private ArrayList<Jugador>listaJugadores;
    private Revolver revolver;

    public Juego(ArrayList<Jugador> listaJugadores, Revolver revolver) {
        this.listaJugadores = listaJugadores;
        this.revolver = revolver;
    }

    public Juego() {
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "listaJugadores=" + listaJugadores + ", revolver=" + revolver + '}';
    }
    
}
