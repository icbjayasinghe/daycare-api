package com.skyhigh.daycareapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.skyhigh.daycareapi.swagger", "com.skyhigh.daycareapi.controller" , "com.skyhigh.daycareapi.config.swagger"})
public class DaycareApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaycareApiApplication.class, args);
    }

}
