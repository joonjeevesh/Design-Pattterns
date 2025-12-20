package org.example.solidBird.BirdV4;

import org.example.BirdV4.interfaces.Flyable;

public class Runner {
    public static void main(String[] args) {
        FlappingBehavior flappingBehavior = new FlappingBehavior();
        GlidingBehavior glidingBehavior = new GlidingBehavior();
        Flyable sparrow = new Sparrow(100.0, "beak", flappingBehavior);
        Flyable eagle = new Eagle(500.0, "choch", glidingBehavior);
        Bird penguin = new Penguin(1000.0, "nobeak");

        sparrow.fly();
    }
}
