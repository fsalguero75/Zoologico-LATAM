package Data;

import Interfaces.Animal;
import Habitat.Animals;
import enums.StatusAnimal;

public class LocalData extends Animals implements Animal {

    public LocalData(String nombre, String habitat, String descripcion, boolean inVeterinarian, String StatusAnimal) {
        super(nombre, habitat, descripcion, inVeterinarian, enums.StatusAnimal.valueOf(StatusAnimal));
    }

    public static Animals aguila =     new Animals("Aguila",         "Aves",  "Como todas las aves de presa, las águilas poseen un pico grande, poderoso y puntiagudo para desprender la carne de su presa. ", false, StatusAnimal.Habitat);
    public static Animals aguiluchos = new Animals("Aguiluchos",     "Aves",  "Aguilucho común, águila parda, águila de pecho blanco, ñanco o pihuel (Geranoaetus polyosoma), es una especie de ave accipitriforme de la familia Accipitridae.", false, StatusAnimal.Habitat);
    public static Animals avestruz  =  new Animals("Avestruz",       "Aves",  "Es el ave más grande que en la actualidad podemos encontrar y la corredora más rápida. Está presente en África subsahariana.", false, StatusAnimal.Habitat);
    public static Animals grulla =     new Animals("Grulla",         "Aves",  "De gran tamaño y la capacidad de migrar grandes distancias.", false, StatusAnimal.Habitat);
    public static Animals gaviota =    new Animals("Gaviota",        "Aves",  "Aves marinas de mediano tamaño y con una de las mayores envergaduras alares (distancia de punta a punta de las alas).", false, StatusAnimal.Habitat);
    public static Animals pinguino =   new Animals("Pinguinos",      "Aves",  "con representantes que pueden alcanzar 1,20 m de altura, como el pingüino emperador (Aptenodytes forsteri).", false, StatusAnimal.Habitat);
    public static Animals garza =      new Animals("Garza",          "Aves",  "Muy distribuida en el mundo y una de las más grandes de su grupo.", false, StatusAnimal.Habitat);
    public static Animals paloma =     new Animals("Paloma",         "Aves",  "Es de amplia distribución, ya que se encuentra presente en gran parte del mundo.", false, StatusAnimal.Habitat);
    public static Animals gallina =    new Animals("Gallina",        "Aves",  "Aves presentes en todo el mundo, usados usualmente para comercio y consumo, pero también son adoptados como mascotas ", false, StatusAnimal.Veterinario);
    public static Animals canario =    new Animals("Canario",        "Aves",  "Es una subespecie desarrollada durante siglos de selección en cautividad partiendo de ejemplares del canario silvestre o canario salvaje", false, StatusAnimal.Veterinario);
    public static Animals pez_dorado = new Animals("Pez Dorado",     "Peces", "Es un pez de agua dulce de la familia de los ciprínidos del orden de los cipriniformes.", false, StatusAnimal.Habitat);
    public static Animals pez_payaso = new Animals("Pez Payaso",     "Peces", "Es una subfamilia de peces marinos de la familia Pomacentridae, que engloba únicamente a los géneros Amphiprion y Premnas, cuyos componentes son conocidos como peces payaso o peces de las anémonas.", false, StatusAnimal.Habitat);
    public static Animals pez_betta =  new Animals("Pez Betta",      "Peces", "Es una especie de pez de agua dulce de la familia de los Osphronemidae en el orden de los Perciformes.",  false, StatusAnimal.Veterinario);
    public static Animals pez_borron = new Animals("Pez Borron",     "Peces", "Es una especie de pez escorpeniforme de la familia Psychrolutidae. Debido a la inaccesibilidad de su hábitat ha sido raramente fotografiado en libertad.", false, StatusAnimal.Habitat);
    public static Animals pez_espada = new Animals("Pez Espada",     "Peces", "Es una especie de pez perciforme de la familia Xiphiidae", false, StatusAnimal.Habitat);
    public static Animals pez_luna =   new Animals("Pez Luna",       "Peces", "Es un pez pelágico tetraodontiforme de la familia Molidae. Es el pez óseo más pesado del mundo, con una media de 1000 kg de peso", false, StatusAnimal.Habitat);
    public static Animals pez_cebra =  new Animals("Pez Cebra",      "Peces", "Es un ciprínido emparentado con las carpas y los barbos, originario del sudeste asiático, habita mayormente en lagos, ríos y lagunas de la India, de uso frecuente en acuarios,",false, StatusAnimal.Habitat);
    public static Animals leon =       new Animals("Leon",           "Felinos","Es una especie vulnerable y, en su ámbito de distribución africano, a lo largo de las dos últimas décadas ha sufrido un declive de las poblaciones",false,StatusAnimal.Veterinario );
    public static Animals guepardo =   new Animals("Guepardo",       "Felinos","Es un miembro atípico de la familia de los félidos.",false,StatusAnimal.Habitat );
    public static Animals tigre =      new Animals("Tigre",          "Felinos","El tigre es una de las especies de la subfamilia de los panterinos pertenecientes al género Panthera.",false,StatusAnimal.Veterinario );
    public static Animals jaguar =     new Animals("Jaguar",         "Felinos","El jaguar, yaguar o yaguareté es un carnívoro félido de la subfamilia de los Panterinos y género Panthera.",false,StatusAnimal.Habitat );
    public static Animals puma =       new Animals("Puma",            "Felinos","Es un mamífero carnívoro de la familia Felidae nativo de América.",false,StatusAnimal.Habitat );
    public static Animals anaconda =   new Animals("Anaconda",        "Reptiles","Es una especie de serpiente constrictora de la familia de las boas.",false,StatusAnimal.Veterinario );
    public static Animals boa =        new Animals("Boa constrictora","Reptiles","Es una especie de serpiente de la familia Boidae, y de la subfamilia Boinae. Actualmente, es la única especie del género Boa y mide 5 metros.",false,StatusAnimal.Veterinario );
    public static Animals caiman =     new Animals("Caiman",          "Reptiles","Es un género de cocodrilos de la familia de los aligatóridos, conocidos vulgarmente como yacarés. ",false,StatusAnimal.Veterinario );
    public static Animals cocodrilo =  new Animals("Cocodrilo",       "Reptiles","Es una familia de saurópsidos, arcosaurios comúnmente conocidos como cocodrilos. Incluye a catorce especies actuales.",false,StatusAnimal.Veterinario );
    public static Animals komodo =     new Animals("Dragón de Komodo","Reptiles","Es una especie de saurópsido de la familia de los varánidos, endémico de algunas islas de Indonesia central. ",false,StatusAnimal.Veterinario );
    public static Animals oso =        new Animals("Oso",            "Mamiferos","Animales de gran tamaño, generalmente omnívoros ya que, a pesar de su temible dentadura, comen frutos, raíces e insectos, además de carne.",false,StatusAnimal.Veterinario );
    public static Animals ornitorrinco=new Animals("Ornitorrinco",   "Mamiferos","Es una especie de mamífero semiacuático endémico del este de Australia y de la isla de Tasmania.",false,StatusAnimal.Veterinario );
    public static Animals zorro =      new Animals("Zorro",          "Mamiferos","Son una tribu de mamíferos carnívoros incluidos en la familia de los cánidos. ",false,StatusAnimal.Veterinario );
    public static Animals rinoceronte= new Animals("Rinoceronte",    "Mamiferos","Familia de mamíferos placentarios del suborden ceratomorfos perteneciente al orden de los perisodáctilos.",false,StatusAnimal.Veterinario );
    public static Animals chimpance =  new Animals("Chimpancé",      "Mamiferos","Es una especie de primate homínido propia de África tropical.",false,StatusAnimal.Veterinario );
    public static Animals elefante =   new Animals("Elefante",       "Mamiferos","Son una familia de mamíferos placentarios del orden Proboscidea.",false,StatusAnimal.Veterinario );

}
