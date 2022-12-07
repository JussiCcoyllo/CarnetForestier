package be.intecbrussel.the_notebook.animal_entities;

import be.intecbrussel.the_notebook.plant_entities.Plant;
import java.util.HashSet;
import java.util.Set;

public class Omnivore extends Animal {

    private Set<Plant> plantDiet = new HashSet<Plant>();
    private double maxFoodSize;


    //constructor

    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        this.plantDiet = plantDiet;
        this.maxFoodSize = maxFoodSize;
    }

    //getters and setters

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    //methods
    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    @Override
    public String toString() {
        return "Omnivore{" +
                "plantDiet=" + plantDiet +
                ", maxFoodSize=" + maxFoodSize +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}

