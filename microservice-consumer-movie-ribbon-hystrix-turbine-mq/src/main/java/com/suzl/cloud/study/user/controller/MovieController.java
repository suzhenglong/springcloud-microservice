package com.suzl.cloud.study.user.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.suzl.cloud.study.user.entity.User;

 /**
  * @Description:
  * @author: zhenglongsu@163.com
  * @date: 2018.11.08 16:39
  */
@RestController
public class MovieController {
    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/user/{id}")
    @HystrixCommand(fallbackMethod = "findByIdFallback")
    public User findById(@PathVariable Long id) {
        if (String.valueOf(id).equals("11")) {
            throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
        }
        System.out.println("哈哈哈");
        return this.restTemplate.getForObject("http://MICROSERVICE-PROVIDER-USER/" + id, User.class);
    }

    /**
     * 如需获取导致fallback的原因,只需在fallback方法上添加 Throwable即可
     *
     * @param id
     * @param throwable
     * @return
     */
    private User findByIdFallback(Long id, Throwable throwable) {
        LOGGER.error("进入回退方法,异常", throwable);
        User user = new User();
        user.setId(1L);
        user.setName("默认用户");
        return user;
    }

    @GetMapping("/log-user-instance")
    public void logUserInstance() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("MICROSERVICE-PROVIDER-USER");
        // 打印当前选择的是哪个节点
        MovieController.LOGGER.info("{}:{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
    }
}
