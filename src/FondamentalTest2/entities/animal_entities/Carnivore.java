package FondamentalTest2.entities.animal_entities;

public class Carnivore extends Animal{

    private double maxFood;



    public Carnivore(String name) {

        super(name);
    }

    public Carnivore(String name, double weight, double height, double length) {

        super(name, weight, height, length);
    }


    public double getMaxFood() {

        return maxFood;
    }

    public void setMaxFood(double maxFood) {

        this.maxFood = maxFood;
    }


    @Override
    public String toString() {
        return "Carnivore: \n" + super.toString() +
                "\nMax food size: " + maxFood + " m";

    }


}
