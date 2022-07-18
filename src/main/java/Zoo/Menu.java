package Zoo;
/*
 * Despliega el menu para el ingreso del usuario al sistema
 * */

import File.FileGenerator;
import Habitat.Habitat;
import Habitat.Lista_Animales;

import java.util.Scanner;

public class Menu {


  public static void menuInicio() {
    System.out.println("\nIndique como desea ingresar\nDigita el numero de la opcion:\n1.Admin\n2.Visitante");
    Scanner input = new Scanner(System.in);
    int usertype = input.nextInt();
    //Metodo valida usuario
    Usuario.validateUser(usertype);
  }

  public static void menuHabitats() {
    // Array con nombre de habitats
    String listaHabitats[] = {"Aves", "Peces", "Felinos", "Reptiles", "Mamiferos"};
     for (int i = 0; i < listaHabitats.length; i++){
       System.out.println( "\n" + (i + 1) + ".Visitar Habitat " + listaHabitats[i]);
     }
  }



  public static void menuAdminOnly(){
    String opcionesAdmin[] = {"6. Enviar lista por correo", "7. Crear Habitat", "8. Agregar Animal"};
    for(int i = 0; i < opcionesAdmin.length; i++){
      System.out.println("\n" + opcionesAdmin[i]);
    }
  }

  public static void opcionesHabitats(int opcion){
    String opcionesHabitats[] = {"Ver lista de Animales", "Imprimir Lista  de Animales", "Regresar al Menu Anterior"};
    for(int i = 0; i < opcionesHabitats.length; i++){
      System.out.println("\n" + (i + 1) + "." + opcionesHabitats[i]);
    }
    String habitats[] = {"Aves", "Peces", "Felinos", "Reptiles", "Mamiferos"};
    int opt = opcionUsuario();
    //Ejecuta segun opcion del usuario
   switch (opt){
     case 1:
       Lista_Animales.mostrar_Lista(habitats[opcion-1]);
       opcionesHabitats(opcion);
       break;
     case 2:
       FileGenerator.CreateFile(Habitat.Lista(habitats[opcion-1]),habitats[opcion-1]);
       opcionesHabitats(opcion);
       break;
     case 3:
       Menu.menuHabitats();
       opcionesHabitats(opcionUsuario());
       break;
     default:
       System.out.println("**--Opcion Invalida--**\n");
       opcionesHabitats(opcion);
       break;
   }
  }

  public static void opcionesAdmin() {
    menuHabitats();
    menuAdminOnly();
    int opt = opcionUsuario();
    if (opt >= 6  && opt <= 8 ) {
      switch (opt){
        case 6:
          System.out.println("Metodo envia lista por correo");
          break;
        case 7:
          System.out.println("Metodo crea Habitat");
          break;
        case 8:
          System.out.println("Metodo agrega Animal");
          break;
      }
    } else if( opt > 0 && opt <= 5) {

    }else {
      System.out.println("**--Opcion Invalida--**\n");
      opcionesAdmin();
    }
  }

  public static int opcionUsuario() {
    System.out.println("Digite el numero de la opcion deseada:");
    Scanner input = new Scanner(System.in);
    int opt = input.nextInt();
    return opt;
  }

}
