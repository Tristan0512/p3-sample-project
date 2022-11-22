package ro.uvt.p3.io;

public class Mango extends Fruit implements Peelable,SeedRemovable{
    public Mango(int weight, int sugar, int water, Color color) {
        super(weight, sugar, water, color);
    }
    boolean peel = true;
    boolean seed = true;


    @Override
    public boolean hasPeel() {
        return peel;
    }

    @Override
    public void peelOff() {
        peel = false;
    }

    @Override
    public boolean hasSeeds() {
        return seed;
    }

    @Override
    public void removeSeeds() {
        seed = false;
    }
}
