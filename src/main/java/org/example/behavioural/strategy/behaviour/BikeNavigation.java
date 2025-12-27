package org.example.behavioural.strategy.behaviour;

public class BikeNavigation implements VehicleModeNavigation{
    @Override
    public void navigate(String from, String to) {
        System.out.println("Driving by Bike from "+from+" to "+to);
    }
}
