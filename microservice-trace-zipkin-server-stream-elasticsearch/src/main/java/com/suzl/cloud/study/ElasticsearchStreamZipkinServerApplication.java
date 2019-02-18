package com.suzl.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ElasticsearchStreamZipkinServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(ElasticsearchStreamZipkinServerApplication.class, args);
  }
}
