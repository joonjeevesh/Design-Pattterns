package org.example.Factory;

import org.example.Factory.GraphicalObject.FactoryMethod.BackgroundObjectFactory;
import org.example.Factory.GraphicalObject.SimpleFactory.GraphicalObjectSimpleFactory;
import org.example.Prototype.BackgroundObject;
import org.example.Prototype.GraphicalObject;
import org.example.Prototype.GraphicalObjectType;
import org.junit.Assert;
import org.junit.Test;

public class GraphicalObjectFactoryTest {

    @Test
    public void simpleFactoryOutputNotNull() {
        GraphicalObject graphicalObject = GraphicalObjectSimpleFactory.create(GraphicalObjectType.BACK_GROUND);
        Assert.assertNotNull("Factory out of order", graphicalObject);
        Assert.assertTrue("Factory not functioning properly", graphicalObject instanceof BackgroundObject);
    }

    @Test
    public void factoryMethodOutputNotNull() {
        GraphicalObject graphicalObject = new BackgroundObjectFactory().create();
        Assert.assertNotNull("Factory out of order", graphicalObject);
        Assert.assertTrue("Factory not functioning properly", graphicalObject instanceof BackgroundObject);
    }
}
