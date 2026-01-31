package engine;

import engine.IfaceEngine;

public class RollsRoyce implements IfaceEngine {
    private String model;
    private String make;
    private String power;
    private String emissionNorms;
    private String cost;

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getMake() {
        return this.make;
    }

    @Override
    public String getPower() {
        return this.power;
    }

    @Override
    public String getEmissionNorms() {
        return this.emissionNorms;
    }

    @Override
    public String getCost() {
        return this.cost;
    }

    @Override
    public String toString() {
        return "RollsRoyce " + this.model  + "[EmissionNorm=" + this.emissionNorms + ", make=" + this.make + ", power=" + this.power + "]";
    }

    // setters for SDI(setter dependecy injection)

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setEmissionNorms(String emissionNorms) {
        this.emissionNorms = emissionNorms;
    }

}