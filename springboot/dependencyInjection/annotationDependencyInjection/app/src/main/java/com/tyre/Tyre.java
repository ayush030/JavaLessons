package com.tyre;

import com.tyre.IfaceTyre;

public class Tyre implements IfaceTyre {
    private int cost;
    private String model;
    private String grade;

    public Tyre(int cost, String model, String grade) {
        this.cost = cost;
        this.model = model;
        this.grade = grade;
    }

    public int getCost() {
        return this.cost;
    }

    public String getModel() {
        return this.model;
    }

    public String getGrade() {
        return this.grade;
    }

    @Override
    public String toString() {
        return "Tyre> cost: " + this.cost + ", model: " + this.model + ", grade: " + this.grade;
    }
}