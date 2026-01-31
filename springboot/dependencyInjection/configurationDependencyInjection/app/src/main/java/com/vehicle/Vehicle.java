package com.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.dependencyinjection.VehicleConfig;
import com.engine.IfaceEngine;
import com.tyre.Tyre;

public class Vehicle {
    private IfaceEngine engine;
    private Tyre tyre;

    public Vehicle(IfaceEngine engine, Tyre tyre) {
        this.engine = engine;
        this.tyre = tyre;
    }

    @Override
    public String toString() {
        return this.engine.toString() + " | " + this.tyre.toString();
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(VehicleConfig.class);

        IfaceEngine engine = (IfaceEngine) ctx.getBean("engine");
        Tyre tyre = (Tyre) ctx.getBean("tyre");

        Vehicle vehicle = new Vehicle(engine, tyre);
        System.out.println(vehicle.toString());
    }
}