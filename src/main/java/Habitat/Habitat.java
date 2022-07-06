package Habitat;
//almacenar animales
import java.util.*;

public class Habitat extends Animals {

    public Habitat(String nombre, String habitat, String descripcion) {
        super(nombre, habitat, descripcion);

    }
    static Animals paloma = new Animals("paloma","Aves","descripcion paloma");
    static Animals aguila = new Animals("Aguila", "Aves", "descripcion aguila");
    static Animals canario = new Animals("Canario", "Aves", "descripcion canario");
    static Animals globo = new Animals("Pez Globo", "Peces", "descripcion Pez Globo");
    static Animals payaso = new Animals("Pez Payaso", "Peces", "descripcion Pez Payaso");
    static Animals dorado = new Animals("Pez Dorado", "Peces", "descripcion Pez Dorado");

    static Animals dorado2 = new Animals("Pez Dorado2", "Peces", "descripcion Pez Dorado");


    public static ArrayList<Animals> Lista(String habitat) {
        ArrayList<Animals> list = new ArrayList<>();
        switch (habitat){
            case "Aves":
                list.add(paloma);
                list.add(aguila);
                list.add(canario);
                list.forEach(System.out::println);
                break;
            case "Peces":
                list.add(globo);
                list.add(payaso);
                list.add(dorado);
                list.add(dorado2);
                list.forEach(System.out::println);
                break;
            default:
                System.out.println("Lista no existe");
                break;
        }
        return list;
    }




}
