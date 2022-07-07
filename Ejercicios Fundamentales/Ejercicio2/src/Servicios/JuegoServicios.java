package Servicios;

import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class JuegoServicios {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    JugadorServicios jugS = new JugadorServicios();
    RevolverServicios rs = new RevolverServicios();
    Revolver r = new Revolver();
    Juego juegoNuevo = new Juego();

    public void llenarJuego() {//inicia los jugadores
        rs.llenarRevolver(r);
        System.out.println(r.getPosicionActual() + " pos actual");
        System.out.println(r.getPosicionAgua() + " pos agua");

        juegoNuevo.setRevolver(r);

        System.out.println("Cuantos jugadores van a participar de su juego");

        int participantes = leer.nextInt();
        if (participantes < 1 || participantes > 6) {
            participantes = 6;
        }
        ArrayList<Jugador> aux = new ArrayList();
        for (int i = 0; i < participantes; i++) {

            aux.add(jugS.cargarJugador());

        }
        juegoNuevo.setListaJugadores(aux);

        System.out.println("Los jugadores son:\n");

        for (Jugador tipito : juegoNuevo.getListaJugadores()) {
            System.out.println(tipito);
        }

    }

    public void comienzoDeJuego() {
        /*
        Itera cada jugador de la lista, si devuelve true el metodo jugS.disparo, el jugador se moja y termina el juego
        sino, se ejecuta el metodo rs.siguienteChorro y vuelve a iterar con el proximo jugador
         */
        llenarJuego();

        System.out.println("INICIA EL JUEGO");

        System.out.println("SE ACABA DE CARGAR EL REVOLVER");

        int turno = 1;
        boolean jugadorMojado = false;
        do {
            for (Jugador aux : juegoNuevo.getListaJugadores()) {
                System.out.println("Turno :" + turno);
                System.out.println("El jugador " + aux.getNombre() + " va a disparar");

                if (jugS.disparo(juegoNuevo.getRevolver())) {
                    aux.setMojado(true);
                    jugadorMojado = true;

                }
                if (jugadorMojado == true) {
                    System.out.println(aux.toString() + "PERDIO. Se ha mojado.");
                    break;
                } else {
                    System.out.println(aux.getNombre() + "Safo de mojarse, pase el que sigue");
                }
                turno++;
            }

        } while (jugadorMojado != true);

        for (Jugador listaJugadore : juegoNuevo.getListaJugadores()) {
            System.out.println(listaJugadore);
        }
    }
}
