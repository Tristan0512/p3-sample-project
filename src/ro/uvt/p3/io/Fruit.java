package ro.uvt.p3.io;

public abstract class Fruit {
    int weight;
    int sugar;
    int water;
    Color color;
    public enum Color{
        red,yellow,blue,green;
    }

    public Fruit(int weight, int sugar, int water, Color color) {
        this.weight = weight;
        this.sugar = sugar;
        this.water = water;
        this.color = color;
    }

}
