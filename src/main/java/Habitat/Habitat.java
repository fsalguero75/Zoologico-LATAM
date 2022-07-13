package Habitat;
//almacenar animales
import Data.FakeData;
import Interfaces.Animal;
import java.util.*;

public class Habitat extends Animals implements Animal {
    public Habitat(String nombre, String habitat, String descripcion, boolean inVeterinarian, String StatusAnimal) {
        super(nombre, habitat, descripcion, inVeterinarian, enums.StatusAnimal.valueOf(StatusAnimal));
    }

    public static ArrayList<Animals> Lista(String habitat) {
        ArrayList<Animals> list = new ArrayList<>();
        switch (habitat){
            case "Aves":
                list.add(FakeData.aguila);
                list.add(FakeData.aguiluchos);
                list.add(FakeData.avestruz);
                list.add(FakeData.grulla);
                list.add(FakeData.gaviota);
                list.add(FakeData.pinguino);
                list.add(FakeData.garza);
                list.add(FakeData.paloma);
                list.add(FakeData.gallina);
                list.add(FakeData.canario);
                list.forEach(System.out::println);
                break;
            case "Peces":
                list.add(FakeData.pez_dorado);
                list.add(FakeData.pez_payaso);
                list.add(FakeData.pez_betta);
                list.add(FakeData.pez_borron);
                list.add(FakeData.pez_espada);
                list.add(FakeData.pez_luna);
                list.add(FakeData.pez_cebra);
                list.forEach(System.out::println);
                break;
            case "Felinos":
                list.add(FakeData.leon);
                list.add(FakeData.guepardo);
                list.add(FakeData.tigre);
                list.add(FakeData.jaguar);
                list.add(FakeData.puma);
                list.forEach(System.out::println);
                break;
            case "Reptiles":
                list.add(FakeData.anaconda);
                list.add(FakeData.boa);
                list.add(FakeData.caiman);
                list.add(FakeData.cocodrilo);
                list.add(FakeData.komodo);
                list.forEach(System.out::println);
                break;
            case "Mamiferos":
                list.add(FakeData.oso);
                list.add(FakeData.ornitorrinco);
                list.add(FakeData.zorro);
                list.add(FakeData.rinoceronte);
                list.add(FakeData.chimpance);
                list.add(FakeData.elefante);
                list.forEach(System.out::println);
                break;
            default:
                System.out.println("Lista no existe");
                break;
        }
        return list;
    }
}
