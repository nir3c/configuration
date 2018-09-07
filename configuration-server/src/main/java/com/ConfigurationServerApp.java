package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by Nir.
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigurationServerApp {

    public static void main(String[] args) {
        SpringApplication.run(ConfigurationServerApp.class, args);
    }
}
