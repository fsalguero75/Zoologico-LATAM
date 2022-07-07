package File;

import Controllers.File_Controller;
import Habitat.Animals;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;


public class FileGenerator{
    public static void Create(ArrayList list , String habitat){
        File_Controller.CreateFile(list, habitat);
    }
};