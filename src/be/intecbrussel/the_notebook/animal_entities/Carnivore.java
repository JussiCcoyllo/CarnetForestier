package be.intecbrussel.the_notebook.animal_entities;

public class Carnivore extends Animal {
    private double maxFoodSize;

    //constructor

    public Carnivore(String name) {
        super(name);
        this.maxFoodSize = maxFoodSize;
    }

    public Carnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        this.maxFoodSize = maxFoodSize;
    }

    //getters and setters

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    @Override
    public String toString() {
        return "Carnivore{" +
                "maxFoodSize=" + maxFoodSize +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}

