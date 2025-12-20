package org.example.BirdV4;

import org.example.BirdV4.interfaces.IFlyingBehavior;

public class GlidingBehavior implements IFlyingBehavior {

    @Override
    public void makeFly() {
        System.out.println("Whee! I am gliding");
    }
}
