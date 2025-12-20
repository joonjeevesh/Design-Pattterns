package org.example.BirdV4;

import org.example.BirdV4.interfaces.IFlyingBehavior;

public class FlappingBehavior implements IFlyingBehavior {

    @Override
    public void makeFly() {
        System.out.println("I AM FL, FL, FLAPPING");
    }
}
