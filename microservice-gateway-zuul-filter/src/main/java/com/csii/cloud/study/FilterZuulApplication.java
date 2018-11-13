package com.csii.cloud.study;

import com.csii.cloud.study.filters.pre.PreRequestLogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

 /**
  * @Description:
  * @author: zhenglongsu@163.com
  * @date: 2018.11.13 10:13
  */
@SpringBootApplication
@EnableZuulProxy
public class FilterZuulApplication {
  public static void main(String[] args) {
    SpringApplication.run(FilterZuulApplication.class, args);
  }

  @Bean
  public PreRequestLogFilter preRequestLogFilter() {
    return new PreRequestLogFilter();
  }
}
