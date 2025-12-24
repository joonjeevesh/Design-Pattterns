package org.example.creational.Prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ForegroundObject implements GraphicalObject{
    private Integer x;
    private Integer y;

    @Override
    public GraphicalObject clone() {
        return null;
    }
}
