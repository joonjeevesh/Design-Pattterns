package org.example.structural.flyweight;

public class HeavyBullet {
    //extrinsic - can change values
    private Double x;
    private Double y;
    private Double z;
    private Integer velocity;
    private Double damage;

    //cannot change values - intrinsic
    private byte[] image;
    private Double weight;
    BulletType type;
    private String color;
}
