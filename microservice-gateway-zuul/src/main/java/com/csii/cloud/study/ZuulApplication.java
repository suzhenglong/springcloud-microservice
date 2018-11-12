package com.csii.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

 /**
  * @Description:默认情况下 zuul会代理所有注册到Eureka Server上的微服务
  *    并且zuul的路由规则如下:
  *    http://Zuul_host:zuul_port/serviceId/** 会被转发到serviceId对应的微服务
  *    zuul 可以使用Ribbon达到负责均衡的效果
  *    zuul 整合了hystrix
  *    @EnableZuulProxy 与springboot Actuator配合使用时 会暴露两个端点 /routes与/filters
  * @author: zhenglongsu@163.com
  * @date: 2018.11.12 15:23
  */
@SpringBootApplication
@EnableZuulProxy
public class ZuulApplication {
  public static void main(String[] args) {
    SpringApplication.run(ZuulApplication.class, args);
  }
}
