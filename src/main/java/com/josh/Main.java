package com.josh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // This tells Spring Boot to start configuring the application
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);  // This line starts the Spring Boot application
    }
}
