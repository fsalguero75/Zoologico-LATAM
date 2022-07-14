package Zoo;

import lombok.Data;

import java.util.Scanner;

/*
 * Muestra los animales disponibles para ver
 *
 */
public class Visitante {

  static void usuarioVisitante() {
    System.out.println("Por favor indique a nuestro guia donde desea inicar su reccorido");
    Menu.menuHabitats();
    Menu.opcionesHabitats(Menu.opcionUsuario());

  }
}
