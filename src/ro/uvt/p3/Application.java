package ro.uvt.p3;

import ro.uvt.p3.io.*;

public class Application {
    private InputDevice id;
    private OutputDevice od;

    public Application(InputDevice id, OutputDevice od) {
        this.id = id;
        this.od = od;
    }
    public void run(){
        Fruit[] fruits = id.readFruit();

        int weight = id.computeWeight(fruits);
        int sugar = id.computeSugarContent(fruits);
        System.out.println(weight);
        System.out.println(sugar);
    }

}
