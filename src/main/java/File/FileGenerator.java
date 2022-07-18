package File;

import Controllers.File_Controller;
import java.util.ArrayList;
import java.util.Scanner;


public class FileGenerator {
    public static void CreateFile(ArrayList list , String habitat){
        File_Controller.CreateFile(list, habitat);
    }

    public String assing_type_file() {
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
}