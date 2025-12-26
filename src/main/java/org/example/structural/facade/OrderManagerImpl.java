package org.example.structural.facade;

public class OrderManagerImpl implements IOrderManager {

    private OrderProcessor orderProcessor;

    @Override
    public void createOrder() {

        //some BL
        orderProcessor.process();
        //some BL
    }
}

//God class - too much happening
//SRP violations, testing, extensibility
