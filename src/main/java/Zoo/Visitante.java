package Zoo;

import lombok.Data;

import java.util.Scanner;

/*
 * Muestra los animales disponibles para ver
 *
 */
public class Visitante {

  static void usuarioVisitante() {
    Scanner input = new Scanner(System.in);
    String nombreVisitante = input.nextLine();
    Menu.Saludo(nombreVisitante);
    Menu.menuVisitante();
  }
}
