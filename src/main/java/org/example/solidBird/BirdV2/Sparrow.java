package org.example.BirdV2;

public class Sparrow extends Bird{

    public Sparrow(Double weight, String beak) {
        super(weight, beak);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
