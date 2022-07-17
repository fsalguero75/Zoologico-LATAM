package Habitat;
// almacenar animales

import Interfaces.Animal;
import Data.LocalData;
import java.util.*;
import lombok.Data;

public class Habitat  extends Animals implements Animal {

  public Habitat(String nombre, String habitat, String descripcion, String StatusAnimal) {
    super(nombre, habitat, descripcion, enums.StatusAnimal.valueOf(StatusAnimal));
  }

  public static ArrayList<Animals> Lista(String habitat) {
    ArrayList<Animals> list = new ArrayList<>();
    switch (habitat){
      case "Aves":
        list.add(LocalData.aguila);
        list.add(LocalData.aguiluchos);
        list.add(LocalData.avestruz);
        list.add(LocalData.grulla);
        list.add(LocalData.gaviota);
        list.add(LocalData.pinguino);
        list.add(LocalData.garza);
        list.add(LocalData.paloma);
        list.add(LocalData.gallina);
        list.add(LocalData.canario);
        list.forEach(System.out::println);
        break;
      case "Peces":
        list.add(LocalData.pez_dorado);
        list.add(LocalData.pez_payaso);
        list.add(LocalData.pez_betta);
        list.add(LocalData.pez_borron);
        list.add(LocalData.pez_espada);
        list.add(LocalData.pez_luna);
        list.add(LocalData.pez_cebra);
        list.forEach(System.out::println);
        break;
      case "Felinos":
        list.add(LocalData.leon);
        list.add(LocalData.guepardo);
        list.add(LocalData.tigre);
        list.add(LocalData.jaguar);
        list.add(LocalData.puma);
        list.forEach(System.out::println);
        break;
      case "Reptiles":
        list.add(LocalData.anaconda);
        list.add(LocalData.boa);
        list.add(LocalData.caiman);
        list.add(LocalData.cocodrilo);
        list.add(LocalData.komodo);
        list.forEach(System.out::println);
        break;
      case "Mamiferos":
        list.add(LocalData.oso);
        list.add(LocalData.ornitorrinco);
        list.add(LocalData.zorro);
        list.add(LocalData.rinoceronte);
        list.add(LocalData.chimpance);
        list.add(LocalData.elefante);
        list.forEach(System.out::println);
        break;
      default:
        System.out.println("Lista no existe");
        break;
    }
    return list;
  }

}
