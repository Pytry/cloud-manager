package org.xitikit.cloud.configuration.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigurationProperties
@EnableConfigServer
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigurationServiceApplication {

    public static void main(String[] args) {

        SpringApplication.run(ConfigurationServiceApplication.class, args);
    }
}
