package org.example.solidBird.BirdV2;

public class Runner {
    public static void main(String[] args) throws NoSuchMethodException {
        Bird sparrow = new Sparrow(100.0, "beak");
        Bird parrot = new Parrot(200.0, "achhi");
        Bird penguin = new Penguin(1000.0, "nobeak");

        sparrow.fly();
        parrot.fly();
        penguin.fly();
    }
}
