package Habitat;

public class Animals {

  private String nombre;
  private String habitat;
  private String descripcion;
  // private Boolean inVeterinarian;

  Animals(String nombre, String habitat, String descripcion) {
    this.nombre = nombre;
    this.habitat = habitat;
    this.descripcion = descripcion;
    // inVeterinarian = false;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getHabitat() {
    return habitat;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  /*public Boolean getInfoVet() { return inVeterinarian; }*/

  /*public void setInfoVet(Boolean inVeterinarian){
      this.inVeterinarian = inVeterinarian;
  }*/

  @Override
  public String toString() {
    return "Nombre: " + nombre + "\nDescripcion: " + descripcion;
  }

  void mostrar() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Habitat.Habitat: " + habitat);
    System.out.println("Descripcion: " + descripcion);
    // System.out.println("en Veterinaria : " + inVeterinarian );
  }
}
