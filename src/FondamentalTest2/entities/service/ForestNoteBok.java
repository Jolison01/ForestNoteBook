package FondamentalTest2.entities.service;

import FondamentalTest2.entities.animal_entities.Animal;
import FondamentalTest2.entities.animal_entities.Carnivore;
import FondamentalTest2.entities.animal_entities.Herbivore;
import FondamentalTest2.entities.animal_entities.Omnivore;
import FondamentalTest2.entities.plant_entities.Plant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ForestNoteBok {


    private List<Carnivore> carnivoreList;
    private List<Herbivore> herbivoreList;
    private List<Omnivore> omnivoreList;


    private int plantCount;
    private int animalCount;
    private List<Animal> animalList;
    private List<Plant> plantList;




    public ForestNoteBok(){
        animalList= new ArrayList<>();
        plantList = new ArrayList<>();
        carnivoreList = new ArrayList<>();
        herbivoreList = new ArrayList<>();
        omnivoreList = new ArrayList<>();
    }


    public void addAnimal(Animal animal){
        if (animalList.contains(animal)){
            System.out.println("You've already added this animal to your collection !!!");
        } else {

            animalList.add(animal);
            System.out.println("New animal added: " + animal);
        }

    }

    public void addPlant(Plant plant){

        if (plantList.contains(plant)){
            System.out.println("You've already added this plant to your collection !!!");
        } else {
            plantList.add(plant);
            System.out.println("New plant added: " + plant);
        }
    }




    public void sortAnimalByName(){
        animalList.sort(Comparator.comparing(comp -> comp.getName().toUpperCase()));
        for(Animal a : animalList){
            System.out.println(a);
        }
    }



    public void sortPlantByName(){
        plantList.sort(Comparator.comparing(nzuzi -> nzuzi.getName().toUpperCase()));
        for(Plant p :  plantList){
            System.out.println(p);
        }
    }


    public void sortAnimalByHeight(){

        animalList.sort(Comparator.comparing(Animal::getHeight));
    }


    public void sortPlantByHeight(){
        plantList.sort(Comparator.comparing(Plant::getHeight));
    }




    public void printNoteBook() {
        System.out.println("\nPrinting the whole NoteBook: ");
        System.out.println("\n***All animals saved to the book***");
        animalList.forEach(System.out::println);

        System.out.println("\n***All plants saved to the book***");
        plantList.forEach(System.out::println);
    }




    public List<Carnivore> getCarnivoreList() {
        return animalList.stream().filter(Carnivore.class::isInstance)
                .map(Carnivore.class::cast)
                .collect(Collectors.toList());
    }




    public void setCarnivoreList(List<Carnivore> carnivoreList) {
        this.carnivoreList = carnivoreList;
    }




    public List<Herbivore> getHerbivoreList() {
        return animalList.stream().filter(Herbivore.class::isInstance)
                .map(Herbivore.class::cast)
                .collect(Collectors.toList());
    }



    public void setHerbivoreList(List<Herbivore> herbivoreList) {
        this.herbivoreList = herbivoreList;
    }



    public List<Omnivore> getOmnivoreList() {
        return animalList.stream()
                .filter(Omnivore.class::isInstance)
                .map(Omnivore.class::cast)
                .collect(Collectors.toList());
    }



    public void setOmnivoreList(List<Omnivore> omnivoreList) {
        this.omnivoreList = omnivoreList;
    }



    public int getPlantCount() {
        return plantList.size();
    }



    public int getAnimalCount() {
        return animalList.size();
    }
}