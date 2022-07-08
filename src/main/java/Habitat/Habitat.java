package Habitat;
// almacenar animales

import lombok.Data;

public @Data class Habitat {

  public String Nombre_Habitat;


  public Habitat(String Nombre_Habitat) {
    this.Nombre_Habitat = Nombre_Habitat;
  }

}
