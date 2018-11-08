package com.csii.cloud.study;

import com.csii.cloud.config.RibbonConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

 /**
  * @Description:
  * @author: zhenglongsu@163.com
  * @date: 2018.11.07 09:21
  */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "MICROSERVICE-PROVIDER-USER", configuration = RibbonConfiguration.class)
public class CustomizingRibbonConsumerMovieApplication {
  @Bean
  @LoadBalanced
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  public static void main(String[] args) {
    SpringApplication.run(CustomizingRibbonConsumerMovieApplication.class, args);
  }
}
