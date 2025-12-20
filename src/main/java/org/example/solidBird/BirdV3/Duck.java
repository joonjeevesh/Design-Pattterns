package org.example.BirdV3;

import org.example.BirdV3.interfaces.Flyable;
import org.example.BirdV3.interfaces.Swimmable;

public class Duck extends Bird implements Swimmable, Flyable {
    public Duck(Double weight, String beak) {
        super(weight, beak);
    }

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
