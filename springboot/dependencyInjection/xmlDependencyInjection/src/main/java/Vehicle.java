package vehicle;

import tyre.Tyre;
import engine.IfaceEngine;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Vehicle {
    private IfaceEngine engine;
    private Tyre tyre;


    public Vehicle() {}

    // constructor for CDI(constructor dependency injection)
    public Vehicle(IfaceEngine engine, Tyre tyre) {
        this.engine = engine;
        this.tyre = tyre;
    }

    public void setEngine(IfaceEngine engine) {
        this.engine = engine;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public String toString() {
        return this.engine.toString() + "\n" + this.tyre.toString();
    }

    public static void main(String[] args) {
        // create container of IoC(inversion of control)
        ApplicationContext rootctx = new ClassPathXmlApplicationContext("springContext.xml");

        Vehicle v1 = (Vehicle)rootctx.getBean("SDI");
        Vehicle v2 = (Vehicle)rootctx.getBean("CDI");

        System.out.println(v1.toString());
        System.out.println(v2.toString());
    }
}