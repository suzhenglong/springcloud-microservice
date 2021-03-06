package com.suzl.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class UploadZuulApplication {
  public static void main(String[] args) {
    SpringApplication.run(UploadZuulApplication.class, args);
  }
}
