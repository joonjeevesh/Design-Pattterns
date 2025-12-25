package org.example.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Registry<TYPE, OBJECT_TYPE> {

    private Map<TYPE, OBJECT_TYPE> map = new HashMap<>();

    public void add(TYPE type, OBJECT_TYPE object) {
        map.put(type, object);
    }

    public OBJECT_TYPE get(TYPE type) {
        if(!map.containsKey(type)) {
            return null;
        }

        return map.get(type);
    }
}
