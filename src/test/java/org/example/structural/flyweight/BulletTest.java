package org.example.structural.flyweight;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BulletTest {

    private Registry<BulletType, Bullet> bulletRegistry;

    @Before
    public void setup() {
        bulletRegistry = new Registry<>();
    }

    @Test
    public void sameBulletInstance() {
        Bullet bullet = Bullet.builder()
                .image(new byte[100])
                .color("blood red")
                .type(BulletType.MM_9)
                .weight(20.0)
                .damage(10.0)
                .build();

        FlyingBullet bullet1 = FlyingBullet.builder()
                .x(100.0)
                .y(200.0)
                .z(150.0)
                .velocity(0)
                .bullet(bullet)
                .build();

        FlyingBullet bullet2 = FlyingBullet.builder()
                .x(100.0)
                .y(200.0)
                .z(150.0)
                .velocity(0)
                .bullet(bullet)
                .build();

        Assert.assertEquals(bullet1.getBullet(), bullet2.getBullet());
    }

    @Test
    public void bulletRegistryTest() {
        bulletRegistry.add(BulletType.MM_9, Bullet.builder()
                .image(new byte[100])
                .color("blood red")
                .type(BulletType.MM_9)
                .weight(20.0)
                .damage(10.0)
                .build());

        bulletRegistry.add(BulletType.MM_45, Bullet.builder()
                .image(new byte[100])
                .color("chrome")
                .type(BulletType.MM_45)
                .weight(45.0)
                .damage(30.0)
                .build());

        FlyingBullet bullet1 = FlyingBullet.builder()
                .x(100.0)
                .y(200.0)
                .z(150.0)
                .velocity(0)
                .bullet(bulletRegistry.get(BulletType.MM_9))
                .build();

        FlyingBullet bullet2 = FlyingBullet.builder()
                .x(100.0)
                .y(200.0)
                .z(150.0)
                .velocity(0)
                .bullet(bulletRegistry.get(BulletType.MM_45))
                .build();

        Assert.assertNotEquals(bullet1.getBullet(), bullet2.getBullet());
    }
}
