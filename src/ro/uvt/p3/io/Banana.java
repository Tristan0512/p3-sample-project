package ro.uvt.p3.io;

public class Banana extends Fruit implements Peelable{
    public Banana(int weight, int sugar, int water)
    {
        super(weight, sugar, water, Color.yellow);

    }
    boolean peel = true;
    @Override
    public boolean hasPeel() {
        return peel;
    }

    @Override
    public void peelOff() {
        peel = false;
    }
}
