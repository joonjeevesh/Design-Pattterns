package org.example.behavioural.strategy.behaviour;

public class CarNavigation implements VehicleModeNavigation{
    @Override
    public void navigate(String from, String to) {
        System.out.println("Driving by Car from "+from+" to "+to);
    }
}
