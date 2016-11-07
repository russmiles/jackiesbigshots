package com.myorg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableFeignClients
@EnableCircuitBreaker
public class BigShotsApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigShotsApplication.class, args);
    }
}
