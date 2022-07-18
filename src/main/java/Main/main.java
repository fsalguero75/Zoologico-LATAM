package Main;

import Zoo.Menu;
import Email.Email_Sender;
import javax.mail.MessagingException;

public class main extends Menu {

  public static void main(String[] args) throws MessagingException {
    System.out.println("Bienvenido al Zoologico LATAM");
    Menu.menuInicio();
  }
}
