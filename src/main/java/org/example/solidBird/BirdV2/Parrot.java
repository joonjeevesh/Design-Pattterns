package org.example.solidBird.BirdV2;

public class Parrot extends Bird{

    public Parrot(Double weight, String beak) {
        super(weight, beak);
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
