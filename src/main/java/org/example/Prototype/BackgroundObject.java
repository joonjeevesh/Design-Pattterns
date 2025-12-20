package org.example.Prototype;

import lombok.*;

import java.util.Collections;
import java.util.List;

@NoArgsConstructor
@Getter
@Setter
public class BackgroundObject implements GraphicalObject{
    private Integer x;
    private Integer y;
    private Double length;
    private Double width;
    private GraphicalObjectType objectType = GraphicalObjectType.BACK_GROUND;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private List<Integer> pixels;

    @Builder
    public BackgroundObject(Integer x, Integer y, Double length, Double width) {
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;

        pixels = someHeavyWork();
    }

    //this is some heavy(compute/api heavy) task
    private List<Integer> someHeavyWork() {
        return Collections.emptyList();
    }

    @Override
    public BackgroundObject clone() {
        BackgroundObject backgroundObject = new BackgroundObject();
        backgroundObject.x = this.x;
        backgroundObject.y = this.y;
        backgroundObject.length = this.length;
        backgroundObject.width = this.width;
        backgroundObject.pixels = this.pixels;
        return backgroundObject;
    }
}
