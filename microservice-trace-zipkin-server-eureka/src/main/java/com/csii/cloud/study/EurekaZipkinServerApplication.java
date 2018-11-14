package com.csii.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class EurekaZipkinServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(EurekaZipkinServerApplication.class, args);
  }
}
