package com.engine;

import com.engine.IfaceEngine;

public class RollsRoyce implements IfaceEngine {
    private int cost;
    private int mileage;
    private int power;

    public RollsRoyce(int cost, int mileage, int power) {
        this.cost = cost;
        this.mileage = mileage;
        this.power = power;
    }

    public int getCost() {
        return this.cost;
    }

    public int getMileage() {
        return this.mileage;
    }

    public int getPower() {
        return this.power;
    }

    @Override
    public String toString() {
        return "Engine> cost: " + cost + ", mileage: " + mileage + ", power: " + power;
    }
}