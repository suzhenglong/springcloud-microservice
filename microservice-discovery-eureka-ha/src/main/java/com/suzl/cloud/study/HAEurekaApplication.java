package com.suzl.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

 /**
  * @Description:使用Eureka做服务发现.
  * @author: zhenglongsu@163.com
  * @date: 2018.11.06 15:35
  */
@SpringBootApplication
@EnableEurekaServer
public class HAEurekaApplication {
  public static void main(String[] args) {
    SpringApplication.run(HAEurekaApplication.class, args);
  }
}
