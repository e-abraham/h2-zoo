package com.example.h2zoo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fish {

    @Id
    @GeneratedValue
    private Long id;
    private final String name;
    private final String species;
    private final String typeOfWater;
    private final double lifeSpan;

    public Fish(String name, String species, String typeOfWater, double lifeSpan) {
        this.name = name;
        this.species = species;
        this.typeOfWater = typeOfWater;
        this.lifeSpan = lifeSpan;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getTypeOfWater() {
        return typeOfWater;
    }

    public double getLifeSpan() {
        return lifeSpan;
    }
}
