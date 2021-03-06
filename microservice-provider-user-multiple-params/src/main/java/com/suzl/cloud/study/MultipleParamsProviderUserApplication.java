package com.suzl.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author suzl
 */
@SpringBootApplication
@EnableEurekaClient
public class MultipleParamsProviderUserApplication {
  public static void main(String[] args) {
    SpringApplication.run(MultipleParamsProviderUserApplication.class, args);
  }
}
