package org.xitikit.cloud.discovery.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableConfigurationProperties
@EnableEurekaServer
@EnableCircuitBreaker
@SpringBootApplication
public class DiscoveryServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(DiscoveryServiceApplication.class, args);
    }
}
