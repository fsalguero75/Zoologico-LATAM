package Zoo;
/*
 * Despliega el menu para el ingreso del usuario al sistema
 * */
import Controllers.File_Controller;
import Habitat.Habitat;
import java.util.Scanner;


public class Menu {

  public static int opcion() {
    Scanner input = new Scanner(System.in);
    int opcionUsuario = input.nextInt();

    return opcionUsuario;
  }

  static void Saludo(String nombre) {

    System.out.println("\nBienvenido " + nombre + "\n\nDigite el numero de la opcion deseada:");
  }

  public static void menuInicio() {
    System.out.println(
        "\nEres Visitante o Admin?\nDigita el numero de la opcion:\n1.Admin\n2.Visitante");
    Scanner input = new Scanner(System.in);
    int usuario = input.nextInt();
    Usuario.validateUser(usuario);
  }

  public static void menuVisitante() {
    // Array con nombre de habitats
    String listaHabitats[] = {"Aves", "Anfibios", "Mamiferos", "Peces", "Reptiles"};
    for (int i = 0; i < listaHabitats.length; i++) {
      System.out.println("\n" + (i + 1) + ".Mostrar Habitat " + listaHabitats[i]);
    }
  }

  public static void menuAdmin() {
    System.out.println("1.Lista de Habitats");
    System.out.println("\n2.Enviar correo");
    System.out.println("\n3.Agregar Animal");
  }

  public static void opcionesHabitats(String habitat, int opcion) {

    //File_Controller.CreateFile(Habitat.(habitat), habitat);
  }

  public static void menuHabitats(int opcion) {
    // Array con Habitats

  }
}
