package FondamentalTest2.entities.animal_entities;

import FondamentalTest2.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Herbivore extends Animal{

    private Set<Plant> plantDiet;

    public Herbivore(String name) {
        super(name);
        plantDiet = new HashSet<>();
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        plantDiet = new HashSet<>();
    }


    public void addPlantToDiet(Plant plant){
        if (plantDiet.contains(plant)){
            System.out.println("Plant already in herbivore diet. ");

        }else {
            plantDiet.add(plant);
        }
    }

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public void printDiet(){
        System.out.println("Plant diet of "+ super.getName());
        plantDiet.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Herbivore : \n" + super.toString()+
                "\nFood Diet: \n " + (((long) plantDiet.size() !=0)?
                plantDiet.stream().map(Plant::getName).collect(Collectors.joining("-")) :
                "No plant registered");

    }
}
