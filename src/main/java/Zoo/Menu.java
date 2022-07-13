package Zoo;
/*
 * Despliega el menu para el ingreso del usuario al sistema
 * */
import Controllers.File_Controller;
import Email.Email_Sender;
import Habitat.Habitat;
import java.util.Scanner;

public class Menu {

  public static void menu_Principal() {
    Scanner userInput = new Scanner(System.in);
    String nombreUsuario = userInput.nextLine();
    System.out.println(
        "Bienvenido "
            + nombreUsuario
            + "!!\n---* Digite el numero del Habitad que desea visitar *---\n1. Aves\n2. Anfibios\n3. Mamiferos\n4. Peces\n5. Reptiles");
    int opcion = userInput.nextInt();
    switch (opcion) {
      case 1:
        // Metodo que imprime Animales en el habitad de Aves;
        System.out.println("---* Esta es una lista de las Aves que puedes visitar *---");
        String aves = "Aves";
        Habitat.Lista(aves);
        Menu_Opciones(aves);
        break;
      case 2:
        // Metodo que imprime Animales en el habitad de Anfibios
        System.out.println("---* Esta es una lista de los Anfibios que puedes visitar *---");
        String anfibios = "Anfibios";
        Menu_Opciones(anfibios);
        break;
      case 3:
        // Metodo que imprime Animales en el habitad de Mamiferos
        System.out.println("---* Esta es una lista de los Mamiferos que puedes visitar *---");
        String mamiferos = "Mamiferos";
        Menu_Opciones(mamiferos);
        break;
      case 4:
        // Metodo que imprime Animales en el habitad de Peces
        System.out.println("---* Esta es una lista de los Peces que puedes visitar *---");
        String peces = "Peces";
        Habitat.Lista(peces);
        Menu_Opciones(peces);
        break;
      case 5:
        // Metodo que imprime Animales en el habitad de Repitles
        System.out.println("---* Esta es una lista de los Reptiles que puedes visitar *---");
        String reptiles = "Reptiles";
        Menu_Opciones(reptiles);
        break;

      default:
        System.out.println("Ingrese un valor valido\n\n");
        menu_Principal();
        break;
    }
  }

  public static void Menu_Opciones(String habitat) {
    Scanner userInput = new Scanner(System.in);
    System.out.println(
        "Digite el numero de la opcion deseada:\n1. Regresar al menu principal\n2. Imprimir Lista\n3. Enviar lista por correo");
    int opcion = userInput.nextInt();
    switch (opcion) {
      case 1:
        // return
        menu_Principal();
        break;
      case 2:
        // metodo para imprimir lista
        File_Controller.CreateFile(Habitat.Lista(habitat), habitat);
        menu_Principal();
        break;
      case 3:
        // metodo para enviar por correo
        try {
          System.out.println("Ingrese el correo al que desea recibir la lista: ");
          String emailUsuario = userInput.nextLine();
          Email_Sender.sendMail(emailUsuario);
        } catch (Exception e) {
          System.out.println(e);
        }
        menu_Principal();
        break;
      default:
        System.out.println("Ingrese un valor valido\n\n");
        Menu_Opciones(habitat);
    }
  }
}
