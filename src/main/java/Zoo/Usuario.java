package Zoo;

/*
 * Administra los usuarios que ingresan al sistema
 * */
public class Usuario {

  public static void validateUser(int user) {
    if (user == 1) {
      // usuario Admin
      Admin.usuarioAdmin();
    } else if (user == 2) {
      // usuario Visitante
      Visitante.usuarioVisitante();
    } else {
      // Muestra error regresa al inicio
      System.out.println("Error: Opcion invalida");
      Menu.menuInicio();
    }
  }
}
