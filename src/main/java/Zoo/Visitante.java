package Zoo;

import javax.mail.MessagingException;


/*
Muestra los animales disponibles para ver
*/
public class Visitante {

  static void usuarioVisitante() throws MessagingException {
    String user = "Visitante";
    System.out.println("Por favor indique a nuestro guia donde desea inicar su reccorido");
    Menu.menuHabitats();
    Menu.opcionesHabitats(Menu.opcionUsuario(),user);

  }
}
