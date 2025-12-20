package org.example.solidBird.BirdV4;

import org.example.BirdV4.interfaces.Flyable;
import org.example.BirdV4.interfaces.IFlyingBehavior;
import org.example.BirdV4.interfaces.Swimmable;

public class Duck extends Bird implements Swimmable, Flyable {
    private IFlyingBehavior flyingBehavior;
    public Duck(Double weight, String beak, IFlyingBehavior flyingBehavior) {
        super(weight, beak);
        this.flyingBehavior = flyingBehavior;
    }

    @Override
    public void fly() {
        flyingBehavior.makeFly();
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}
