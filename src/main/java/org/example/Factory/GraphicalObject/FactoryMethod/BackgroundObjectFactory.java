package org.example.Factory.GraphicalObject.FactoryMethod;

import org.example.Prototype.BackgroundObject;
import org.example.Prototype.GraphicalObject;

public class BackgroundObjectFactory implements GraphicalObjectFactory{
    @Override
    public GraphicalObject create() {
        return new BackgroundObject();
    }
}
