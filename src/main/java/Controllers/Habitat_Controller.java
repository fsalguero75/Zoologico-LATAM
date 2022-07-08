package Controllers;
import Habitat.Animals;
import Habitat.Habitat;


import java.util.ArrayList;
import java.util.Scanner;

//crear la lista de habitats disponiobles
public class Habitat_Controller {
    public static void Creador_Habitats(){
        Habitat Habitat_Mamiferos = new Habitat("Mamiferos");
        Habitat Habitat_Reptiles = new Habitat("Reptiles");
        Habitat Habitat_Peces = new Habitat("Acuaticos");
        Habitat Habitat_Aves = new Habitat("Aves");

        ArrayList<Habitat> Lista_Habitats = new ArrayList<>();
        Lista_Habitats.add(Habitat_Aves);
        Lista_Habitats.add(Habitat_Mamiferos);
        Lista_Habitats.add(Habitat_Reptiles);
        Lista_Habitats.add(Habitat_Peces);
        mostrar_Habitats(Lista_Habitats);

    }

    public static void Lista_Habitats(){

    }

    public static void mostrar_Habitats(ArrayList<Habitat> Lista_Habitats) {
        System.out.println("---Esta es la Lista de Habitats disponibles:---");
        for(int i=0;i<Lista_Habitats.size();i++){
            Habitat Habitat = Lista_Habitats.get(i);
            int index=i+1;
            System.out.println(index+")-"+Habitat.getNombre_Habitat());
        }

    }

    public static void  Lista_de_Animales(){
        System.out.println("Lista de animalitossssss");
    }
}
