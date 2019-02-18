package com.suzl.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.stream.EnableTurbineStream;

@SpringBootApplication
@EnableTurbineStream
public class MqTurbineApplication {
  public static void main(String[] args) {
    SpringApplication.run(MqTurbineApplication.class, args);
  }
}
