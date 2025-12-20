package org.example.solidBird.BirdV4;

import org.example.solidBird.BirdV4.interfaces.Flyable;

/*
Concrete class dependent on another concrete class,
in case sparrow evolves and wants to glide, we will violate OCP
and make changes to this class
Dependency inversion solves this by using Interfaces as concrete classes
will depend on abstraction rather than implementation
No tight coupling
 */
public class Sparrow extends Bird implements Flyable {

    private FlappingBehavior flyingBehavior;

    public Sparrow(Double weight, String beak, FlappingBehavior flyingBehavior) {
        super(weight, beak);
        this.flyingBehavior = flyingBehavior;
    }

    @Override
    public void fly() {
        flyingBehavior.makeFly();
    }
}
