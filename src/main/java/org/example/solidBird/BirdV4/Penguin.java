package org.example.BirdV4;

import org.example.BirdV4.interfaces.Swimmable;

public class Penguin extends Bird implements Swimmable {
    public Penguin(Double weight, String beak) {
        super(weight, beak);
    }

    @Override
    public void swim() {
        System.out.println("Penguin is swimming");
    }
}
