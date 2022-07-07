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
public class Cine {
    private Asiento[][] salaCine;
    private Pelicula pelicula;
    private double costoEntrada;

    public Cine(Asiento[][] salaCine, Pelicula pelicula, double costoEntrada) {
        this.salaCine = salaCine;
        this.pelicula = pelicula;
        this.costoEntrada = costoEntrada;
    }

    public Cine() {
    }

    public Asiento[][] getSalaCine() {
        return salaCine;
    }

    public void setSalaCine(Asiento[][] salaCine) {
        this.salaCine = salaCine;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getCostoEntrada() {
        return costoEntrada;
    }

    public void setCostoEntrada(double costoEntrada) {
        this.costoEntrada = costoEntrada;
    }

    @Override
    public String toString() {
        return "Cine{" + "salaCine=" + salaCine + ", pelicula=" + pelicula + ", costoEntrada=" + costoEntrada + '}';
    }
    
    
}
