package ro.uvt.p3.io;

public class Apple extends Fruit implements SeedRemovable{
    public Apple(int weight, int sugar, int water, Color color) {
        super(weight, sugar, water, color);
    }
    boolean seeds = true;
    @Override
    public boolean hasSeeds() {
        return seeds;
    }

    @Override
    public void removeSeeds() {
        seeds = false;
    }
}
