package be.intecbrussel.the_notebook.service;

import be.intecbrussel.the_notebook.animal_entities.Animal;
import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.Plant;
import java.util.*;

public class ForestNotebook {

    private List<Carnivore> carnivores = new ArrayList<>();;
    private List<Omnivore> omnivores = new ArrayList<>();;
    private List<Herbivore> herbivores= new ArrayList<>();;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals = new ArrayList<>();
    private List<Plant> plants= new ArrayList<>();

    //constructor

    public ForestNotebook() {
    }

    //getters and setters

    public List<Carnivore> getCarnivores() {
        for (Carnivore carnivore : carnivores) {
            System.out.println("\t"+ carnivore);
        }
        return  carnivores;
    }
    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }
    public List<Omnivore> getOmnivores() {
        for (Omnivore omnivore : omnivores) {
            System.out.println("\t"+ omnivore);
        }
        return omnivores;
    }
    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }
    public List<Herbivore> getHerbivores() {
        for (Herbivore herbivore : herbivores) {
            System.out.println("\t"+ herbivore);
        }
        return herbivores;
    }
    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plants.size();
    }

    public int getAnimalCount() {
        return animals.size();
    }

    //methods
    public void addAnimal(Animal animal){

        if (!animals.contains(animal)) {

            animals.add(animal);

            animalCount+=1;

            if (animal.getClass() == Carnivore.class){
                carnivores.add((Carnivore) animal);
            }
            if (animal.getClass() == Omnivore.class){
                omnivores.add((Omnivore) animal);
            }
            if (animal.getClass() == Herbivore.class){
                herbivores.add((Herbivore) animal);
            }
        }
    }
    public void addPlant(Plant plant) {

        if (!plants.contains(plant)) {
            plants.add(plant);
            plantCount += 1;
        }
    }
    public void printNotebook(){

        HashSet<Animal> animalsNonDuplicated = new HashSet<>();
        animalsNonDuplicated.addAll(animals);
        for (Animal animal : animalsNonDuplicated) {
            System.out.println("\t" + animal);
        }
        HashSet<Plant> plantsNonDuplicated = new HashSet<>();
        plantsNonDuplicated.addAll(plants);
        for (Plant plant : plantsNonDuplicated) {
            System.out.println("\t" + plant);
        }
    }

    public void sortAnimalsByName() {
        animals.sort(Comparator.comparing(Animal::getName));
        animals.forEach((n)-> System.out.println(n));
    }
    public void sortPlantsByName() {
        plants.sort(Comparator.comparing(Plant::getName));
        plants.forEach((n)-> System.out.println(n));
    }
    public void sortAnimalsByHeight() {
        animals.sort(Comparator.comparing(Animal::getHeight));
        animals.forEach((n)-> System.out.println(n));
    }

    public void sortPlantsByHeight() {
        plants.sort(Comparator.comparing(Plant::getHeight));
        plants.forEach((n)-> System.out.println(n));
    }

    @Override
    public String toString() {
        return "ForestNotebook{" +
                "carnivores=" + carnivores +
                ", omnivores=" + omnivores +
                ", herbivores=" + herbivores +
                ", plantCount=" + plantCount +
                ", animalCount=" + animalCount +
                ", animals=" + animals +
                ", plants=" + plants +
                '}';
    }
}

