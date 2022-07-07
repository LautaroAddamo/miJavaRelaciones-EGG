/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Lautaro
 */
public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;
    private int aptaPara;

    public Pelicula(String titulo, String director, int duracion, int aptaPara) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.aptaPara = aptaPara;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getAptaPara() {
        return aptaPara;
    }

    public void setAptaPara(int aptaPara) {
        this.aptaPara = aptaPara;
    }

    @Override
    public String toString() {
        return titulo + ". Dirigida por " + director + ". Apta para mayores de: " + aptaPara + " años";
    }
    
}
