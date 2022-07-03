package com.code.dreamer.commerce2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
public class Commerce2Application {

    public static void main(String[] args) {
        SpringApplication.run(Commerce2Application.class , args);
    }

}
