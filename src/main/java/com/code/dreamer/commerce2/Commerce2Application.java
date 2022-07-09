package com.code.dreamer.commerce2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

@SpringBootApplication
@EnableMongoAuditing
@ConfigurationPropertiesScan
public class Commerce2Application {

    public static void main(String[] args) {
        SpringApplication.run(Commerce2Application.class , args);
    }

}
