package com.test.recruitment;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Application entry point
 */
@SpringBootApplication
@Slf4j
public class StartBoot {

    public static void main(String[] args) {
        SpringApplication.run(StartBoot.class, args);
    }

}
