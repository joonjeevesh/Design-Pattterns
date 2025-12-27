package org.example.behavioural.strategy;

import org.example.behavioural.strategy.behaviour.BikeNavigation;
import org.example.behavioural.strategy.behaviour.CarNavigation;

public class Runner {
    public static void main(String[] args) {
        Navigator navigator = new Navigator(new CarNavigation());
        navigator.navigate("Delhi", "Mumbai");

        navigator.setVehicleModeNavigation(new BikeNavigation());
        navigator.navigate("Mumbai", "Goa");
    }
}
