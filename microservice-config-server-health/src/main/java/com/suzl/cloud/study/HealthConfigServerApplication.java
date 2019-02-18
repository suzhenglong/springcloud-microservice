package com.suzl.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HealthConfigServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(HealthConfigServerApplication.class, args);
  }
}
