package com.csii.cloud.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

 /**
  * @Description:
  * @author: zhenglongsu@163.com
  * @date: 2018.11.13 18:30
  */
@SpringBootApplication
@EnableConfigServer
public class EncryptionConfigServerApplication {
  public static void main(String[] args) {
    SpringApplication.run(EncryptionConfigServerApplication.class, args);
  }
}
