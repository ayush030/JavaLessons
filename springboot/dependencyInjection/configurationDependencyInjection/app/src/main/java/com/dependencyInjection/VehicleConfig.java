package com.dependencyinjection;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import com.engine.IfaceEngine;
import com.tyre.Tyre;
import com.engine.RollsRoyce;

@Configuration
public class VehicleConfig {
    //@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    @Bean
    public IfaceEngine engine(/*String model*/) {
        /*switch (model) {
            case "RRGhost":
                return new RollsRoyce(100, 20 400);
                break;
            case "RRPhantom":
                return new RollsRoyce(200, 15 600);
                break;
        }*/

        return new RollsRoyce(100, 20, 400);
    }

    @Bean
    public Tyre tyre() {
        return new Tyre(30, "CE123", "CEAT");
    }
}