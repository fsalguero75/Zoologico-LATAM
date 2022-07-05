package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Archivo {

    public static void createFile(){
        try {
            File archivo = new File("D:\\Arialdiino's Stuff\\programming stuff\\Kodigo\\JAVA\\ProjectoZoo\\public\\Lista_Animales.txt");
            if(archivo.createNewFile()){
                System.out.println("Archivo creado: " + archivo.getName());
            }else{
                System.out.println("Archivo ya existe");
            }
        }catch(IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public static void WriteFile(ArrayList list, String habitat) {
        try {
            FileWriter writer = new FileWriter("Lista_Animales.txt");
            writer.write("---* Esta es la Lista de Animales disponibles para visitar en el habitat de " + habitat + " *---");
            for(Object str: list) {
                writer.write(str + System.lineSeparator());
            }

        }catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

}
