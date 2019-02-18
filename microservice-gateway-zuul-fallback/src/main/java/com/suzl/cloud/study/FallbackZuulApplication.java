package com.suzl.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class FallbackZuulApplication {
  public static void main(String[] args) {
    SpringApplication.run(FallbackZuulApplication.class, args);
  }
}
