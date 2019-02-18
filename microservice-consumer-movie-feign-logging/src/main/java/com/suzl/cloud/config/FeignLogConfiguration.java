package com.suzl.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @author: zhenglongsu@163.com
 * @date: 2018.11.08 14:25
 */
@Configuration
public class FeignLogConfiguration {
    @Bean
    Logger.Level feignLoggerLevel() {
        //return Logger.Level.FULL;
        return Logger.Level.BASIC;
    }
}
