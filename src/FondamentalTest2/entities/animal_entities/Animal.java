package FondamentalTest2.entities.animal_entities;

public class Animal {

   private String name;
   private double weight;
   private double height;
   private double length;


    public Animal(String name) {
        this.name = name;
    }


    public Animal(String name, double weight, double height, double length) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.length = length;
    }


    public String getName() {
        return name;
    }


    public double getWeight() {

        return weight;
    }

    public void setWeight(double weight) {

        this.weight = weight;
    }

    public double getHeight() {

        return height;
    }

    public void setHeight(double height) {

        this.height = height;
    }

    public double getLength() {

        return length;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Weight: " + weight +
                ", Height: " + height +
                ", Length: " + length;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
