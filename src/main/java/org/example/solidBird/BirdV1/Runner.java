package org.example.BirdV1;

public class Runner {
    public static void main(String[] args) {
        BirdV1 sparrow = BirdV1.sparrow(100.0, "beak");
        BirdV1 parrot = BirdV1.parrot(200.0, "good");

        sparrow.fly();
        parrot.fly();
    }
}
