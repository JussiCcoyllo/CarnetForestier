package be.intecbrussel.the_notebook.animal_entities;

import be.intecbrussel.the_notebook.plant_entities.Plant;

import java.util.HashSet;
import java.util.Set;

public class Herbivore extends Animal{
    private Set<Plant> plantDiet = new HashSet<>();

    //constructor

    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
        this.plantDiet = plantDiet;
    }

    //getters and setters

    public Set<Plant> getPlantDiet() {
        return plantDiet;
    }

    public void setPlantDiet(Set<Plant> plantDiet) {
        this.plantDiet = plantDiet;
    }

    //methods

    public void addPlantToDiet(Plant plant) {
        plantDiet.add(plant);
    }

    private void printDiet() {
        System.out.println(plantDiet);
    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "plantDiet=" + plantDiet +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", length=" + length +
                '}';
    }
}

