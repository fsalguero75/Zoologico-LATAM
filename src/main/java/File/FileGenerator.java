package File;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;


public class FileGenerator {

    public static void CreateFile(ArrayList list , String habitat){
        try {
            String ruta = "D:\\Arialdiino's Stuff\\programming stuff\\Kodigo\\JAVA\\ProjectoZoo\\public\\Lista_Animales.txt"; //Ruta especifica para crear el archivo, el final
            File file = new File(ruta);             //es el nombre del directorio
            // Si el archivo no existe es creado
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            fw.write("---* Animales disponibles para visitar en el habitat de " + habitat + " *---\n\n");
            for(Object str: list) { //AQUI SE ESPECIFICA EL ARREGLO QUE SE VA A ESCRIBIR EN EL ARCHIVO
                fw.write(str + System.lineSeparator());
            }
            bw.close();
            System.out.println("File created successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
