package Controllers;

import File.FileGenerator;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * Usa la clase FileGenerator
 * Pide ubicacion de almacenamiento del archivo
 *  */
public class File_Controller {

  public static void CreateFile(ArrayList list, String habitat) {

    try {
      // File carpeta = archivo.getParentFile();
      String ruta =
          File_Controller.assign_route()
              + "\\"
              + File_Controller.assign_name()
              + File_Controller.assing_type_file(); // Ruta especifica para crear el archivo
      File file = new File(ruta);

      // Si el archivo no existe es creado
      if (!file.exists()) {
        file.createNewFile();
      }
      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);
      fw.write("---* Animales disponibles para visitar en el habitat de " + habitat + " *---\n\n");
      for (Object str : list) { // AQUI SE ESPECIFICA EL ARREGLO QUE SE VA A ESCRIBIR EN EL ARCHIVO
        fw.write(str + System.lineSeparator());
      }
      bw.close();
      System.out.println("¡Archivo creado satisfactoriamente!");
      System.exit(0);

    } catch (Exception e) {
      e.printStackTrace();
      System.exit(1);
    }
  }

  public static String assing_type_file() {
    System.out.println("Digite el numero de la opcion deseada:\n1. WORD\n2. CVS\n3. TXT");
    Scanner scan = new Scanner(System.in);
    String extType = scan.nextLine();
    switch (extType) {
      case "1":
        extType = ".doc";
        break;
      case "2":
        extType = ".csv";
        break;
      case "3":
        extType = ".txt";
        break;
      default:
        System.out.println("Escriba una extension valida");
        ;
    }
    return extType;
  }

  public static String assign_route() {
    Boolean rutaExist = false;
    if (rutaExist != true) {
      System.out.println("\nEscriba una direccion para almacenar el archivo: \n");
      Scanner scanner = new Scanner(System.in);
      String rutaAddress = scanner.nextLine();
      return rutaAddress;
    } else {
      return null;
    }
  }

  public static String assign_name() {
    Boolean nameExist = false;
    if (nameExist != true) {
      System.out.println("\nEscriba el nombre del archivo: \n");
      Scanner scanner = new Scanner(System.in);
      String nameFile = scanner.nextLine();
      return nameFile;
    }
    return null;
  }
}
