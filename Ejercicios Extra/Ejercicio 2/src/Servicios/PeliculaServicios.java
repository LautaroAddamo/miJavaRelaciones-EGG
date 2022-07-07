/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Pelicula;

/**
 *
 * @author Lautaro
 */
public class PeliculaServicios {
    public Pelicula crearPelicula(){
        Pelicula pelicula = new Pelicula();
           pelicula.setTitulo("El Señor de los Anillos");
           pelicula.setDirector("Peter Jackson");
           pelicula.setDuracion(220);
           pelicula.setAptaPara(16);
           return pelicula;
        }
    }

