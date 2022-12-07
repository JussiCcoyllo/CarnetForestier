package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.plant_entities.*;
import be.intecbrussel.the_notebook.service.ForestNotebook;

public class NatureApp {

    public static void main(String[] args) {

        //Animals encountered
        Carnivore tiger = new Carnivore("Tiger", 120, 1, 50);
        Carnivore lion = new Carnivore("Lion", 150, 1.2, 60);
        Carnivore wolf = new Carnivore("Wolf", 80, 0.9, 45);

        Herbivore horse = new Herbivore("Horse", 900, 1.65, 50);
        Herbivore cow = new Herbivore("Cow", 850, 1.5, 80);
        Herbivore sheep = new Herbivore("Sheep", 60, 1, 55);
        Herbivore butterfly = new Herbivore("Butterfly", 0.02, 0.03, 0.03);

        Omnivore gorilla = new Omnivore("Gorilla", 275, 1, 80);
        Omnivore grizzly = new Omnivore("Grizzly", 500, 3, 1.5);
        Omnivore flamingo = new Omnivore("Flamingo", 4, 1.5, 0.7);

        //Plants encountered
        Bush chokeBerry = new Bush("Choke Berry", 1.5);
        Flower rose = new Flower("Rose", 0.8);
        Flower hortensia = new Flower("Hortensia", 0.7);
        Tree apple = new Tree("Apple", 2.8);
        Weed bermudaGrass = new Weed("Bermuda grass", 0.3);
        Tree cedar = new Tree("Cedar", 1.2);

        //My discoveries encountered on the road
        ForestNotebook myDiscoveries = new ForestNotebook();

        myDiscoveries.addPlant(rose);
        rose.setSmell(Scent.SWEET);

        myDiscoveries.addAnimal(tiger);
        tiger.setMaxFoodSize(5);

        myDiscoveries.addAnimal(cow);
        cow.addPlantToDiet(chokeBerry);

        myDiscoveries.addAnimal(wolf);
        wolf.setMaxFoodSize(1);

        myDiscoveries.addAnimal(horse);
        horse.addPlantToDiet(apple);

        myDiscoveries.addPlant(chokeBerry);
        chokeBerry.setFruit("Berries");

        myDiscoveries.addAnimal(cow);
        cow.addPlantToDiet(chokeBerry);

        myDiscoveries.addAnimal(sheep);
        sheep.addPlantToDiet(bermudaGrass);

        myDiscoveries.addAnimal(gorilla);
        gorilla.setMaxFoodSize(2);
        gorilla.addPlantToDiet(apple);

        myDiscoveries.addPlant(apple);
        apple.setLeafType(LeafType.ROUND);

        myDiscoveries.addAnimal(grizzly);
        grizzly.setMaxFoodSize(3);
        grizzly.addPlantToDiet(apple);

        myDiscoveries.addAnimal(flamingo);
        flamingo.addPlantToDiet(bermudaGrass);

        myDiscoveries.addAnimal(butterfly);
        butterfly.addPlantToDiet(rose);

        myDiscoveries.addAnimal(butterfly);
        myDiscoveries.addAnimal(horse);

        myDiscoveries.addAnimal(lion);
        lion.setMaxFoodSize(2);

        myDiscoveries.addPlant(chokeBerry);
        chokeBerry.setLeafType(LeafType.HAND);

        myDiscoveries.addPlant(hortensia);
        hortensia.setSmell(Scent.EARTHY);

        myDiscoveries.addPlant(bermudaGrass);
        bermudaGrass.setArea(1000);

        myDiscoveries.addPlant(cedar);
        cedar.setLeafType(LeafType.SPEAR);

        myDiscoveries.addPlant(bermudaGrass);

        System.out.println("\nNumber of plants encountered: " + myDiscoveries.getPlantCount());
        System.out.println("\nNumber of animals encountered: " + myDiscoveries.getAnimalCount());

        System.out.println("\nAnimals sorted by Name: \n");
        myDiscoveries.sortAnimalsByName();

        System.out.println("\nAnimals sorted by Height: \n");
        myDiscoveries.sortAnimalsByHeight();

        System.out.println("\nPlants sorted by Name: \n");
        myDiscoveries.sortPlantsByName();

        System.out.println("\nPlants sorted by Height: \n");
        myDiscoveries.sortPlantsByHeight();

        System.out.println("\nCarnivores discovered: \n");
        myDiscoveries.getCarnivores();

        System.out.println("\nHerbivores discovered: \n");
        myDiscoveries.getHerbivores();

        System.out.println("\nOmnivores discovered: \n");
        myDiscoveries.getOmnivores();

        System.out.println("\nList of animals and plants encountered\n");
        myDiscoveries.printNotebook();
    }
}