package org.example.solidBird.BirdV1;


/*
V1 of Bird class - all functionality together
REASONS to change -
i. add common functionality/fields
ii. adding new bird
iii. modifying existing bird's functionality/fly method
violates both SRP and OCP
 */
public class BirdV1 {
    private Double weight;
    private String beak;
    private BirdType birdType;

    public BirdV1(Double weight, String beak, BirdType birdType) {
        this.weight = weight;
        this.beak = beak;
        this.birdType = birdType;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBeak() {
        return beak;
    }

    public void setBeak(String beak) {
        this.beak = beak;
    }

    public BirdType getBirdType() {
        return birdType;
    }

    public void setBirdType(BirdType birdType) {
        this.birdType = birdType;
    }

    public static BirdV1 sparrow(Double weight, String beak) {
        return new BirdV1(weight, beak, BirdType.SPARROW);
    }

    public static BirdV1 parrot(Double weight, String beak) {
        return new BirdV1(weight, beak, BirdType.PARROT);
    }

    public void fly() {
        if(this.birdType == BirdType.PARROT) {
            System.out.println("Parrot is flying");
        }
        else if(this.birdType == BirdType.SPARROW) {
            System.out.println("Sparrow is flying");
        }
    }
}
