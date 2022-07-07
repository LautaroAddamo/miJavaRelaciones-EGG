package ejercicio1;//Y UNO EXTRA

import Servicios.PerroServicios;
import Servicios.PersonaServicios;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        final Scanner leer = new Scanner(System.in).useDelimiter("\n");
        PersonaServicios hs = new PersonaServicios();//hs por humano
        PerroServicios ps = new PerroServicios();
        System.out.println("Indique las personas que estan aptas para adoptar");
        String opc;
        do {
            hs.crearPersona();
            
            System.out.println("Desea guardar otra persona? S/N");
            opc = leer.next();
            
        } while (!opc.equalsIgnoreCase("N"));
        
        
        System.out.println("");
        
        System.out.println("");

        //hs.mostrarPersonas();
        hs.adoptar();
        
        hs.mostrarPersonas();
    }
    
}
