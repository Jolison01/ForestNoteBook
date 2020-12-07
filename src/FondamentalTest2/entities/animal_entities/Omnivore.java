package FondamentalTest2.entities.animal_entities;

import FondamentalTest2.entities.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Omnivore extends Animal{

    private Set<Plant> plantDiet;
    private double maxFoodSize;


    public Omnivore(String name) {
        super(name);
        plantDiet = new HashSet<>();
    }


    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        plantDiet = new HashSet<>();
    }


    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }



    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }



    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }


    public void addPlantToDiet(Plant plant) {
        if (plantDiet.contains(plant)){
            System.out.println("Plant already in herbivores diet");
        }
        else {
            plantDiet.add(plant);
        }
    }



    @Override
    public String toString() {
        return "Omnivore: \n" + super.toString() +
       "\nMax food size: " + maxFoodSize + " m"+
       "\nFood diet: \n"+ (((long) plantDiet.size() !=0)?
       plantDiet.stream().map(Plant::getName).collect(Collectors.joining("-")):   "No plants registered"      );

    }
}
