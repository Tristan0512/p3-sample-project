package ro.uvt.p3.io;

public class InputDevice {
    public Fruit[] readFruit()
    {
    Fruit[] fruits = new Fruit[5];
    fruits[0] = new Apple(5,20,15,Fruit.Color.red);
    fruits[1] = new Mango(5,15,20, Fruit.Color.yellow);
    fruits[2] = new Apple(15,25,69, Fruit.Color.blue);
    fruits[3] = new Banana(100,20,100);
    fruits[4] = new Apple(5,15,20, Fruit.Color.green);
    return fruits;
    }
    public int computeWeight(Fruit[] fruits)
    {
        int s = 0;
        for (int i = 0; i < fruits.length; i++)
            s += fruits[i].weight;
        return s;
    }
    public int computeSugarContent(Fruit[] fruits)
    {
        int sg = 0;
        for (int i = 0; i < fruits.length; i++)
            sg += fruits[i].sugar;
        return sg;
    }
    public void prepareFruit(Fruit fruit)
    {
        if (fruit instanceof Apple)
            ((Apple) fruit).removeSeeds();
        else ((Banana) fruit).peelOff();
    }

}
