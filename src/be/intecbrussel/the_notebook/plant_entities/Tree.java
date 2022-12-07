package be.intecbrussel.the_notebook.plant_entities;

public class Tree extends Plant {

    private LeafType leafType;

    //constructor

    public Tree(String name) {
        super(name);
        this.leafType = leafType;
    }

    public Tree(String name, double height) {
        super(name, height);
        this.leafType = leafType;
    }

    //getters and setters

    public LeafType getLeafType() {
        return leafType;
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "leafType=" + leafType +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}

