package Zoo;

import javax.mail.MessagingException;
import java.util.Scanner;

/*Usa las clases Controladores
 * Añade animales a la Lista de Animales
 * Crea Archivos
 * Envia Archivos
 *
 * */
public class Admin {

  static void usuarioAdmin() throws MessagingException {

    //ingresar contraseña
    Scanner input = new Scanner(System.in);
    System.out.println("\nPor favor ingrese su clave de acceso");
    int password = 123456;
    int userpass = input.nextInt();
    if(userpass == password){
      String user = "Admin";
      Menu.menuHabitats();
      Menu.opcionesHabitats(Menu.opcionUsuario(),user);
    }else{
      System.out.println("Contraseña incorrecta");
      Menu.menuInicio();
    }
  }
}
