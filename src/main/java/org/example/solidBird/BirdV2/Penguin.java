package org.example.solidBird.BirdV2;

public class Penguin extends Bird{
    public Penguin(Double weight, String beak) {
        super(weight, beak);
    }

    @Override
    public void fly() throws NoSuchMethodException {
        throw new NoSuchMethodException();
    }
}
