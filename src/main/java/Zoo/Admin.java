package Zoo;

import java.util.Scanner;

/*Usa las clases Controladores
 * Añade animales a la Lista de Animales
 * Crea Archivos
 * Envia Archivos
 *
 * */
public class Admin {

  static void usuarioAdmin() {
    Scanner input = new Scanner(System.in);
    String nombreAdmin = input.nextLine();
    Menu.Saludo(nombreAdmin);
    Menu.menuAdmin(nombreAdmin);
  }
}
