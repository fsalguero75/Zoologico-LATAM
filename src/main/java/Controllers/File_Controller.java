package Controllers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.log4j.Logger;

/*
 * Usa la clase FileGenerator
 * Pide ubicacion de almacenamiento del archivo
 *  */
public class File_Controller{

  private static Logger logger = Logger.getLogger(File_Controller.class);
  public static void CreateFile(ArrayList list, String habitat) {
    try {
      String ruta =
              File_Controller.assign_route()
                      + "\\"
                      + File_Controller.assign_name() // Nombre asignado por el usuario
                      + File_Controller.assing_type_file(); // Ruta especifica para crear el archivo
      File file = new File(ruta);

      // Si el archivo no existe es creado
      if (!file.exists()) {
        file.createNewFile();
        logger.info("the system not detected a file, a new one was generated");
      }
      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);
      fw.write("---* Animals available for visit in the habitat: " + habitat + " *---\n\n");
      for (Object str : list) {
        fw.write(str + System.lineSeparator()); // AQUI SE ESPECIFICA EL ARREGLO QUE SE VA A ESCRIBIR EN EL ARCHIVO
      }
      bw.close();
      logger.info("File created successfully!");
      System.out.println("File created successfully!");

    } catch (Exception e) {
      logger.error(e);
      System.out.println(e);
    }
  }

  public static String assing_type_file() {
    logger.info("User wants to create a file");
    System.out.println("Digite el numero de la opcion deseada:\n1. WORD\n2. CVS\n3. TXT");
    Scanner scan = new Scanner(System.in);
    String extType = scan.nextLine();
    switch (extType) {
      case "1":
        extType = ".doc";
        logger.info("User has been selected type doc = WORD");
        break;
      case "2":
        extType = ".csv";
        logger.info("User has been selected type doc = CSV");
        break;
      case "3":
        extType = ".txt";
        logger.info("User has been selected type doc = TXT");
        break;
      default:
        System.out.println("Escriba una extension valida");
        logger.error("User has been selected not valid extension");
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
      logger.info("The user has been assigned this route to create the file: "+ rutaAddress);
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

