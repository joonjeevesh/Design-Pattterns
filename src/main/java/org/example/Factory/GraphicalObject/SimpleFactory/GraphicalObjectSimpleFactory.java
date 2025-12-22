package org.example.Factory.GraphicalObject.SimpleFactory;

import org.example.Prototype.BackgroundObject;
import org.example.Prototype.ForegroundObject;
import org.example.Prototype.GraphicalObject;
import org.example.Prototype.GraphicalObjectType;

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
