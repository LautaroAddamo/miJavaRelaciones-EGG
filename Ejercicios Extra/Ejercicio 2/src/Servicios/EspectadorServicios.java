/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidades.Espectador;
import Constantes.Constantes;
/**
 *
 * @author Lautaro
 */
public class EspectadorServicios {
    
    public Espectador crearEspectador(){
        Espectador e = new Espectador();
        e.setNombre(Constantes.NOMBRES[(int)(Math.random()*5)]);
        e.setDineroDisponible((Math.random()*400+50));
        e.setEdad((int)(Math.random()*35 + 10));
        return e;
    }
    
}
