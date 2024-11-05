package com.tutul.demosb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSbApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSbApplication.class, args);
        System.out.println("main app is called");
    }

}
