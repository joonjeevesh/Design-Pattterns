package org.example.solidBird.BirdV3;

import org.example.solidBird.BirdV3.interfaces.Flyable;

public class Sparrow extends Bird implements Flyable {

    public Sparrow(Double weight, String beak) {
        super(weight, beak);
    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}
