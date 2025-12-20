package org.example.solidBird.BirdV3;

import org.example.solidBird.BirdV3.interfaces.Flyable;

public class Parrot extends Bird implements Flyable {

    public Parrot(Double weight, String beak) {
        super(weight, beak);
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying");
    }
}
