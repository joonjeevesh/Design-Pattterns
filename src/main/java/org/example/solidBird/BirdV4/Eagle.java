package org.example.BirdV4;

import org.example.BirdV4.interfaces.Flyable;
import org.example.BirdV4.interfaces.IFlyingBehavior;

public class Eagle extends Bird implements Flyable {

    private IFlyingBehavior flyingBehavior;

    public Eagle(Double weight, String beak, IFlyingBehavior flyingBehavior) {
        super(weight, beak);
        this.flyingBehavior = flyingBehavior;
    }

    @Override
    public void fly() {
        flyingBehavior.makeFly();
    }
}
