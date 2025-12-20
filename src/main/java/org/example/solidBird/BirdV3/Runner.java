package org.example.solidBird.BirdV3;

import org.example.solidBird.BirdV3.interfaces.Flyable;

public class Runner {
    public static void main(String[] args) throws NoSuchMethodException {
        Flyable sparrow = new Sparrow(100.0, "beak");
        Flyable parrot = new Parrot(200.0, "achhi");
        Bird penguin = new Penguin(1000.0, "nobeak");

        sparrow.fly();
        parrot.fly();
    }
}
