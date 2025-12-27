package org.example.behavioural.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;
import org.example.behavioural.strategy.behaviour.VehicleModeNavigation;

@AllArgsConstructor
@Setter
public class Navigator {
    private VehicleModeNavigation vehicleModeNavigation;

    public void navigate(String from, String to) {
        vehicleModeNavigation.navigate(from, to);
    }
}
