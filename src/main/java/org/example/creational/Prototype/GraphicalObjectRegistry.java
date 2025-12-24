package org.example.creational.Prototype;

import java.util.HashMap;
import java.util.Map;

public class GraphicalObjectRegistry {
    Map<GraphicalObjectType, GraphicalObject> map = new HashMap<>();

    public void add(GraphicalObjectType objectType, GraphicalObject object) {
        map.put(objectType, object);
    }

    public GraphicalObject get(GraphicalObjectType objectType) {
        return this.map.get(objectType);
    }
}
