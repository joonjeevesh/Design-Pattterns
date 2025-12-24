package org.example.creational.Factory.GraphicalObject.FactoryMethod;

import org.example.creational.Prototype.ForegroundObject;
import org.example.creational.Prototype.GraphicalObject;

public class ForegroundObjectFactoy implements GraphicalObjectFactory{
    @Override
    public GraphicalObject create() {
        return new ForegroundObject();
    }
}
