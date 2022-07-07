/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

import Entidades.Cine;
import Servicios.CineServicios;
import Servicios.EspectadorServicios;

/**
 *
 * @author Lautaro
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CineServicios cs = new CineServicios();
        
        System.out.println("Bienvenido a CINEGG");
        Cine newCine = cs.crearCine();
        System.out.println("El valor de la entrada hoy es de:");
        System.out.println(newCine.getCostoEntrada());
       
        System.out.println("La Pelicula de hoy es:");
        
        System.out.println(newCine.getPelicula());

        cs.llenarSala(newCine);
/*
        boolean p = false;
        int x = 10;
        int x2 =12;
        int y = 20;
        int y2 = 5;
        
        if ((x>=x2)||(y>=y2)) {
            p = true;
            
        }
        System.out.println(p);
  */              
    }

}
