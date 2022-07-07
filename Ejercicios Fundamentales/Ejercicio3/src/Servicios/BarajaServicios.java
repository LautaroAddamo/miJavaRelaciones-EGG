package Servicios;

import Constantes.Constantes;
import Entidades.Baraja;
import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BarajaServicios {

    final Scanner leer = new Scanner(System.in).useDelimiter("\n");
//Instancio dos barajas, una va a tener TODAS las cartas inicialmente, y la otra se va a ir llenando a medida se descarta la primera
    Baraja barajaNueva = new Baraja();
    Baraja cartasEntregadas = new Baraja();

    public void crearBaraja() {//metodo para crear la baraja inicial
        String[] palos = Constantes.PALOS; //creo un arreglo llenando cada posicion con la constante PALOS 
        ArrayList<Carta> miBaraja = new ArrayList<>();//Baraja inicial, con TODAS las cartas
        ArrayList<Carta> miMonton = new ArrayList<>();//Baraja con el descarte
        cartasEntregadas.setCartas(miMonton);//seteo el atributo del arraylist con el arraylist vacio del descarte
        for (int i = 0; i < Constantes.PALOS.length; i++) {//hasta 4 (espada, oro, copa, basto)
            System.out.println("Se crean las cartas de " + palos[i]);
//primero itera un palo, entra al bucle siguiente y al terminarlo itera el proximo palo
            for (int j = 0; j < 12; j++) {//Hasta 12 con una condicion para que NO guarde 8 y 9
                Carta carta = new Carta();
                if (!(j == 7 || j == 8)) {
                    if (j >= 9) {
                        carta.setNumero(j + 1);

                    } else {

                        carta.setNumero(j + 1);
                    }
                    miBaraja.add(carta);//voy cargando la lista con cara carta creada
                }
                carta.setPalo(palos[i]);//seteo el valor de palos en cada carta teniendo en cuenta la iteracion del primer for
            }

        }
        barajaNueva.setCartas(miBaraja);//seteo el atributo de la baraja que tiene todas las cartas
        barajaNueva.setCartasDisponibles(40);//al ser el comienzo, estan TODAS disponibles, por eso 40
        barajaNueva.setPosicionBaraja(0);//al ser el comienzo, la primer carta a sacar esta en la posicion 0
    }

    public void barajar() {//metodo al que se le envia como parametro una lista y la mezcla aleatoriamente
        Collections.shuffle(barajaNueva.getCartas());
    }

    /*
    El siguiente metodo siempre envia la primer posicion de la baraja, esa posicion se va a ir 
    modificando a medida que se quiten cartas de la baraja inicial, pero SIEMPRE muestra la primer
    posicion
     */
    public Carta siguienteCarta() {
        Carta devuelvoCarta = barajaNueva.getCartas().get(0);
        System.out.println("La siguiente carta es el " + barajaNueva.getCartas().get(0).toString());
        
        return devuelvoCarta;
    }

    /*
    El siguiente metodo SIEMPRE muestra el tamaño de la lista de la baraja inicial, ese tamaño
    se modifica a medida que se eliminen cartas de la baraja.
   
     */
    public void cartasDisponibles() {//Muestra el tamaño de la baraja de cartas que aun no se mostraron
        System.out.println(barajaNueva.getCartas().size());
    }

    public void darCartas() {
        System.out.println("Cuantas cartas quiere pedir");//Pregunta al usuario cuantas cartas quiere
        int pedir = leer.nextInt();//leo la cantidad pedida en una variable
        if (pedir <= barajaNueva.getCartas().size()) {//valida que las cartas que pidio sean menos que las disponibles en la baraja
            for (int i = 0; i < pedir; i++) {
                /*
                Este for entrega las cartas de la baraja segun la posicion de i.
                Luego agrega esa carta a la lista de las que se descartaron, que SIEMPRE sera la posicion 0 de la baraja inicial
                Por ultimo ELIMINA de la baraja inicial la carta entregada
                 */

                System.out.println("Se entrega el " + barajaNueva.getCartas().get(0).toString());
                cartasEntregadas.getCartas().add(barajaNueva.getCartas().get(0));
                barajaNueva.getCartas().remove(0);
            }
        } else {
            System.out.println("Cartas insuficientes. Disponibles: ");
            cartasDisponibles();

        }
    }

    public void cartasMonton() {
        if (cartasEntregadas.getCartas().size() == 0) {//indica que no hay cartas descartadas
            System.out.println("Aun no se entrego ninguna carta");
        } else {
            System.out.println("Las cartas retiradas son:");
            for (Carta aux : cartasEntregadas.getCartas()) {//traigo el get del mazo de descarte
                System.out.println(aux);
            }
        }
    }

    public void mostrarBaraja() {
        for (Carta aux : barajaNueva.getCartas()) {
            System.out.println(aux);
        }
    }

    public void menu() {//Menu tipico que llama a los metodos a gusto del usuario
        System.out.println("");
        System.out.println("----- MENU -----");
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Barajar el mazo");
        System.out.println("2. Ver siguiente carta");
        System.out.println("3. Pedir cartas");
        System.out.println("4. Ver cartas ya usadas");
        System.out.println("5. Ver cartas aún en el mazo");
        System.out.println("6. Salir del programa");
        System.out.println("");
        String opc = leer.next();
        switch (opc) {
            case "1":
                barajar();
                System.out.println("Mazo barajado");
                menu();
                break;
            case "2":
                siguienteCarta();
                menu();
                break;
            case "3":
                darCartas();
                menu();
                break;
            case "4":
                cartasMonton();
                menu();
                break;
            case "5":
                mostrarBaraja();
                menu();
                break;
            case "6":
                System.out.println("Ejecución finalizada");
                break;
            default:
                System.out.println("Opcion no válida");
                ;
                menu();
        }
    }
}
