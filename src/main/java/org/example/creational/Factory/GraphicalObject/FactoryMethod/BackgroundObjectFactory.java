package org.example.creational.Factory.GraphicalObject.FactoryMethod;

import org.example.creational.Prototype.BackgroundObject;
import org.example.creational.Prototype.GraphicalObject;

public class BackgroundObjectFactory implements GraphicalObjectFactory{
    @Override
    public GraphicalObject create() {
        return new BackgroundObject();
    }
}
