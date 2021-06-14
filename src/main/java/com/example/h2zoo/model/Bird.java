package com.example.h2zoo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Bird {

    @Id
    @GeneratedValue
    private Long id;
    private final String name;
    private final String species;
    private final boolean canFly;
    private final String beakShape;

    public Bird(String name, String species, boolean canFly, String beakShape) {
        this.name = name;
        this.species = species;
        this.canFly = canFly;
        this.beakShape = beakShape;
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

    public boolean canFly() {
        return canFly;
    }

    public String getBeakShape() {
        return beakShape;
    }
}
