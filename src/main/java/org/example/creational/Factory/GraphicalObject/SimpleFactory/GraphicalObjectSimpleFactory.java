package org.example.creational.Factory.GraphicalObject.SimpleFactory;

import org.example.creational.Prototype.BackgroundObject;
import org.example.creational.Prototype.ForegroundObject;
import org.example.creational.Prototype.GraphicalObject;
import org.example.creational.Prototype.GraphicalObjectType;

public class GraphicalObjectSimpleFactory {

    public static GraphicalObject create(GraphicalObjectType type) {
        switch (type) {
            case BACK_GROUND:
                return new BackgroundObject();
            case FORE_GROUND: {
                //some complex object creation logic, if any
                return new ForegroundObject();
            }
        }
        throw new RuntimeException("Invalid type");
    }
}
