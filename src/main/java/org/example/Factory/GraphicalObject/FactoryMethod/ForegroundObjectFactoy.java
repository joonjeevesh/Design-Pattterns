package org.example.Factory.GraphicalObject.FactoryMethod;

import org.example.Prototype.ForegroundObject;
import org.example.Prototype.GraphicalObject;

public class ForegroundObjectFactoy implements GraphicalObjectFactory{
    @Override
    public GraphicalObject create() {
        return new ForegroundObject();
    }
}
