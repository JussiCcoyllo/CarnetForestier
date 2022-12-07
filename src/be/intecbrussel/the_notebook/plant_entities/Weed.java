package be.intecbrussel.the_notebook.plant_entities;

public class Weed extends Plant {

    private double area;

    //constructor

    public Weed(String name) {
        super(name);
        this.area = area;
    }

    public Weed(String name, double height) {
        super(name, height);
        this.area = area;
    }

    //getters and setters

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Weed{" +
                "area=" + area +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}
