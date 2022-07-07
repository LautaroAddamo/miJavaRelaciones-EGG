package Servicios;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.Scanner;

public class JugadorServicios {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private final RevolverServicios rs = new RevolverServicios();

    public Jugador cargarJugador() {//crea un jugador nuevo
        Jugador crear = new Jugador();

        System.out.println("Ingrese el ID del jugador");
        crear.setId(leer.nextInt());
        System.out.println("Ingrese el nombre");
        crear.setNombre(leer.next());
        crear.setMojado(false);
        return crear;
    }

    public boolean disparo(Revolver r) {//dispara y moja, o dispara y pasa a la siguiente posicion del revolver
        boolean seHaMojado = false;
        if (rs.aguaEnCanon(r)) {
            seHaMojado = true;
        }
        rs.siguienteChorro(r);
        return seHaMojado;
    }
}
