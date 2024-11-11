package com.anasdev.tp2_discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Tp2DiscoveryserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp2DiscoveryserviceApplication.class, args);
    }

}
