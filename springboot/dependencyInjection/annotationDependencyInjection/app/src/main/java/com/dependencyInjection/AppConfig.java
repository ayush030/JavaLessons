package com.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.vehicle",
        "com.tyre",
        "com.engine"
})
public class AppConfig {
}