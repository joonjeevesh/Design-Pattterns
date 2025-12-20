package org.example.solidBird.BirdV2;
/*
this will be used ONY to add common fields/methods
in accordance to SRP and OCP but
we are forcing penguin class to fly, violating LSP
*/
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

    public abstract void fly() throws NoSuchMethodException;
}
