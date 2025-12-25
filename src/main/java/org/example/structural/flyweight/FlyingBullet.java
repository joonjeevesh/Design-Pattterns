package org.example.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder
public class FlyingBullet {
    //extrinsic - can change values
    private Double x;
    private Double y;
    private Double z;
    private Integer velocity;

    private Bullet bullet;
}
