package Habitat;
// almacenar animales

import Controllers.File_Controller;
import Interfaces.Animal;
import Data.LocalData;
import java.util.*;
import org.apache.log4j.Logger;

public class Habitat  extends Animals implements Animal {
  private static Logger logger = Logger.getLogger(Habitat.class);
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
        logger.info("Has been displayed the list 'Aves'");
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
        logger.info("Has been displayed the list 'Peces'");
        list.forEach(System.out::println);
        break;
      case "Felinos":
        list.add(LocalData.leon);
        list.add(LocalData.guepardo);
        list.add(LocalData.tigre);
        list.add(LocalData.jaguar);
        list.add(LocalData.puma);
        logger.info("Has been displayed the list 'Felinos'");
        list.forEach(System.out::println);
        break;
      case "Reptiles":
        list.add(LocalData.anaconda);
        list.add(LocalData.boa);
        list.add(LocalData.caiman);
        list.add(LocalData.cocodrilo);
        list.add(LocalData.komodo);
        logger.info("Has been displayed the list 'Reptiles'");
        list.forEach(System.out::println);
        break;
      case "Mamiferos":
        list.add(LocalData.oso);
        list.add(LocalData.ornitorrinco);
        list.add(LocalData.zorro);
        list.add(LocalData.rinoceronte);
        list.add(LocalData.chimpance);
        list.add(LocalData.elefante);
        logger.info("Has been displayed the list 'Mamiferos'");
        list.forEach(System.out::println);
        break;
      default:
        logger.error("Has ");
        System.out.println("The user tried to select a list that does not exist");
        break;
    }
    return list;
  }

}
