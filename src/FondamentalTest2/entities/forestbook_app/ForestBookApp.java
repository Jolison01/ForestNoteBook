package FondamentalTest2.entities.forestbook_app;

import FondamentalTest2.entities.animal_entities.Carnivore;
import FondamentalTest2.entities.animal_entities.Herbivore;
import FondamentalTest2.entities.animal_entities.Omnivore;
import FondamentalTest2.entities.enums.LeafType;
import FondamentalTest2.entities.enums.Scent;
import FondamentalTest2.entities.plant_entities.*;
import FondamentalTest2.entities.service.ForestNoteBok;

import java.util.HashSet;
import java.util.Set;

public class ForestBookApp {

    public static void main(String[] args) {


        ForestNoteBok forestNoteBook  = new ForestNoteBok();


        // Making 5 different plants
        Tree beech = new Tree("Beech",6.80);
        Flower flower = new Flower("Sunflower", 1.30);
        Weed weed = new Weed("Weedie", 1.70,0.25);
        Bush bush = new Bush("Bushy", 1.20);
        Plant oak = new Tree("Chêne", 4.60);


        //set some extra types
        beech.setLeafType(LeafType.HAND);
        bush.setLeafType(LeafType.HEART);
        flower.setSmell(Scent.PINEAPPLE);



        // creating 9 different animals
        Carnivore dog = new Carnivore("Hond", 15.80, 0.8,1.40 );
        Carnivore lion = new Carnivore("Simba", 250.00,1.30,2.50);
        Herbivore giraffe = new Herbivore("Giraffe",270.30,3.10,6.90);
        Herbivore cow = new Herbivore("Cowiee",230,1.20,2.20);
        Omnivore bird = new Omnivore("Sunny", 1.2,0.15,0.15);
        Omnivore bear = new Omnivore("Sam",580.60,1.80,2.60);
        Carnivore tiger = new Carnivore("Bruce",360.70,1.10,2.80);
        Herbivore deer = new Herbivore("sammy",110.90,1.50,1.90);
        Omnivore chicken = new Omnivore("krooky", 5.20,0.30,0.60);


        //Give max food size to Carnivores and Omnivores
        dog.setMaxFood(5.5);
        lion.setMaxFood(8.98);
        tiger.setMaxFood(8.25);
        bird.setMaxFoodSize(0.3);
        bear.setMaxFoodSize(9.98);
        chicken.setMaxFoodSize(0.8);

        // Give plants as diet to some Herbivores & Omnivores
        Set<Plant> diet1 = new HashSet<>(); // custom set for diet 1
        diet1.add(new Plant("Blue berry"));
        diet1.add(new Plant("Moon shadow"));
        diet1.add(weed);

        Set<Plant> diet2 = new HashSet<>(); // custom set for diet2
        diet2.add(new Plant("banana tree"));
        diet2.add(new Plant("Tulip"));

        bear.setPlantDiet(diet1);
        chicken.setPlantDiet(diet2);
        cow.setPlantDiet(diet2);
        bird.setPlantDiet(diet1);
        deer.addPlantToDiet(weed); // just via addPlantToDiet method
        giraffe.setPlantDiet(diet2);

        // add animals to the notebook

        forestNoteBook.addAnimal(dog);
        forestNoteBook.addAnimal(lion);
        forestNoteBook.addAnimal(giraffe);
        forestNoteBook.addAnimal(cow);
        forestNoteBook.addAnimal(bird);
        forestNoteBook.addAnimal(bear);
        forestNoteBook.addAnimal(tiger);
        forestNoteBook.addAnimal(deer);
        forestNoteBook.addAnimal(chicken);

        //adding plants to the notebook

        forestNoteBook.addPlant(beech);
        forestNoteBook.addPlant(flower);
        forestNoteBook.addPlant(weed);
        forestNoteBook.addPlant(bush);
        forestNoteBook.addPlant(oak);


        // printing out all plants and animals of the notebook
        forestNoteBook.printNoteBook();

        // print plantCount; should be 5
        System.out.println("\nAmount of plants in the notebook: " +
              forestNoteBook.getPlantCount());



        //print animalcount ; should be 9

        System.out.println("\nAmount of animals in the notebook: " +
                forestNoteBook.getAnimalCount());

        // print list of Carnivores

        System.out.println("\nPrint list of Carnivores: ");
        forestNoteBook.getCarnivoreList().forEach(System.out::println);

        // print list of Herbivores
        forestNoteBook.getHerbivoreList().forEach(System.out::println);

        // print list of Omnivores
        System.out.println("\nPrint list of Omnivores");
        forestNoteBook.getOmnivoreList().forEach(System.out::println);


        // sort animals and plants by name and print notebook again
        System.out.println("\nsort animals and plants by name and print again");

        forestNoteBook.sortAnimalByName();
        forestNoteBook.sortPlantByName();
        forestNoteBook.printNoteBook();


        // sort by height and print notebook again
        System.out.println("\nSort animals and plants by height and print gain");
        forestNoteBook.sortAnimalByHeight();
        forestNoteBook.sortPlantByHeight();
        forestNoteBook.printNoteBook();

    }
}
