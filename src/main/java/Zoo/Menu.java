package Zoo;
/*
 * Despliega el menu para el ingreso del usuario al sistema
 * */

import Email.Email_Sender;
import File.FileGenerator;
import Habitat.Habitat;
import Habitat.Lista_Animales;
import org.apache.log4j.Logger;
import javax.mail.MessagingException;
import java.util.Scanner;

public class Menu {

  private static Logger logger = Logger.getLogger(Menu.class);
  public static void menuInicio() throws MessagingException {
    System.out.println("\nIndique como desea ingresar\nDigita el numero de la opcion:\n1.Admin\n2.Visitante");
    Scanner input = new Scanner(System.in);
    int usertype = input.nextInt();
    //Metodo valida usuario
    Usuario.validateUser(usertype);
  }

  public static void menuHabitats() {
    // Array con nombre de habitats
    logger.info("Displayed list of contain habitats");
    String listaHabitats[] = {"Aves", "Peces", "Felinos", "Reptiles", "Mamiferos"};
     for (int i = 0; i < listaHabitats.length; i++){
       System.out.println( "\n" + (i + 1) + ".Visitar Habitat " + listaHabitats[i]);
     }
  }

  public static void opcionesHabitats(int opcion, String user) throws MessagingException {

    if(user == "Visitante") {

      String opcionesHabitats[] = {"Ver lista de Animales", "Imprimir Lista  de Animales", "Regresar al Menu Anterior"};
      for (int i = 0; i < opcionesHabitats.length; i++) {
        System.out.println("\n" + (i + 1) + "." + opcionesHabitats[i]);
      }
      String habitats[] = {"Aves", "Peces", "Felinos", "Reptiles", "Mamiferos"};
      int opt = opcionUsuario();
      //Ejecuta segun opcion del usuario
      switch (opt) {
        case 1:
          Lista_Animales.mostrar_Lista(habitats[opcion - 1]);
          opcionesHabitats(opcion, user);
          break;
        case 2:
          FileGenerator.CreateFile(Habitat.Lista(habitats[opcion - 1]), habitats[opcion - 1]);
          opcionesHabitats(opcion, user);
          break;
        case 3:
          Menu.menuHabitats();
          opcionesHabitats(opcionUsuario(), user);
          break;
        default:
          System.out.println("**--Opcion Invalida--**\n");
          opcionesHabitats(opcion, user);
          break;
      }
    }else if(user == "Admin"){
      String opcionesHabitats[] = {"Ver lista de Animales", "Imprimir Lista  de Animales", "Enviar lista por correo","Regresar al Menu Anterior"};
      for (int i = 0; i < opcionesHabitats.length; i++) {
        System.out.println("\n" + (i + 1) + "." + opcionesHabitats[i]);
      }
      String habitats[] = {"Aves", "Peces", "Felinos", "Reptiles", "Mamiferos"};
      int opt = opcionUsuario();
      switch (opt) {
        case 1:
          Lista_Animales.mostrar_Lista(habitats[opcion - 1]);
          opcionesHabitats(opcion, user);
          break;
        case 2:
          FileGenerator.CreateFile(Habitat.Lista(habitats[opcion - 1]), habitats[opcion - 1]);
          Menu.menuHabitats();
          opcionesHabitats(opcion, user);
          break;
        case 3:
          System.out.println("Por favor ingrese el correo al que desea recibir la lista:");
          Scanner input = new Scanner(System.in);
          String correo = input.nextLine();
          Email_Sender.sendMail(correo,Habitat.Lista(habitats[opcion-1]), habitats[opcion-1]);
          Menu.menuHabitats();
          opcionesHabitats(opcionUsuario(), user);
        case 4:
          Menu.menuHabitats();
          opcionesHabitats(opcionUsuario(), user);
          break;
        default:
          System.out.println("**--Opcion Invalida--**\n");
          opcionesHabitats(opcion, user);
          break;
      }
    }
  }

  public static int opcionUsuario() {

    System.out.println("Digite el numero de la opcion deseada:");
    Scanner input = new Scanner(System.in);
    int opt = input.nextInt();
    logger.info("User option selected");
    return opt;
  }

}
