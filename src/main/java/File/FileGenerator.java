package File;

import Controllers.File_Controller;

import java.util.ArrayList;


public class FileGenerator {
    public static void CreateFile(ArrayList list , String habitat){
        File_Controller.CreateFile(list, habitat);
    }

}