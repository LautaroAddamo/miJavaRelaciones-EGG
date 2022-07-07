/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Asiento;
import Entidades.Cine;
import Entidades.Espectador;

/**
 *
 * @author Lautaro
 */
public class CineServicios {

    PeliculaServicios ps = new PeliculaServicios();
    EspectadorServicios es = new EspectadorServicios();

    public Cine crearCine() {
        Cine cine = new Cine();
        cine.setPelicula(ps.crearPelicula());
        cine.setCostoEntrada(250);

        Asiento[][] sala = new Asiento[8][6];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Asiento asiento = new Asiento();
                asiento.setFila(i + 1);
                asiento.setColumna(Constantes.Constantes.COLUMNAS[j]);
                asiento.setOcupado(false);
                sala[i][j] = asiento;
            }

        }
        cine.setSalaCine(sala);
        return cine;
    }

    public void llenarSala(Cine cine) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                Espectador e = es.crearEspectador();

                System.out.print(cine.getSalaCine()[i][j]);
                if ((e.getDineroDisponible() >= cine.getCostoEntrada()) && (e.getEdad() >= cine.getPelicula().getAptaPara())) {
                    cine.getSalaCine()[i][j].setOcupado(true);
                }
                if (cine.getSalaCine()[i][j].isOcupado()) {
                    System.out.print("X");

                } else {
                    System.out.print(" ");
                }
                System.out.print("|");
            }

            System.out.println(" ");
        }

    }
}
