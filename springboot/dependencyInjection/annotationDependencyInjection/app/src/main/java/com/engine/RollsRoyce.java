package com.engine;

import com.engine.IfaceEngine;

public class RollsRoyce implements IfaceEngine {
    private String make;
    private String model;
    private String cost;


    public RollsRoyce(String make, String model, String cost) {
        this.make = make;
        this.model = model;
        this.cost = cost;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public String getCost() {
        return this.cost;
    }

    public String toString(){
        return "Engine > make: " + this.make + " model: " + this.model + " cost: " + this.cost;
    }
}