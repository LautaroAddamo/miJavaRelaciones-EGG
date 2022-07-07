package Servicios;

import Entidades.Perro;
import Entidades.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServicios {

    private final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    ArrayList<Persona> listaPersonas = new ArrayList<>();//creo lista de personas

    public void crearPersona() {//creamos personas y las agregamos a la lista

        Persona crear = new Persona();
        System.out.println("Indique el nombre");
        crear.setNombre(leer.next());

        System.out.println("Indique el apellido");
        crear.setApellido(leer.next());
        System.out.println("Indique el DNI");
        crear.setDNI(leer.next());
        System.out.println("Indique su edad");
        crear.setEdad(leer.nextInt());

        listaPersonas.add(crear);
    }

    public void mostrarPersonas() {
        for (Persona aux : listaPersonas) {
            System.out.println(aux);
        }
    }

    public void adoptar() {
        PerroServicios ps = new PerroServicios();

        System.out.println("Indique los perros disponibles para adopcion");
        String opc;
        //carga perros hasta que indica que no quiere cargar mas
        do {
            ps.crearPerro();

            System.out.println("Hay mas perros para adoptar?S/N");
            opc = leer.next();
        } while (!opc.equalsIgnoreCase("n"));
        /*
        Creo un arraylist para guardar los perros que ya fueron adoptados,
        cuando se adopta un perro, lo borro de la lista inicial, y lo agrego a la otra.
         */

        ArrayList<Perro> perrosAdoptados = new ArrayList<>();
        for (Persona persona : listaPersonas) {

            System.out.println(persona.getNombre() + " Seleccione el nombre del perro que desea adoptar");

            ps.mostrarPerros();

            String adoptar = leer.next();
            int cont = 0, pos = 0;
            boolean band = false;
            /*
            Al iterar cada persona itera todos los perros.
            
            */
            for (int i = 0; i < ps.listaPerros.size(); i++) {

                if (adoptar.equalsIgnoreCase(ps.listaPerros.get(i).getNombre())) {
                    /*
                    Si adoptar es igual al nombre del perro de la iteracion
                    aumenta el contador con el cual luego indico si adopto o no.
                    le seteo el perro a la persona
                    agrego el perro a la lista de perros adoptados
                    elimino el perro de la lista que esta iterando
                    cambio la bandera a true para que no ingrese a la condicion siguiente
                    */
                    persona.setPerro(ps.listaPerros.get(i));
                    cont++;
                    perrosAdoptados.add(ps.listaPerros.get(i));
                    //ps.listaPerros.remove(i);
                    band = true;
                    
                }
                if (band == false) {

                    if (adoptar.equalsIgnoreCase(perrosAdoptados.get(pos).getNombre())) {
                        /*
                        si el nombre coincide con algun perro que se agrego en la lista de adoptados
                        indica que ya fue adoptado el perro
                        y aumenta en uno la variable de posicion con la cual le envio el elemento de la lista de perrosadoptados
                        */
                        System.out.println("Lo sentimos " + persona.getNombre() + "." + perrosAdoptados.get(pos).getNombre() + "ya fue adoptado.");
                        pos++;
                        band = true;
                    }

                }

            }
            if (cont == 0) {
                System.out.println(persona.getNombre() + " No adopto ningun perro");
            } else {
                System.out.println(persona.getNombre() + " Adopto a " + adoptar);

            }
        }
    }

}
