package org.example.creational.Factory;

import org.example.creational.Factory.GraphicalObject.FactoryMethod.BackgroundObjectFactory;
import org.example.creational.Factory.GraphicalObject.SimpleFactory.GraphicalObjectSimpleFactory;
import org.example.creational.Prototype.BackgroundObject;
import org.example.creational.Prototype.GraphicalObject;
import org.example.creational.Prototype.GraphicalObjectType;
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
