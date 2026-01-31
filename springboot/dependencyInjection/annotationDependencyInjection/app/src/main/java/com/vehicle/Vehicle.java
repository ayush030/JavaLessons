package com.vehicle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.di.AppConfig;
import com.engine.IfaceEngine;
import com.tyre.IfaceTyre;

@Component
public class Vehicle {
    @Autowired
    @Qualifier("ceatTyreBean")
    private IfaceTyre tyre;

    @Autowired
    @Qualifier("rrGhostBean")
    private IfaceEngine engine;

    public String toString() {
        return engine.toString() + " | " + tyre.toString();
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Vehicle rr = ctx.getBean(Vehicle.class);
        System.out.println(rr.toString());
    }
}
