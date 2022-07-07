
package Servicios;
import Entidades.Persona;
import Entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;


public class PerroServicios {
    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Perro> listaPerros = new ArrayList<>();//creo una lista de perros
    
    public void crearPerro(){//creamos un perro y lo agregamos en la lista
        Perro crear = new Perro();
        System.out.println("Indique el nombre del perro");
        crear.setNombre(leer.next());
        
        System.out.println("Indique la raza");
        crear.setRaza(leer.next());
        
        System.out.println("Indique la edad del perro");
        crear.setEdad(leer.nextInt());
        System.out.println("Indique el tamaño del perro");
        crear.setTamaño(leer.next());
        
        listaPerros.add(crear);
    }
    public void mostrarPerros(){
        for (Perro aux : listaPerros) {
            System.out.println(aux);
        }
    }
    
}
