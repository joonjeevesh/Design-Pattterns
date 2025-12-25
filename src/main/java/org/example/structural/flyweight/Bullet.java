package org.example.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Bullet {
    //cannot change values - intrinsic
    private byte[] image;
    private Double weight;
    BulletType type;
    private String color;
    private Double damage;
}
