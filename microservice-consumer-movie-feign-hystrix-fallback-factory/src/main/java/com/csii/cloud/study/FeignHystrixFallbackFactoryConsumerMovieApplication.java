package com.csii.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
  * @Description:
  * @author: zhenglongsu@163.com
  * @date: 2018.11.08 11:05
  */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class FeignHystrixFallbackFactoryConsumerMovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignHystrixFallbackFactoryConsumerMovieApplication.class, args);
    }
}
