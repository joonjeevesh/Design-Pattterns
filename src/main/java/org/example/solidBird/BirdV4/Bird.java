package org.example.solidBird.BirdV4;

//this will be used to add common fields/methods
public abstract class Bird {
    private Double weight;
    private String beak;

    public Bird(Double weight, String beak) {
        this.weight = weight;
        this.beak = beak;
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
}
