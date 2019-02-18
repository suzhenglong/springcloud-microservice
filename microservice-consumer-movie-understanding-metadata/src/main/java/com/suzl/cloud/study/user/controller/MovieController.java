package com.suzl.cloud.study.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.suzl.cloud.study.user.entity.User;

import java.util.List;

/**
 * @Description:
 * @author: zhenglongsu@163.com
 * @date: 2018.11.07 14:25
 */
@RestController
public class MovieController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.restTemplate.getForObject("http://localhost:8500/" + id, User.class);
    }

    /**
     * 查询 microservice-provider-user-my-metadata服务信息并返回
     * @return
     */
    @GetMapping("/user-instance")
    public List<ServiceInstance> showInfo() {
        return discoveryClient.getInstances("microservice-provider-user-my-metadata");
    }


}
