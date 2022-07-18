package Habitat;

import Interfaces.Animal;
import enums.StatusAnimal;

public class Animals implements Animal {
  private String nombre;
  private String habitat;
  private String descripcion;
  private String statusAnimal;
  public Animals(String nombre, String habitat, String descripcion,
                 StatusAnimal statusAnimal){
    this.nombre = nombre;
    this.habitat = habitat;
    this.descripcion = descripcion;
    this.statusAnimal = String.valueOf(statusAnimal);
  }

  public String getHabitat(){
    return habitat;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  @Override
  public String toString() {
    return "Nombre: "
            + nombre
            + "\nDescripcion: "
            + descripcion
            + "\nEl animal se encuentra en: "
            + statusAnimal;
  }
}
