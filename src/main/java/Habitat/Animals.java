package Habitat;

import Interfaces.Animal;
import enums.StatusAnimal;

public class Animals implements Animal {

    private String nombre;
    private String habitat;
    private String descripcion;

    private Boolean inVeterinarian;
    private String statusAnimal;
    public Animals(String nombre, String habitat, String descripcion, Boolean inVeterinarian,
        StatusAnimal statusAnimal){
        this.nombre = nombre;
        this.habitat = habitat;
        this.descripcion = descripcion;
        this.inVeterinarian = false;
        this.statusAnimal = String.valueOf(statusAnimal);
    }
    @Override
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitat(){
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Boolean tgetInfoVe() { return inVeterinarian; }

    public void setInfoVet(Boolean inVeterinarian){ this.inVeterinarian = inVeterinarian; }

    public void setInfoStatusAnimal(String statusAnimal){ this.statusAnimal = statusAnimal; };

    public String getInfoStatusAnimal() { return statusAnimal; }

    @Override
    public String toString() {
    return "Nombre: "
        + nombre
        + "\nDescripcion: "
        + descripcion
        + "\nEl animal se encuentra en: "
        + statusAnimal;
    }

    void mostrar( ) {
        System.out.println("Nombre: " + nombre );
        System.out.println("Habitat.Habitat: " + habitat );
        System.out.println("Descripcion: " + descripcion );
        System.out.println("El animal está en: " + statusAnimal);
    }
}
