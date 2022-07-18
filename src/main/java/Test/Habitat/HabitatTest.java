package Habitat;

import Data.LocalData;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class HabitatTest {

    @Test
    void lista() {
      ArrayList<Animals> listaTest = new ArrayList<>();
        listaTest.add(LocalData.aguila);
        listaTest.add(LocalData.aguiluchos);
        listaTest.add(LocalData.avestruz);
        listaTest.add(LocalData.grulla);
        listaTest.add(LocalData.gaviota);
        listaTest.add(LocalData.pinguino);
        listaTest.add(LocalData.garza);
        listaTest.add(LocalData.paloma);
        listaTest.add(LocalData.gallina);
        listaTest.add(LocalData.canario);
        listaTest.forEach(System.out::println);
      assertEquals(listaTest,Habitat.Lista("Aves"));
    }
}