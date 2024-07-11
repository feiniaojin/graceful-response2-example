package com.feiniaojin.gracefuresponse.example;

import com.feiniaojin.gracefulresponse.EnableGracefulResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableGracefulResponse
@SpringBootApplication
public class GRBoot2ExampleApplication {
    public static void main(String[] args) {
        SpringApplication.run(GRBoot2ExampleApplication.class, args);
    }
}