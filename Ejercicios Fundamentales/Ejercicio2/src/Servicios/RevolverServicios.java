
package Servicios;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.Scanner;


public class RevolverServicios {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void llenarRevolver(Revolver r){//crea un revolver aleatorio para el proximo juego y lo guarda en el objeto r
        
        r.setPosicionActual((int)(Math.random()*6)+1);
        r.setPosicionAgua((int)(Math.random()*6)+1);
        
    }
    
    public boolean aguaEnCanon(Revolver r){//determina si el proximo disparo va a mojar o no
        boolean carga = false;
        if(r.getPosicionAgua()==r.getPosicionActual()){
            carga = true;
        }
        return carga;
    }
    public void siguienteChorro(Revolver r){//cambia a la siguiente posicion del revolver
        if (r.getPosicionActual()==6) {
            r.setPosicionActual(1);
        }else{
            r.setPosicionActual(r.getPosicionActual()+1);
        }
    }
    public void mostrarCargas(Revolver r){
        r.toString();
    }
    
}
