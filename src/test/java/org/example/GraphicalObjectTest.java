package org.example;

import org.example.Prototype.BackgroundObject;
import org.example.Prototype.GraphicalObject;
import org.example.Prototype.GraphicalObjectRegistry;
import org.example.Prototype.GraphicalObjectType;
import org.junit.Assert;
import org.junit.Test;

public class GraphicalObjectTest {

    GraphicalObjectRegistry registry = new GraphicalObjectRegistry();

    @Test
    public void backgroundObjectCloneNotNull() {
        BackgroundObject prototype = BackgroundObject.builder()
                .x(100)
                .y(200)
                .width(100.0)
                .length(200.0)
                .build();

        BackgroundObject clone = prototype.clone();

        Assert.assertNotNull("Clone not created", clone);
    }

    @Test
    public void backgroundObjectRegistryGetCloneNotNull() {
        BackgroundObject prototype = BackgroundObject.builder()
                .x(100)
                .y(200)
                .width(100.0)
                .length(200.0)
                .build();
        registry.add(prototype.getObjectType(), prototype);

        GraphicalObject clone = registry.get(GraphicalObjectType.BACK_GROUND).clone();

        Assert.assertNotNull("Clone not created", clone);
    }
}
