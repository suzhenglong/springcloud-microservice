package com.csii.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

 /**
  * @Description:
  * @author: zhenglongsu@163.com
  * @date: 2018.11.08 16:10
  */
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class TturbineMqHystrixRibbonConsumerMovieApplication {
  @Bean
  @LoadBalanced
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  public static void main(String[] args) {
    SpringApplication.run(TturbineMqHystrixRibbonConsumerMovieApplication.class, args);
  }
}
